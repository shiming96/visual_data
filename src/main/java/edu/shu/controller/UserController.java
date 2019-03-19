package edu.shu.controller;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import edu.shu.entity.Result;
import edu.shu.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static edu.shu.entity.StatusCode.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method= RequestMethod.POST, value ="/login")
    public Result login(@RequestBody User loginUser, String yzm, HttpServletRequest request) {
        String newYZM = (String) request.getSession().getAttribute("ImgVerificationCodeMark");
        if(!yzm.equals(newYZM)) {
            return new Result(false, ERROR, "验证码不正确");
        } else {
            ActiveXComponent smsg = new ActiveXComponent("Com_SHUPassport.ComClass");
            Dispatch msg = smsg.getObject();
            int checkLogin = Dispatch.call(msg, "CheckLogin", new Variant(loginUser.getsID()), new Variant(loginUser.getsPass())).getInt();
            if(checkLogin == 5 || checkLogin == 6)
                return new Result(false, LOGINERROR, "一卡通验证失败");
            else {
                loginUser.setRole("学校");
                Map<String, String> map = new HashMap<>();
                map.put("sID", loginUser.getsID());
                map.put("role", loginUser.getRole());
                request.getSession().setAttribute(loginUser.getsID(), loginUser);
                return new Result(true, OK, "登陆成功", map);
            }
        }
    }

    /**
     * 用户退出
     * @param sID
     * @param request
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value ="/logout")
    public Result logout(@RequestParam String sID, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute(sID);
        if(user != null) {
            request.getSession().invalidate();
            return new Result(true, OK, "退出成功");
        } else {
            return new Result(false, ERROR, "退出失败");
        }
    }
    /**
     * 核查用户是否在线
     * @param sID
     * @param request
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value ="/checkLogin")
    public Result checkLogin(String sID, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute(sID);
        if(user != null) {
            Map<String, String> map = new HashMap<>();
            map.put("sID", user.getsID());
            map.put("role", user.getRole());
            return new Result(true, OK, "用户在线", map);
        }
        else
            return new Result(false, ERROR, "用户离线");
    }
}

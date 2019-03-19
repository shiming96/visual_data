package edu.shu.controller;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.Result;
import edu.shu.service.XlService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static edu.shu.entity.StatusCode.*;

@RestController
@RequestMapping("/xlsj")
public class XlController {

    @Resource
    private XlService xlServiceImpl;

    /**
     * 条件查询
     * @param queryCriteria
     * @return
     */
    @RequestMapping(method= RequestMethod.POST, value = "/search", produces = "application/json")
    public Result search(@RequestBody QueryCriteria queryCriteria) {
        if(queryCriteria != null) {
            if(queryCriteria.getCollege() == null)
                return new Result(false, ERROR, "学院名称不能为空");
            if(queryCriteria.getDiscipline() == null)
                return new Result(false, ERROR, "专业名称不能为空");
            if(queryCriteria.getGrade() == null) {
                return new Result(false, ERROR, "年级不能为空");
            }
            if(queryCriteria.getStart() == null || queryCriteria.getEnd() == null) {
                return new Result(false, ERROR, "日期不能为空");
            }
            return new Result(true, OK, "查询成功", xlServiceImpl.search(queryCriteria));
        }
        else
            return new Result(false, ERROR, "查询条件不能为空");

    }


    @RequestMapping(method= RequestMethod.GET, value = "/ztby", produces = "application/json")
    public Result selectXX(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", xlServiceImpl.selectXXGet(xymc));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/zs", produces = "application/json")
    public Result selectZS(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", xlServiceImpl.selectZSGet(xymc));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/xs", produces = "application/json")
    public Result selectXS(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", xlServiceImpl.selectXSGet(xymc));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/bs", produces = "application/json")
    public Result selectBS(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", xlServiceImpl.selectBSGet(xymc));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }


    @RequestMapping(method= RequestMethod.GET, value = "/zymc", produces = "application/json")
    public Result selectzy(String xymc,String route) {
        if(xymc != null && route != null) {
                return new Result(true, OK, "查询成功", xlServiceImpl.selectzy(xymc,route));
        }
        return new Result(false, ERROR, "查询名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/nj", produces = "application/json")
    public Result selectnj(String xymc, String zymc) {
        if(xymc != null && zymc != null) {
            return new Result(true, OK, "查询成功", xlServiceImpl.selectnj(xymc, zymc));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/byrq", produces = "application/json")
    public Result selectbyrq(String xymc, String zymc, String route, String nj) {
        if(xymc != null && zymc != null) {
            if("/xlsj/zssj".equals(route))
                return new Result(true, OK, "查询成功", xlServiceImpl.selectbyrq(xymc, zymc,"硕士","专业学位", nj));
            if("/xlsj/xssj".equals(route))
                return new Result(true, OK, "查询成功", xlServiceImpl.selectbyrq(xymc, zymc,"硕士","学术型", nj));
            if("/xlsj/bssj".equals(route))
                return new Result(true, OK, "查询成功", xlServiceImpl.selectbyrq(xymc, zymc,"博士",null, nj));
            if("/xlsj".equals(route))
                return new Result(true, OK, "查询成功", xlServiceImpl.selectbyrq(xymc, zymc,null,null, nj));
        }
        return new Result(false, ERROR, "查询参数不能为空");
    }

}

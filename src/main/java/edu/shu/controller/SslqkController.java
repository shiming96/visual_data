package edu.shu.controller;

import edu.shu.entity.Result;
import edu.shu.entity.QueryCriteria;
import edu.shu.service.SslqkService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

import static edu.shu.entity.StatusCode.*;

@RestController
@RequestMapping("/sysj")
public class SslqkController {

    @Resource
    private SslqkService sslqkServiceImpl;

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
            if(queryCriteria.getYear() == null) {
                return new Result(false, ERROR, "年度不能为空");
            }
            return new Result(true, OK, "查询成功", sslqkServiceImpl.search(queryCriteria));
        }
        else
            return new Result(false, ERROR, "查询条件不能为空");

    }

    /**
     * 生源质量 + 考生来源
     * @param xymc
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/syzl", produces = "application/json")
    public Result selectSYZLAndKSLyGet(String xymc) {
        Map<String, Object> returnData = null;
        if(xymc != null) {
            returnData = new HashMap<>();
            Map<String, Object> lineData = sslqkServiceImpl.selectSYZLGet(xymc);
            Map<String, Object> pieData = sslqkServiceImpl.selectKSLYGet(xymc);
            returnData.put("lineData", lineData);
            returnData.put("pieData", pieData);
            return new Result(true, OK, "查询成功", returnData);
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 生源地区
     * @param xymc
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/sydq", produces = "application/json")
    public Result selectSYDQGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", sslqkServiceImpl.selectSYDQGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 政治面貌
     * @param xymc
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/zzmm", produces = "application/json")
    public Result selectZZMMGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", sslqkServiceImpl.selectZZMMGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 民族情况
     * @param xymc
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/mzqk", produces = "application/json")
    public Result selectMZQKGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", sslqkServiceImpl.selectMZQKGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/nd", produces = "application/json")
    public Result selectND(String xymc, String zymc) {
        if(xymc == null)
            return new Result(false, ERROR, "学院名称不能为空");
        if(zymc == null)
            return new Result(false, ERROR, "专业名称不能为空");
        return new Result(true, OK, "查询成功", sslqkServiceImpl.selectND(xymc, zymc));
    }

    /**
     * 根据学院查询专业
     * @param xymc  学院
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/zymc", produces = "application/json")
    public Result selectzymc(String xymc) {
        if(xymc == null)
            return new Result(false, ERROR, "学院名称不能为空");
        return new Result(true, OK, "查询成功", sslqkServiceImpl.selectzymc(xymc));
    }

}

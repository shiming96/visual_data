package edu.shu.controller;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.Result;
import edu.shu.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static edu.shu.entity.StatusCode.*;

@RestController
@RequestMapping("/kcsj")
public class KcController {

    @Autowired
    private KcService kcServiceImpl;

    @RequestMapping(method= RequestMethod.POST, value = "/search", produces = "application/json")
    public Result search(@RequestBody QueryCriteria queryCriteria) {
        if(queryCriteria != null) {
            return new Result(true, OK, "查询成功", kcServiceImpl.search(queryCriteria));
        }
        else
            return new Result(false, ERROR, "查询条件不能为空");

    }

    @RequestMapping(method= RequestMethod.GET, value = "/ggksj", produces = "application/json")
    public Result selectGgptkGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", kcServiceImpl.selectGgkGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/pyfa", produces = "application/json")
    public Result selectPyfakcGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", kcServiceImpl.selectPyfakcGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/xqkk", produces = "application/json")
    public Result selectXqkkGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", kcServiceImpl.selectXqkkGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/kyxsj", produces = "application/json")
    public Result selectKyxsjGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", kcServiceImpl.selectKyxsjGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/tksj", produces = "application/json")
    public Result selectTksj(String xymc) {
        if(xymc != null)
            return new Result(true, OK, "查询成功", kcServiceImpl.selectTksjGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }


    @RequestMapping(method= RequestMethod.GET, value = "/term", produces = "application/json")
    public Result selectKkbjTerm(String xymc) {
        if(xymc != null)
            return new Result(true, OK, "查询成功", kcServiceImpl.selectTerm(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/tkxx/term", produces = "application/json")
    public Result selectTkxxTerm(String xymc) {
        if(xymc != null)
            return new Result(true, OK, "查询成功", kcServiceImpl.selectTermInTksj(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/nd", produces = "application/json")
    public Result selectNd(String xymc) {
        if(xymc != null)
            return new Result(true, OK, "查询成功", kcServiceImpl.selectNd(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/nj", produces = "application/json")
    public Result selectNj(String xymc) {
        if(xymc != null)
            return new Result(true, OK, "查询成功", kcServiceImpl.selectNj(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }



}

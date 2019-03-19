package edu.shu.controller;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.Result;
import edu.shu.service.CgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static edu.shu.entity.StatusCode.ERROR;
import static edu.shu.entity.StatusCode.OK;

@RestController
@RequestMapping("/cgsj")
public class CgController {

    @Autowired
    private CgService cgServiceImpl;

    @RequestMapping(method= RequestMethod.POST, value = "/search", produces = "application/json")
    public Result search(@RequestBody QueryCriteria queryCriteria) {
        if(queryCriteria != null) {
            return new Result(true, OK, "查询成功", cgServiceImpl.search(queryCriteria));
        }
        else
            return new Result(false, ERROR, "查询条件不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/cgzt", produces = "application/json")
    public Result selectCgztGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cgServiceImpl.selectCgztGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/xnzz", produces = "application/json")
    public Result selectXnzzGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cgServiceImpl.selectXnzzGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/gpcg", produces = "application/json")
    public Result selectGpcgGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cgServiceImpl.selectGpcgGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }


    @RequestMapping(method= RequestMethod.GET, value = "/nd", produces = "application/json")
    public Result selectNd(String xymc, String route) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cgServiceImpl.selectNdByxy(xymc,route));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }
}

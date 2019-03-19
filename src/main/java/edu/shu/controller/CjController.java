package edu.shu.controller;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.Result;
import edu.shu.entity.StuXfzt;
import edu.shu.service.CjService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.EncodingUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static edu.shu.entity.StatusCode.*;

@RestController
@RequestMapping("/cjsj")
public class CjController {

    @Autowired
    private CjService cjServiceImpl;

    @RequestMapping(method= RequestMethod.POST, value = "/search", produces = "application/json")
    public Result search(@RequestBody QueryCriteria queryCriteria) {
        if(queryCriteria != null) {
            return new Result(true, OK, "查询成功", cjServiceImpl.search(queryCriteria));
        }
        else
            return new Result(false, ERROR, "查询条件不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/cjzt", produces = "application/json")
    public Result selectCjztGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cjServiceImpl.selectCjztGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/xfzt", produces = "application/json")
    public Result selectXfztGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cjServiceImpl.selectXfztGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= {RequestMethod.GET,RequestMethod.HEAD}, value = "/xfzt/message", produces = "application/json")
    public Result selectStuXfzt(String xymc, String nj, HttpServletRequest request, HttpServletResponse response) {
        if(xymc == null) {
            return new Result(false, ERROR, "学院名称不能为空");
        }

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("学分未修满学生信息表");

        List<StuXfzt> list = cjServiceImpl.selectStuXfzt(xymc, nj);
        createTitle(sheet, list.size());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String fileName = "未修满学分学生信息表-" + xymc + "-"+ dateFormat.format(new Date()) + ".xls";
        int rowNum = 1;
        for (StuXfzt stuXfzt : list) {
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(stuXfzt.getXh());
            row.createCell(1).setCellValue(stuXfzt.getXm());
            row.createCell(2).setCellValue(stuXfzt.getXymc());
            row.createCell(3).setCellValue(stuXfzt.getCc());
            row.createCell(4).setCellValue(stuXfzt.getHasxf());
            row.createCell(5).setCellValue(stuXfzt.getNeedxf());
            rowNum++;
        }
        response.setContentType("application/octet-stream");
        String userAgent = request.getHeader("USER-AGENT");
        EncodingUtils.contentDisposition(fileName, userAgent, request, response);
        try {
            workbook.write(response.getOutputStream());
            return new Result(true, OK, "下载成功");
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(false, ERROR, "下载失败");
        }
    }

    private void createTitle(HSSFSheet sheet, int size) {
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < size; i++) {
            //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
            sheet.setColumnWidth(i, 10 * 256);
        }
        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("学号");

        cell = row.createCell(1);
        cell.setCellValue("姓名");

        cell = row.createCell(2);
        cell.setCellValue("学院名称");

        cell = row.createCell(3);
        cell.setCellValue("硕士/博士");

        cell = row.createCell(4);
        cell.setCellValue("已修学分");

        cell = row.createCell(5);
        cell.setCellValue("总学分");
    }


    @RequestMapping(method= RequestMethod.GET, value = "/cjyj", produces = "application/json")
    public Result selectCjyjGet(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cjServiceImpl.selectCjyjGet(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }

    @RequestMapping(method= RequestMethod.GET, value = "/nj", produces = "application/json")
    public Result selectNj(String xymc) {
        if(xymc != null) {
            return new Result(true, OK, "查询成功", cjServiceImpl.selectNjByXy(xymc));
        }
        return new Result(false, ERROR, "学院名称不能为空");
    }
}

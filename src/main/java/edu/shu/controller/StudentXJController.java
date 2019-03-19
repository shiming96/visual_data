package edu.shu.controller;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.Result;
import edu.shu.pojo.StudentXJ;
import edu.shu.service.StudentXJService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.EncodingUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static edu.shu.entity.StatusCode.*;

//为该控制器所有方法应用消息转换功能
//告诉spring查找一个消息转换器,将来自客户端的资源表述为对象
@RestController
@RequestMapping("/xjsj")
public class StudentXJController {

    @Resource
    private StudentXJService studentXJServiceImpl;

    /**
     * 条件查询
     * @param queryCriteria
     * @return
     */
    @RequestMapping(method= RequestMethod.POST, value = "/search", produces = "application/json")
    public Result search(@RequestBody QueryCriteria queryCriteria) {
        if(queryCriteria == null)
            return new Result(false, ERROR, "查询条件不能为空");
        return new Result(true, OK, "查询成功", studentXJServiceImpl.search(queryCriteria));
    }

    /**
     * 学籍状态
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/xjzt", produces = "application/json")
    public Result selectXJGet(String xymc) {
        if (xymc != null)
            return new Result(true, OK, "查询成功", studentXJServiceImpl.selectXJGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 校区人数分布
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/xqrsfb", produces = "application/json")
    public Result selectXQRSFB(String xymc) {
        if (xymc != null)
            return new Result(true, OK, "查询成功", studentXJServiceImpl.selectXQRSFBGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 校区人数分布详情
     * @param xq
     * @param xymc
     * @param zymc
     * @param nj
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/xqrsfb/xqrsfbxq", produces = "application/json")
    public Result selectXQRSFBXQ(String xq,String xymc, String zymc, String nj) {
        if(xq == null || xymc == null || zymc == null || nj == null)
            return new Result(false, ERROR, "缺少查询参数");
        return new Result(true, OK, "查询成功", studentXJServiceImpl.selectXQRSFBXQ(xq, xymc, zymc, nj));
    }

    /**
     * 类别数据
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/lbsj", produces = "application/json")
    public Result selectLBSJ(String xymc) {
        if (xymc != null)
            return new Result(true, OK, "查询成功", studentXJServiceImpl.selectLBSJGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 超学制数据
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/cxzsj", produces = "application/json")
    public Result selectCXZSJ(String xymc) {
        if (xymc != null)
            return new Result(true, OK, "查询成功", studentXJServiceImpl.selectCXZSJGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }

    /**
     * 学籍异动
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/xjyd", produces = "application/json")
    public Result selecXJYD(String xymc) {
        if (xymc != null)
            return new Result(true, OK, "查询成功", studentXJServiceImpl.selectXJYDGet(xymc));
        return new Result(false, ERROR, "学院名称不能为空");
    }


    /**
     * 超学制学生信息表格
     * @param xymc
     * @param response
     */
    @RequestMapping(method= {RequestMethod.GET, RequestMethod.HEAD}, value = "/cxzsj/cxzxx")
    public Result selectCXZXX(String xymc, String zymc, HttpServletResponse response, HttpServletRequest request) {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("超学制学生信息表");
        xymc = "学校".equals(xymc) ? null : xymc;
        zymc = "所有专业".equals(zymc) ? null : zymc;

        List<StudentXJ> list = studentXJServiceImpl.selectCXZXX(xymc, zymc);
        createTitle(sheet, list.size());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String fileName = "超学制学生信息-" + (xymc == null ? "上海大学":xymc) + "-" + (zymc == null ? "所有专业" : zymc)+ dateFormat.format(new Date()) + ".xls";
        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        for (StudentXJ studentXJ : list) {
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(studentXJ.getXh());
            row.createCell(1).setCellValue(studentXJ.getXm());
            row.createCell(2).setCellValue(studentXJ.getZymc());
            row.createCell(3).setCellValue(studentXJ.getXymc());
            row.createCell(4).setCellValue(studentXJ.getXz());
            row.createCell(5).setCellValue(studentXJ.getStatus());
            row.createCell(6).setCellValue(studentXJ.getXb());
            row.createCell(7).setCellValue(studentXJ.getCsrq());
            row.createCell(8).setCellValue(studentXJ.getZzmm());
            row.createCell(9).setCellValue(studentXJ.getMz());
            row.createCell(10).setCellValue(studentXJ.getSyd());
            row.createCell(11).setCellValue(studentXJ.getDsxm());
            row.createCell(12).setCellValue(studentXJ.getCc());
            row.createCell(13).setCellValue(studentXJ.getPylb());
            row.createCell(14).setCellValue(studentXJ.getXwlb());
            row.createCell(15).setCellValue(studentXJ.getXkml());
            row.createCell(16).setCellValue(studentXJ.getRxrq());
            row.createCell(17).setCellValue(studentXJ.getZydm());
            row.createCell(18).setCellValue(studentXJ.getXq());
            row.createCell(19).setCellValue(studentXJ.getDsbh());
            row.createCell(20).setCellValue(studentXJ.getXxxs());
            row.createCell(21).setCellValue(studentXJ.getNj());
            row.createCell(22).setCellValue(studentXJ.getYjby());
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

    /**
     * 创建表头
     * @param sheet
     */
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
        cell.setCellValue("专业名称");

        cell = row.createCell(3);
        cell.setCellValue("学院名称");

        cell = row.createCell(4);
        cell.setCellValue("学制");

        cell = row.createCell(5);
        cell.setCellValue("状态");

        cell = row.createCell(6);
        cell.setCellValue("性别");

        cell = row.createCell(7);
        cell.setCellValue("出生日期");

        cell = row.createCell(8);
        cell.setCellValue("政治面貌");

        cell = row.createCell(9);
        cell.setCellValue("民族");

        cell = row.createCell(10);
        cell.setCellValue("生源地");

        cell = row.createCell(11);
        cell.setCellValue("导师姓名");

        cell = row.createCell(12);
        cell.setCellValue("CC");

        cell = row.createCell(13);
        cell.setCellValue("培养类别");

        cell = row.createCell(14);
        cell.setCellValue("学位类别");

        cell = row.createCell(15);
        cell.setCellValue("学科门类");

        cell = row.createCell(16);
        cell.setCellValue("入学日期");

        cell = row.createCell(17);
        cell.setCellValue("专业代码");

        cell = row.createCell(18);
        cell.setCellValue("校区");

        cell = row.createCell(19);
        cell.setCellValue("导师编号");

        cell = row.createCell(20);
        cell.setCellValue("XXXS");

        cell = row.createCell(21);
        cell.setCellValue("年级");

        cell = row.createCell(22);
        cell.setCellValue("预计毕业日期");
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
        return new Result(true, OK, "查询成功", studentXJServiceImpl.selectzymc(xymc));
    }

    /**
     * 根据学院查询学籍异动年度
     * @param xymc  学院
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/nd", produces = "application/json")
    public Result selectnd(String xymc) {
        if(xymc == null)
            return new Result(false, ERROR, "学院名称不能为空");
        return new Result(true, OK, "查询成功", studentXJServiceImpl.selectNd(xymc));
    }


    /**
     * 根据学院和专业查询年级
     * @param xymc  学院
     * @param zymc  专业
     * @return
     */
    @RequestMapping(method= RequestMethod.GET, value = "/nj", produces = "application/json")
    public Result selectnj(String xymc,String zymc) {
        if(xymc == null)
            return new Result(false, ERROR, "学院名称不能为空");
        if(zymc == null)
            return new Result(false, ERROR, "专业名称不能为空");
        return new Result(true, OK, "查询成功", studentXJServiceImpl.selectnj(xymc, zymc));
    }
}

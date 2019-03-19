package edu.shu.service.impl;

import edu.shu.entity.*;
import edu.shu.mapper.StudentXJMapper;
import edu.shu.mapper.ViewCjMapper;
import edu.shu.mapper.ViewDmXsMapper;
import edu.shu.pojo.StudentXJ;
import edu.shu.service.CjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import utils.MathUtil;

import java.math.BigDecimal;
import java.util.*;

@Service
public class CjServiceimpl implements CjService {

    @Autowired
    private ViewCjMapper viewCjMapper;
    @Autowired
    private ViewDmXsMapper viewDmXsMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    public Map<String, Object> search(QueryCriteria queryCriteria) {
        String xymc = queryCriteria.getCollege();   //学院名称
        String route = queryCriteria.getRoute();
        List<String> term = queryCriteria.getTerm();
        String nd = queryCriteria.getYear();
        String grade = queryCriteria.getGrade();
        switch (route) {
            case "/cjsj":
                return selectCjzt(xymc);
            case "/cjsj/xfzt":
                return selectXfzt(xymc, grade);
            case "/cjsj/cjyj":
                return selectCjyj(xymc);
        }
        return null;
    }

    @Override
    public Map<String, Object> selectCjztGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "cjsj").get("cjzt");
        if(map == null) {
            map = selectCjzt(xymc);
            redisTemplate.boundHashOps(xymc + "cjsj").put("cjzt", map);
        }
        return map;
    }

    private Map<String, Object> selectCjzt(String xymc) {
        if (xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");

        Map<String, Object> pieData = new HashMap<>();
        pieData.put("xAxis", Arrays.asList("及格", "不及格"));
        String title = null;
        if ("学校".equals(xymc))
            pieData.put("title", "上海大学在读学生成绩状态");
        else
            pieData.put("title", xymc + "在读学生成绩状态");
        Map<String, Object> series = new HashMap<>();
        series.put("name", "人数");
        List<Integer> data = new ArrayList<>();
        data.add(viewCjMapper.selectCjzt("及格", null, null, xymc));
        data.add(viewCjMapper.selectCjzt("不及格", null, null, xymc));
        series.put("data", data);
        pieData.put("series", series);
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("pieData", pieData);

        Map<String, Object> chartData = new HashMap<>();
        chartData.put("xAxis", Arrays.asList("专硕", "学硕", "博士"));
        if ("学校".equals(xymc))
            chartData.put("title", "上海大学各类别学生不及格数量");
        else
            chartData.put("title", xymc + "各类别学生不及格数量");
        Map<String, Object> series1 = new HashMap<>();
        series1.put("name", "人数");
        List<Integer> data1 = new ArrayList<>();
        int num1 = viewCjMapper.selectCjzt("不及格", "专业学位", "硕士", xymc);
        data1.add(num1);
        int num2 = viewCjMapper.selectCjzt("不及格", "学术型", "硕士", xymc);
        data1.add(num2);
        int num3 = viewCjMapper.selectCjzt("不及格", null, "博士", xymc);
        data1.add(num3);
        series1.put("data", data1);
        chartData.put("series", series1);
        int total1 = viewCjMapper.selectCjzt("总人数", "专业学位", "硕士", xymc);
        int total2 = viewCjMapper.selectCjzt("总人数", "学术型", "硕士", xymc);
        int total3 = viewCjMapper.selectCjzt("总人数", null, "博士", xymc);
        String per1 = MathUtil.ADivideBPercent(BigDecimal.valueOf(num1), BigDecimal.valueOf(total1));
        String per2 = MathUtil.ADivideBPercent(BigDecimal.valueOf(num2), BigDecimal.valueOf(total2));
        String per3 = MathUtil.ADivideBPercent(BigDecimal.valueOf(num3), BigDecimal.valueOf(total3));
        Map<String, String> midMap = new HashMap<>();
        midMap.put("zs", per1);
        midMap.put("xs", per2);
        midMap.put("bs", per3);
        List<Map<String, String>> percent = new ArrayList<>();
        percent.add(midMap);
        chartData.put("percent", percent);
        returnMap.put("chartData", chartData);
        return returnMap;
    }

    @Override
    public Map<String, Object> selectXfztGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "cjsj").get("xfzt");
        if(map == null) {
            map = selectXfzt(xymc, "");
            redisTemplate.boundHashOps(xymc + "cjsj").put("xfzt", map);
        }
        return map;
    }

    private Map<String, Object> selectXfzt(String xymc, String nj) {
        if (xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");

        Map<String, Object> pieData = new HashMap<>();
        List<String> xAxis = Arrays.asList("已修满", "未修满");
        pieData.put("xAxis", xAxis);
        String title = null;
        if ("学校".equals(xymc))
            pieData.put("title", "上海大学在读学生学分状态");
        else
            pieData.put("title", xymc + "在读学生学分状态");
        Map<String, Object> series = new HashMap<>();
        series.put("name", "人数");
        List<Integer> data = new ArrayList<>();
        data.add(viewCjMapper.selectXfzt("修满", xymc, null, null, nj));
        data.add(viewCjMapper.selectXfzt("没修满", xymc, null, null, nj));
        series.put("data", data);
        pieData.put("series", series);
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("pieData", pieData);

        Map<String, Object> mulityData = new HashMap<>();
        if ("学校".equals(xymc))
            mulityData.put("title", "上海大学各类别学生学分状态");
        else
            mulityData.put("title", xymc + "各类别学生学分状态");
        mulityData.put("xAxis", Arrays.asList("专硕", "学硕", "博士"));
        mulityData.put("legend", xAxis);
        List<Integer> data1 = Arrays.asList(
                viewCjMapper.selectXfzt("修满", xymc, "专业学位", "硕士", nj),
                viewCjMapper.selectXfzt("修满", xymc, "学术型", "硕士", nj),
                viewCjMapper.selectXfzt("修满", xymc, null, "博士", nj)
        );
        List<Integer> data2 = Arrays.asList(
                viewCjMapper.selectXfzt("没修满", xymc, "专业学位", "硕士", nj),
                viewCjMapper.selectXfzt("没修满", xymc, "学术型", "硕士", nj),
                viewCjMapper.selectXfzt("没修满", xymc, null, "博士", nj)
        );
        Map<String, Object> midMap1 = new HashMap<>();
        midMap1.put("name", "已修满");
        midMap1.put("data", data1);
        Map<String, Object> midMap2 = new HashMap<>();
        midMap2.put("name", "未修满");
        midMap2.put("data", data2);
        List<Map<String, Object>> series1 = new ArrayList<>();
        series1.add(midMap1);
        series1.add(midMap2);

        mulityData.put("series", series1);
        returnMap.put("mulityData", mulityData);
        return returnMap;
    }

    @Override
    public Map<String, Object> selectCjyjGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "cjsj").get("cjyj");
        if(map == null) {
            map = selectCjyj(xymc);
            redisTemplate.boundHashOps(xymc + "cjsj").put("cjyj", map);
        }
        return map;
    }

    private Map<String, Object> selectCjyj(String xymc) {
        if (xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");
        Map<String, Object> mulityData = new HashMap<>();
        List<String> yAxis = new ArrayList<>();
        mulityData.put("legend", Arrays.asList("超过两门不及格"));
        List<Map<String, Object>> series = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        Map<String, Object> returnMap = new HashMap<>();
        if ("学校".equals(xymc)) {
            mulityData.put("title", "上海大学成绩预警(超过两门不及格)学生人数分布");
            List<String> xy = viewDmXsMapper.selXs();
            xy.stream()
                    .forEach((s) -> {
                        int num = viewCjMapper.selectCjyj(s);
                        if (num > 0) {
                            data.add(num);
                            yAxis.add(s);
                        }
                    });
        } else {
            mulityData.put("title", xymc + "成绩预警(超过两门不及格)学生人数");
            data.add(viewCjMapper.selectCjyj(xymc));
            yAxis.add(xymc);
            List<StuCjyj> tableData = selectStuCjyj(xymc);
            returnMap.put("tableData", tableData);
        }
        mulityData.put("yAxis", yAxis);
        Map<String, Object> midMap = new HashMap<>();
        midMap.put("data", data);
        midMap.put("name", "超过两门不及格");
        series.add(midMap);
        mulityData.put("series", series);
        returnMap.put("mulityData", mulityData);

        return returnMap;
    }

    @Autowired
    private StudentXJMapper studentXJMapper;

    @Override
    public List<StuXfzt> selectStuXfzt(String xymc, String nj) {
        if (xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");

        List<StuXfzt> returnList = new ArrayList<>();
        List<StuXfztInfo> list = viewCjMapper.selectStuXfztInfo(xymc, nj);
        for (StuXfztInfo stuXfztInfo : list) {
            StudentXJ studentXJ = studentXJMapper.selPeoByXh(stuXfztInfo.getXh());
            StuXfzt stu = new StuXfzt.Builder(stuXfztInfo.getXh())
                    .xm(studentXJ.getXm())
                    .cc(studentXJ.getCc())
                    .xymc(studentXJ.getXymc())
                    .hasxf(stuXfztInfo.getHasxf())
                    .needxf(stuXfztInfo.getNeedxf())
                    .build();
            returnList.add(stu);
        }
        return returnList;
    }

    @Override
    public Map<String, List<String>> selectNjByXy(String xymc) {
        List<String> nj = viewCjMapper.selectNjByXy(xymc);
        Map<String, List<String>> map = new HashMap<>();
        map.put("grade", nj);
        return map;
    }

    /**
     * 查询成绩预警的学生信息
     * @param xymc  学院名称
     * @return  成绩预警的学生信息
     */
    private List<StuCjyj> selectStuCjyj(String xymc) {
        if (xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");
        List<StuCjyjInfo> list = viewCjMapper.selectStuCjyjInfo(xymc);
        List<StuCjyj> returnList = new ArrayList<>();
        for (StuCjyjInfo stuCjyjInfo : list) {
            StudentXJ studentXJ = studentXJMapper.selPeoByXh(stuCjyjInfo.getXh());
            StuCjyj stu = new StuCjyj.Builder(stuCjyjInfo.getXh())
                                        .xm(studentXJ.getXm())
                                        .xymc(studentXJ.getXymc())
                                        .cc(studentXJ.getCc())
                                        .num(stuCjyjInfo.getNum())
                                        .build();
            returnList.add(stu);
        }
        return returnList;
    }


}

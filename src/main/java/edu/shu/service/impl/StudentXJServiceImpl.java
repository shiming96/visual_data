package edu.shu.service.impl;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.XjSendDataSimple;
import edu.shu.mapper.StudentXJMapper;
import edu.shu.mapper.ViewXjydMapper;
import edu.shu.pojo.StudentXJ;
import edu.shu.service.StudentXJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import utils.MathUtil;
import utils.XJDataSimpleUtils;
import utils.XJDataUtils;

import java.math.BigDecimal;
import java.util.*;

@Service
public class StudentXJServiceImpl implements StudentXJService {

    @Autowired
    private StudentXJMapper studentXJMapper;
    @Autowired
    private ViewXjydMapper xjydMapper;

    @Override
    public Map search(QueryCriteria queryCriteria) {
        Map<String, Object> returnMap = new HashMap<>();
        switch (queryCriteria.getRoute()) {
            case "/xjsj":
                returnMap.put("mulityData", selXJ(queryCriteria, true,null));
                returnMap.put("chartData", selXJ(queryCriteria, false,null));
                returnMap.put("baoshanData", selXJ(queryCriteria, false,"宝山校区"));
                returnMap.put("yanchangData", selXJ(queryCriteria, false,"延长校区"));
                returnMap.put("jiadingData", selXJ(queryCriteria, false,"嘉定校区"));
                return returnMap;
            case "/xjsj/chaoxuezhi":
                return selCXZSJ(queryCriteria);
            case "/xjsj/yidong":
                return selectXJYD(queryCriteria.getCollege(), queryCriteria.getYear());
            case "/xjsj/leibie":
                returnMap.put("mulityData", selLBSJ(queryCriteria,"总体数据","各类别研究生数据"));
                returnMap.put("chartData", selLBSJ(queryCriteria,"总体比例", "各类别研究生"));
                returnMap.put("pieData1", selLBSJ(queryCriteria,"学位类别", "学位类别"));
                returnMap.put("pieData2", selLBSJ(queryCriteria,"学习形式", "学习形式"));
                returnMap.put("pieData3", selLBSJ(queryCriteria,"硕士学科门类", "硕士学科门类"));
                returnMap.put("pieData4", selLBSJ(queryCriteria,"博士学科门类", "博士学科门类"));
                return returnMap;
            case "/xjsj/xiaoqufenbu":
                returnMap.put("chartData", selXQRSFB(queryCriteria, "学校"));
                returnMap.put("baoshanData", selXQRSFB(queryCriteria, "宝山校区"));
                returnMap.put("yanchangData", selXQRSFB(queryCriteria, "延长校区"));
                returnMap.put("jiadingData", selXQRSFB(queryCriteria, "嘉定校区"));
                return returnMap;
        }
        return null;
    }

    @Override
    public Map<String, Object> selectXJGet(String xymc) {

        Map<String, Object> returnMap = new HashMap<>();
        QueryCriteria queryCriteria = new QueryCriteria();
        queryCriteria.setCollege(xymc);
        queryCriteria.setDiscipline("所有专业");
        returnMap.put("mulityData", selXJ(queryCriteria, true,null));
        returnMap.put("chartData", selXJ(queryCriteria, false,null));
        returnMap.put("baoshanData", selXJ(queryCriteria, false,"宝山校区"));
        returnMap.put("yanchangData", selXJ(queryCriteria, false,"延长校区"));
        returnMap.put("jiadingData", selXJ(queryCriteria, false,"嘉定校区"));

        return returnMap;
    }


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    /**
     * 超学制数据
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectCXZSJGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "xjsj").get("cxzsj");
        //数据库中读取数据并存入缓存
        if(map == null) {
            QueryCriteria queryCriteria = new QueryCriteria();
            queryCriteria.setCollege(xymc);
            queryCriteria.setDiscipline("所有专业");
            map = selCXZSJ(queryCriteria);
            redisTemplate.boundHashOps(xymc + "xjsj").put("cxzsj", map);
        }
        return map;
    }

    @Override
    public Map<String, Object> selectXJYDGet(String xymc) {
        List<String> nd = xjydMapper.selNd();
        return selectXJYD(xymc, nd.get(0));
    }

    private Map<String, Object> selectXJYD(String xymc, String nd) {
        if(xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");
        Map<String, Object> chartData = new HashMap<>();
        List<String> xAxis = xjydMapper.selCategory();
        List<String> removeCate = Arrays.asList("保留入学资格", "出国交流", "复学", "延期毕业", "转导师");
        xAxis.removeIf(removeCate::contains);
        chartData.put("xAxis", xAxis);
        Map<String, Object> series = new HashMap<>();
        series.put("name", "人数");
        List<Integer> data = new ArrayList<>();
        String title = null;
        int total = xjydMapper.selNumByXyAndSomeCate(xymc, removeCate, nd);
        xAxis.forEach((x) -> data.add(xjydMapper.selNumByXyAndcate(xymc, x, nd)));
        series.put("data", data);
        chartData.put("series", series);
        if("学校".equals(xymc)) {
            title = "上海大学" + nd + "年度学籍异动总数(" + total + "次)";
        } else {
            title = xymc + nd + "年度学籍异动总数(" + total + "次)";
        }
        chartData.put("title", title);

        Map<String, Object> map = new HashMap<>();
        map.put("chartData", chartData);

        return map;

    }

    @Override
    public Map<String, Object> selectLBSJGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "xjsj").get("lbsj");
        if(map == null) {
            QueryCriteria queryCriteria = new QueryCriteria();
            queryCriteria.setCollege(xymc);
            queryCriteria.setDiscipline("所有专业");
            map = new HashMap<>();
            map.put("mulityData", selLBSJ(queryCriteria,"总体数据","各类别研究生数据"));
            map.put("chartData", selLBSJ(queryCriteria,"总体比例", "各类别研究生"));
            map.put("pieData1", selLBSJ(queryCriteria,"学位类别", "学位类别"));
            map.put("pieData2", selLBSJ(queryCriteria,"学习形式", "学习形式"));
            map.put("pieData3", selLBSJ(queryCriteria,"硕士学科门类", "硕士学科门类"));
            map.put("pieData4", selLBSJ(queryCriteria,"博士学科门类", "博士学科门类"));
            redisTemplate.boundHashOps(xymc + "xjsj").put("lbsj", map);
        }
        return map;
    }

    @Override
    public Map<String, Object> selectXQRSFBGet(String xymc) {

        QueryCriteria queryCriteria = new QueryCriteria();
        queryCriteria.setCollege(xymc);
        queryCriteria.setDiscipline("所有专业");
        queryCriteria.setGrade("");
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("chartData", selXQRSFB(queryCriteria, "学校"));
        returnMap.put("baoshanData", selXQRSFB(queryCriteria, "宝山校区"));
        returnMap.put("yanchangData", selXQRSFB(queryCriteria, "延长校区"));
        returnMap.put("jiadingData", selXQRSFB(queryCriteria, "嘉定校区"));

        return returnMap;
    }

    @Override
    public List<Map<String, String>> selectXQRSFBXQ(String xq,String xymc, String zymc, String nj) {
        xymc = "学校".equals(xymc) ? null : xymc;
        zymc = "所有专业".equals(zymc) ? null : zymc;
        nj = "".equals(nj) ? null : nj;

        //nj为超学制
        if ("超学制".equals(nj)) {
            nj = null;
            List<Map<String, String>> cxzxxlist = studentXJMapper.selXQRSFBXQ("true", xymc, xq, zymc, nj);
            List<Map<String, String>> returnList = mergeGrade(cxzxxlist);
            for (Map<String, String> map : returnList) {
                map.remove("grade");
                int num = studentXJMapper.selCXZSS("true", xq, map.get("college"), zymc, null);
                map.put("超学制", num + "");
            }
            return returnList;
        }
        //nj不为超学制
        List<Map<String, String>> list = studentXJMapper.selXQRSFBXQ("false", xymc, xq, zymc, nj);
        List<Map<String, String>> cxzlist = studentXJMapper.selXQRSFBXQ("true", xymc, xq, zymc, nj);

        List<Map<String, String>> returnList = mergeGrade(list);

        for (Map<String, String> map : returnList) {
            String str = map.get("grade");
            for (Map<String, String> cxzmap : cxzlist) {
                if (cxzmap.get("college").trim().equals(map.get("college").trim())) {
                    str += "  超学制";
                    break;
                }
            }
            map.put("grade", str);
        }
        for (Map<String, String> midMap : returnList) {
            String grade = midMap.get("grade");
            midMap.remove("grade");
            String[] grades = grade.split("\\s+");
            for (int i = 0; i < grades.length; i++) {
                if(!"超学制".equals(grades[i])) {
                    int num = studentXJMapper.selCXZSS("false", xq, midMap.get("college"), zymc, grades[i]);
                    midMap.put(grades[i], num + "");
                } else {
                    int num = studentXJMapper.selCXZSS("true", xq, midMap.get("college"), zymc, null);
                    midMap.put(grades[i], num + "");
                }
            }
        }
        return returnList;
    }

    @Override
    public List<StudentXJ> selectCXZXX(String xymc,String zymc) {
        return studentXJMapper.selCXZXX(xymc, zymc);
    }

    private Object selXJ(QueryCriteria queryCriteria, boolean isMulity, String xq) {

        List<Integer> arrayList = new ArrayList<>();
        List<Object[]> data = new ArrayList<>();
        String[] legend = {"在读", "休学", "保留学籍"};
        String[] xAxis = {"一年级", "二年级", "三年级", "超学制"};
        String college = null;
        String discipline = null;

        college = queryCriteria.getCollege();
        college = "学校".equals(college) ? null : college;
        discipline = queryCriteria.getDiscipline();
        discipline = "所有专业".equals(discipline) ? null : discipline;
        List<String> top3Nj = studentXJMapper.selTop3nj();
        //学校
        if(isMulity) {
            //在读
            arrayList.add(studentXJMapper.selXJZT("false", "在读", college, top3Nj.get(0), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "在读", college, top3Nj.get(1), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "在读", college, top3Nj.get(2), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("true", "在读", college, null, discipline, xq));
            data.add(arrayList.toArray());

            //休学
            arrayList.clear();
            arrayList.add(studentXJMapper.selXJZT("false", "休学", college, top3Nj.get(0), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "休学", college, top3Nj.get(1), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "休学", college, top3Nj.get(2), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("true", "休学", college, null, discipline, xq));
            data.add(arrayList.toArray());

            //保留学籍
            arrayList.clear();
            arrayList.add(studentXJMapper.selXJZT("false", "保留学籍", college, top3Nj.get(0), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "保留学籍", college, top3Nj.get(1), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("false", "保留学籍", college, top3Nj.get(2), discipline, xq));
            arrayList.add(studentXJMapper.selXJZT("true", "保留学籍", college, null, discipline, xq));
            data.add(arrayList.toArray());


            college = college == null ? "上海大学" : college;
            if(xq == null) {
                return XJDataUtils.dataProcessing(data, xAxis, legend, college);
            } else {
                return XJDataUtils.dataProcessing(data, xAxis, legend, xq);
            }
        }
        //各校区
        else {
            arrayList.add(studentXJMapper.selXJZT(null, "在读", college, null, discipline, xq));
            arrayList.add(studentXJMapper.selXJZT(null, "休学", college, null, discipline, xq));
            arrayList.add(studentXJMapper.selXJZT(null, "保留学籍", college, null, discipline, xq));

            college = college == null ? "上海大学" : college;
            if(xq == null) {
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), legend, college);
            } else {
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), legend, xq);
            }

        }
    }

    private Map selCXZSJ(QueryCriteria queryCriteria) {

        String[] xAxis = {"一年", "二年", "二年以上"};
        List<Integer> arrayList = new ArrayList<>();
        String college = null;
        String discipline = null;

        college = queryCriteria.getCollege();
        college = college.equals("学校") ? null : college;
        discipline = queryCriteria.getDiscipline();
        discipline = "所有专业".equals(discipline) ? null : discipline;

        arrayList.add(studentXJMapper.selCXZSJ(college, discipline, "超期一年"));
        arrayList.add(studentXJMapper.selCXZSJ(college, discipline, "超期二年"));
        arrayList.add(studentXJMapper.selCXZSJ(college, discipline, "超期二年以上"));

        college = college == null ? "上海大学" : college;

        XjSendDataSimple xjSendDataSimple = XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis, college);

        Map<String, Object> returnMap = new HashMap<>();

        returnMap.put("chartData", xjSendDataSimple);

        //查询学院人数
        List<Map<String, Object>> maps = studentXJMapper.selXYRS();


        List<Map<String, String>> returnList = new ArrayList<>();
        college = "上海大学".equals(college) ? "学校" : college;
        if("学校".equals(college)) {
            for (Map<String, Object> map : maps) {
                Map<String,String> middleMap = new HashMap<>();
                middleMap.put("college", map.get("xymc").toString());
                middleMap.put("number", (studentXJMapper.selCXZSJ(map.get("xymc").toString(), discipline, "超期人数") + ""));
                String percent = MathUtil.ADivideBPercent(BigDecimal.valueOf(studentXJMapper.selCXZSJ(map.get("xymc").toString(), discipline, "超期人数")),BigDecimal.valueOf((Integer)map.get("num")));
                middleMap.put("percent", percent);
                middleMap.put("discipline", discipline);
                returnList.add(middleMap);
            }
          //学院
        } else {
            for (Map<String, Object> map : maps) {
                if(college.equals(map.get("xymc"))) {
                    Map<String,String> middleMap = new HashMap<>();
                    middleMap.put("college", map.get("xymc").toString());
                    middleMap.put("number", (studentXJMapper.selCXZSJ(map.get("xymc").toString(), discipline, "超期人数") + ""));
                    String percent = MathUtil.ADivideBPercent(BigDecimal.valueOf(studentXJMapper.selCXZSJ(map.get("xymc").toString(), discipline, "超期人数")),BigDecimal.valueOf((Integer)map.get("num")));
                    middleMap.put("percent", percent);
                    middleMap.put("discipline", discipline);
                    returnList.add(middleMap);
                    break;
                }
            }
        }
        returnMap.put("tableData", returnList);
        return returnMap;
    }

    private Object selLBSJ(QueryCriteria queryCriteria, String category, String title) {
        String[] legend = {"专硕", "学硕", "博士", "留学生硕士", "留学生博士"};
        String[] xAxis = {"一年级", "二年级", "三年级", "超学制"};

        List<Integer> arrayList = new ArrayList<>();
        List<Object[]> data = new ArrayList<>();
        String college = null;

        college = queryCriteria.getCollege();
        college = college.equals("学校") ? null : college;
        List<String> top3Nj = studentXJMapper.selTop3nj();
        switch (category) {
            case "总体数据":
                //专硕
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(0), "专业学位", "硕士", null,null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(1), "专业学位", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(2), "专业学位", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("true", college, null, "专业学位", "硕士", null, null,null));
                data.add(arrayList.toArray());

                //学硕
                arrayList.clear();
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(0), "学术型", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(1), "学术型", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(2), "学术型", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("true", college, null, "学术型", "硕士", null, null,null));
                data.add(arrayList.toArray());

                //博士
                arrayList.clear();
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(0), null, "博士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(1), null, "博士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(2), null, "博士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ("true", college, null, null, "博士", null, null,null));
                data.add(arrayList.toArray());

                //留学生硕士
                arrayList.clear();
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(0), null, "硕士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(1), null, "硕士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(2), null, "硕士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("true", college, null, null, "硕士", null, null,"true"));
                data.add(arrayList.toArray());

                //留学生博士
                arrayList.clear();
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(0), null, "博士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(1), null, "博士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("false", college, top3Nj.get(2), null, "博士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ("true", college, null, null, "博士", null, null,"true"));
                data.add(arrayList.toArray());
                return XJDataUtils.dataProcessing(data, xAxis, legend, title);
            case "总体比例":
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, "专业学位", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, "学术型", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "博士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "硕士", null, null,"true"));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "博士", null, null,"true"));
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), legend, title);
            case "学位类别":
                String[] xAxis1 = {"专硕", "学硕", "博士"};
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, "专业学位", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, "学术型", "硕士", null, null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "博士", null, null,null));
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis1, title);
            case "学习形式":
                String[] xAxis2 = {"全日制硕士", "非全日制硕士", "博士"};
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "硕士", "全日制", null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "硕士", "非全日制", null,null));
                arrayList.add(studentXJMapper.selLBSJ(null, college, null, null, "博士", null, null,null));
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis2, title);
            case "硕士学科门类":
                if(college != null)
                    return Collections.emptyMap();
                List<String> xkml = studentXJMapper.selXKML("硕士");
                List<String> newXKML = new ArrayList<>();
                for (String s : xkml) {
                    if(!s.matches("\\s+"))
                        newXKML.add(s);
                }
                String[] xAxis3 = newXKML.toArray(new String[newXKML.size()]);
                for (String s : newXKML) {
                    arrayList.add(studentXJMapper.selLBSJ(null, null, null, null, "硕士", null, s, null));
                }
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis3, title);
            case "博士学科门类":
                if(college != null)
                    return Collections.emptyMap();
                List<String> xkml1 = studentXJMapper.selXKML("博士");
                List<String> newXKML1 = new ArrayList<>();
                for (String s : xkml1) {
                    if(!s.matches("\\s+"))
                        newXKML1.add(s);
                }
                String[] xAxis4 = newXKML1.toArray(new String[newXKML1.size()]);
                for (String s : newXKML1) {
                    arrayList.add(studentXJMapper.selLBSJ(null, null, null, null, "博士", null, s, null));
                }
                return XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis4, title);
        }
        return Collections.emptyMap();
    }

    private XjSendDataSimple selXQRSFB(QueryCriteria queryCriteria, String category) {

        String[] xAxis = {"硕士男", "硕士女", "博士男", "博士女"};
        List<Integer> arrayList = new ArrayList<>();
        String college = null;
        String discipline = null;
        String grade = null;
        String isCXZ = "false";
        XjSendDataSimple xjSendDataSimple = null;

        college = queryCriteria.getCollege();
        college = college.equals("学校") ? null : college;
        discipline = queryCriteria.getDiscipline();
        discipline = discipline.equals("所有专业") ? null : discipline;
        grade = queryCriteria.getGrade();
        grade = grade.equals("") ? null : grade;
        if("超学制".equals(grade)) {
            grade = null;
            isCXZ = "true";
        }

        category = category.equals("学校") ? null : category;
        arrayList.add(studentXJMapper.selXQRSFB(isCXZ, college, discipline, grade, category, "男", "硕士"));
        arrayList.add(studentXJMapper.selXQRSFB(isCXZ, college, discipline, grade,category, "女", "硕士"));
        arrayList.add(studentXJMapper.selXQRSFB(isCXZ, college, discipline, grade,category, "男", "博士"));
        arrayList.add(studentXJMapper.selXQRSFB(isCXZ, college, discipline, grade,category, "女", "博士"));

        category = category == null ? "上海大学" : category;
        if(college != null && "上海大学".equals(category)) {
            xjSendDataSimple = XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis, college);
        } else {
            xjSendDataSimple = XJDataSimpleUtils.dataProcessing(arrayList.toArray(), xAxis, category);
        }
        return xjSendDataSimple;
    }

    /**
     * 合并grade
     * 例: [{"college":"通信与信息工程学院","grade":"2015"}, {"college":"通信与信息工程学院","grade":"2014"}]  --->  [{"college":"通信与信息工程学院","grade":"2015 2014"}]
     * @param list
     * @return
     */
    private List<Map<String, String>> mergeGrade(List<Map<String, String>> list) {

        Map<String, String> middleMap = null;
        List<Map<String, String>> returnList = new ArrayList<>();
        StringBuilder grade = new StringBuilder();
        String lastCollege = null;

        if(list != null && list.size() > 0) {
            lastCollege = list.get(0).get("college").trim();
            for (Map<String, String> map : list) {
                String college = map.get("college").trim();
                if (college.equals(lastCollege)) {
                    grade.append(map.get("grade")).append(" ");
                } else {
                    middleMap = new HashMap<>();
                    middleMap.put("college", lastCollege);
                    middleMap.put("grade", grade.toString());
                    grade = new StringBuilder(map.get("grade") + " ");
                    returnList.add(middleMap);
                }
                lastCollege = college;
            }
            middleMap = new HashMap<>();
            middleMap.put("college", lastCollege);
            middleMap.put("grade", grade.toString());
            returnList.add(middleMap);
        }
        return returnList;
    }

    @Override
    public Map<String, List<String>> selectzymc(String xymc) {
        List<String> zymc = studentXJMapper.selzymc(xymc);
        Map<String, List<String>> map = new HashMap<>();
        map.put("discipline", zymc);
        return map;
    }

    @Override
    public Map<String, List<String>> selectnj(String xymc, String zymc) {
        if("学校".equals(xymc)) {
            xymc = null;
        }
        if("所有专业".equals(zymc)) {
            zymc = null;
        }
        List<String> nj = studentXJMapper.selnj("false", xymc, zymc);
        if(studentXJMapper.selnj("true",xymc, zymc).size() > 0) {
            nj.add("超学制");
        }
        Map<String, List<String>> map = new HashMap<>();
        map.put("grade", nj);
        return map;
    }

    @Override
    public List<String> selectNd(String xy) {
        if("学校".equals(xy))
            return xjydMapper.selNd();
        else
            return xjydMapper.selNdByXy(xy);
    }

}




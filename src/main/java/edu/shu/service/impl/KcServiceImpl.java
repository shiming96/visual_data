package edu.shu.service.impl;

import edu.shu.entity.QueryCriteria;
import edu.shu.mapper.*;
import edu.shu.pojo.ViewPyfaExample;
import edu.shu.pojo.ViewTkxxExample;
import edu.shu.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import utils.MathUtil;

import java.math.BigDecimal;
import java.util.*;

@Service
public class KcServiceImpl implements KcService {

    @Autowired
    private ViewKkbjMapper viewKkbjMapper;
    @Autowired
    private ViewDmXsMapper viewDmXsMapper;
    @Autowired
    private ViewKcMapper viewKcMapper;
    @Autowired
    private ViewPyfaMapper viewPyfaMapper;
    @Autowired
    private ViewPyjhMapper viewPyjhMapper;
    @Autowired
    private ViewDmKclbMapper viewDmKclbMapper;
    @Autowired
    private KYXXSMapper kyxxsMapper;
    @Autowired
    private ViewTkxxMapper viewTkxxMapper;
    @Autowired
    private ViewDmXqMapper viewDmXqMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 条件查询
     * @param queryCriteria
     * @return
     */
    @Override
    public Map<String, Object> search(QueryCriteria queryCriteria) {
        String xymc = queryCriteria.getCollege();   //学院名称
        String route = queryCriteria.getRoute();
        List<String> term = queryCriteria.getTerm();
        String nd = queryCriteria.getYear();
        String grade = queryCriteria.getGrade();
        switch(route) {
            case "/kcsj":
                String xy = null;
                if("学校".equals(xymc))
                    xy = "上海大学";
                else
                    xy = xymc;
                return selectGgk(xymc, nd, nd + "年度" + xy + "公共课数据");
            case "/kcsj/pyfa":
                return selectPyfakc(xymc,nd);
            case "/kcsj/xqkk":
                return selectXqkk(xymc,term);
            case "/kcsj/kxyxk":
                if("全年级".equals(grade))
                    return selKyxsj(xymc, null);
                else
                    return selKyxsj(xymc, grade);
            case "/kcsj/tksj":
                return selectTksj(xymc, term);
        }
        return null;
    }

    /**
     * 公共平台课数量查询
     * @param xymc
     * @return
     */
    @Override
    public Map<String,Object> selectGgkGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "kcsj").get("ggk");
        if(map == null) {
            List<String> list = selectNd(xymc);
            String title  = "学校".equals(xymc) ? "上海大学" : xymc;
            map = selectGgk(xymc, list.get(0), list.get(0) + "年度"+ title +"公共课数据");
            redisTemplate.boundHashOps(xymc + "kcsj").put("ggk", map);
        } else {
            //从缓存中读取数据
        }
        return map;
    }

    private Map<String, Object> selectGgk(String xymc, String nd, String title) {
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> chartData = new HashMap<>();
        String[] xAxis = {"公共平台课", "公共课", "公共选修课", "创新创业课"};
        List<String> kclx = new ArrayList<>();
        for (String xAxi : xAxis) {
            kclx.add(viewDmKclbMapper.selDmByMc(xAxi));
        }
        chartData.put("xAxis", xAxis);
        chartData.put("title", title);
        Map<String, Object> series = new HashMap<>();
        series.put("name", "门数");
        List<Integer> data = new ArrayList<>();
        data.add(selGgk(kclx.get(0), xymc, nd));
        data.add(selGgk(kclx.get(1), xymc, nd));
        data.add(selGgk(kclx.get(2), xymc, nd));
        data.add(selGgk(kclx.get(3), xymc, nd));
        series.put("data", data);
        chartData.put("series", series);
        returnMap.put("chartData", chartData);

        if("学校".equals(xymc)) {
            Map<String, Object> mulityData = new HashMap<>();
            mulityData.put("legend", xAxis);
            mulityData.put("title", title);
            List<String> yAxis = viewDmXsMapper.selXs();//查询所有学院名称
            mulityData.put("yAxis", yAxis);
            List<Map<String, Object>> list = new ArrayList<>();
            for (int i = 0; i < kclx.size(); i++) {
                Map<String, Object> midMap = new HashMap<>();
                midMap.put("name", xAxis[i]);
                List<Integer> midList = new ArrayList<>();
                for (String yaxis : yAxis) {
                    midList.add(selGgk(kclx.get(i), yaxis, nd));
                }
                midMap.put("data", midList);
                list.add(midMap);
            }
            List<Integer> list1 = (List<Integer>) list.get(0).get("data");
            List<Integer> list2 = (List<Integer>) list.get(1).get("data");
            List<Integer> list3 = (List<Integer>) list.get(2).get("data");
            List<Integer> list4 = (List<Integer>) list.get(3).get("data");
            for (int i1 = 0; i1 < list1.size(); i1++) {
                if(list1.get(i1) == 0 && list2.get(i1) == 0 && list3.get(i1) == 0 && list4.get(i1) == 0) {
                    list1.remove(i1);
                    list2.remove(i1);
                    list3.remove(i1);
                    list4.remove(i1);
                    yAxis.remove(i1);
                    i1--;
                }
            }
            mulityData.put("series", list);
            returnMap.put("mulityData", mulityData);
        }
        return returnMap;
    }


    private int selGgk(String kclx, String xy, String nd) {

        ViewPyfaExample example = new ViewPyfaExample();
        ViewPyfaExample.Criteria criteria = example.createCriteria();
        if(kclx != null && !"".equals(kclx)) {
            criteria.andKclxEqualTo(kclx);
        }
        if(xy != null && !"".equals(xy) && !"学校".equals(xy)) {
            criteria.andXyEqualTo(xy);
        }
        if(nd != null && !"".equals(nd)) {
            criteria.andNdEqualTo(nd);
        }
        example.setDistinct(true);

        return viewPyfaMapper.countByExample(example);
    }

    @Override
    public Map<String, Object> selectPyfakcGet(String xymc) {
        List<String> list = selectNd("学校");
        return selectPyfakc(xymc,list.get(0));
    }

    private Map<String, Object> selectPyfakc(String xymc, String nd) {
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> pieData = new HashMap<>();
        List<String> dm = viewPyfaMapper.selKclbByNd(nd);
        List<Map<String, String>> list = new ArrayList<>();
        List<String> xAxis = new ArrayList<>();
        List<String> kclx = new ArrayList<>();
        List<String> removeCate = Arrays.asList("创新创业课", "专业基础课", "专业选修课", "选修课");
        for (String s : dm) {
            String mc = viewDmKclbMapper.selMcByDm(s);
            if(removeCate.contains(mc)) {
                kclx.add(s);
                xAxis.add(mc);
            }
        }
        pieData.put("xAxis", xAxis);
        Map<String, Object> series = new HashMap<>();
        series.put("name", "门数");
        List<Integer> data = new ArrayList<>();
        kclx.forEach((s) -> data.add(selPyfakc(s, xymc, nd)));
        String title = null;
        //总体培养方案课程数据
//        int total = selPyfakc(null, xymc, nd);
        int total = data.stream().mapToInt(s -> s).sum();
        if("学校".equals(xymc))
            title = "上海大学"+ nd +"年度培养方案课程数据共(" +total+ ")门";
        else
            title = xymc + nd + "年度培养方案课程数据共(" +total+ ")门";
        pieData.put("title", title);
        series.put("data", data);
        pieData.put("series", series);
        returnMap.put("pieData", pieData);

        return returnMap;
    }

    /**
     * 查询培养方案课程
     * @param kclx  课程类别
     * @param xymc  学院名臣
     * @param nd    年度
     * @return
     */
    private int selPyfakc(String kclx, String xymc, String nd) {
        ViewPyfaExample example = new ViewPyfaExample();
        ViewPyfaExample.Criteria criteria = example.createCriteria();
        if(kclx != null && !"".equals(kclx)) {
            criteria.andKclxEqualTo(kclx);
        }
        if(xymc != null && !"".equals(xymc) && !"学校".equals(xymc)) {
            criteria.andXyEqualTo(xymc);
        }
        if(nd != null && !"".equals(nd)) {
            criteria.andNdEqualTo(nd);
        }
        return viewPyfaMapper.countByExample(example);
    }

    @Override
    public Map<String, Object> selectXqkkGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "kcsj").get("xqkksj");
        if(map == null) {
            List<String> term = selectTerm("学校");
            List<String> list = new ArrayList<>();
            list.add(term.get(0) + "学年冬季学期");
            list.add(term.get(0) + "学年春季学期");
            list.add(term.get(0) + "学年秋季学期");
            map = selectXqkk(xymc,list);
            redisTemplate.boundHashOps(xymc + "kcsj").put("xqkksj", map);
        } else {
            //从缓存中读取数据
        }
        return map;
    }

    private Map<String, Object> selectXqkk(String xymc, List<String> term) {
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> kkmc = new HashMap<>();
        Map<String, Object> kkms = new HashMap<>();
        List<String> removeCate = Arrays.asList("创新创业课", "专业基础课", "专业选修课", "选修课");
        List<String> xAxis = viewDmKclbMapper.selKclb();
        List<String> msxAxis = new ArrayList<>(xAxis);
        xAxis.removeIf((s) -> !removeCate.contains(s));
        msxAxis.removeIf((s) -> !removeCate.contains(s));
        Map<String, Object> seriesKkmc = new HashMap<>();
        Map<String, Object> seriesKkms = new HashMap<>();
        seriesKkmc.put("name", "门次");
        seriesKkms.put("name", "门数");
        List<Integer> dataKkmc = new ArrayList<>();
        List<Integer> dataKkms = new ArrayList<>();
        for(int i = 0; i < xAxis.size(); i++) {
            int mc = selxqkk(xymc, xAxis.get(i), term, "门次");
            if(mc == 0) {
                xAxis.remove(i);
                i--;
            } else {
                dataKkmc.add(mc);
            }
        }
        for(int i = 0; i < msxAxis.size(); i++) {
            int ms = selxqkk(xymc, msxAxis.get(i), term, "门数");
            if(ms == 0) {
                msxAxis.remove(i);
                i--;
            } else {
                dataKkms.add(ms);
            }
        }
//        int totalKkmc = selxqkk(xymc, null, term, "门次");
//        int totalKkms = selxqkk(xymc, null, term, "门数");
        int totalKkmc = dataKkmc.stream().mapToInt(s-> s).sum();
        int totalKkms = dataKkms.stream().mapToInt(s-> s).sum();
        if("学校".equals(xymc)) {
            kkmc.put("title", term.get(0).substring(0, 11) + "上海大学开课门次(共"+ totalKkmc + "次)");
            kkms.put("title", term.get(0).substring(0, 11) + "上海大学开课门数(共"+ totalKkms + "门)");
        } else {
            kkmc.put("title", term.get(0).substring(0, 11) + xymc + "开课门次(共"+ totalKkmc + "次)");
            kkms.put("title", term.get(0).substring(0, 11) + xymc + "开课门数(共"+ totalKkms + "门)");
        }
        returnMap.put("kkmc", kkmc);
        returnMap.put("kkms", kkms);
        kkmc.put("xAxis", xAxis);
        kkms.put("xAxis", msxAxis);
        seriesKkmc.put("data", dataKkmc);
        seriesKkms.put("data", dataKkms);
        kkmc.put("series", seriesKkmc);
        kkms.put("series", seriesKkms);


        if("学校".equals(xymc)) {
            Map<String, Object> mulityData = new HashMap<>();
            List<String> legend = new ArrayList<>();
            legend.add("开课门次");
            legend.add("开课门数");
            mulityData.put("legend", legend);
            mulityData.put("title", term.get(0).substring(0, 11) + "学院开课数据");
            List<Map<String, Object>> series = new ArrayList<>();
            series.add(new HashMap<>());
            series.add(new HashMap<>());
            List<Integer> datakkmc = new ArrayList<>();
            List<Integer> datakkms = new ArrayList<>();
            List<String> kkmcPercent = new ArrayList<>();
            List<String> kkmsPercent = new ArrayList<>();
            //获得所有学院
            List<String> yAxis = viewDmXsMapper.selXs();
            mulityData.put("yAxis", yAxis);
            Iterator<String> it = yAxis.iterator();
            while(it.hasNext()) {
                String next = it.next();
                int mc = selxqkk(next, null, term, "门次");
                int ms = selxqkk(next, null, term, "门数");
                if(mc == 0 && ms == 0) {
                    it.remove();
                }
                else {
                    datakkmc.add(mc);
                    datakkms.add(ms);
                    kkmcPercent.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(mc), BigDecimal.valueOf(totalKkmc)));
                    kkmsPercent.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(ms), BigDecimal.valueOf(totalKkms)));
                }
            }
            /*for (String s : yAxis) {
                int mc = selxqkk(s, null, term, "门次");
                int ms = selxqkk(s, null, term, "门数");
                kkmcPercent.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(mc), BigDecimal.valueOf(totalKkmc)));
                kkmsPercent.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(ms), BigDecimal.valueOf(totalKkms)));
            }*/
            series.get(0).put("name", "开课门次");
            series.get(0).put("data", datakkmc);
            series.get(1).put("name", "开课门数");
            series.get(1).put("data", datakkms);
            mulityData.put("series", series);

            List<Map<String, Object>> percent = new ArrayList<>();
            percent.add(new HashMap<>());
            percent.add(new HashMap<>());

            percent.get(0).put("name", "开课门次");
            percent.get(0).put("data", kkmcPercent);
            percent.get(1).put("name", "开课门数");
            percent.get(1).put("data", kkmsPercent);
            mulityData.put("percent", percent);
            returnMap.put("mulityData", mulityData);
        }
        return returnMap;
    }

    /**
     * 学期开课数据
     * @param xymc  学院名称
     * @param kclb   课程类别
     * @param term  学期 + 年度（可选择多个学期  list集合）
     * @param category  开课门次 | 开课门数
     * @return
     */
    private int selxqkk(String xymc, String kclb, List<String> term, String category) {
        if("门次".equals(category)) {
            return viewKkbjMapper.selectkkmc(xymc, kclb, term);
        } else {
            return viewKkbjMapper.selectkkms(xymc, kclb, term);
        }
    }


    @Override
    public Map<String, Object> selectKyxsjGet(String xymc) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "kcsj").get("kyxsj");
        if(map == null) {
            map = selKyxsj(xymc, null);
            redisTemplate.boundHashOps(xymc + "kcsj").put("kyxsj", map);
        }
        return map;
    }

    private Map<String, Object> selKyxsj(String xy, String nj) {
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> pieData = new HashMap<>();
        Map<String, Object> mulityData = new HashMap<>();
        List<String> xAxis = new ArrayList<>();
        //获得kyxxs表中的学院
        List<String> xyAll = kyxxsMapper.selectxy();
        List<String> dm = viewPyjhMapper.selDmByNj(xy, nj);
        List<String> newDm = new ArrayList<>();
        List<String> needCate = Arrays.asList("创新创业课", "专业基础课", "专业选修课", "选修课");
        for (String s : dm) {
            if(!s.matches("\\s*")) {  //匹配0个到多个空格
                String mc = viewDmKclbMapper.selMcByDm(s);
                if(needCate.contains(mc)) {
                    xAxis.add(mc);   //查询当前年级的课程类别
                    newDm.add(s);
                }
            }
        }
        if(newDm.isEmpty()) {
            xAxis.addAll(needCate);
            xAxis.forEach(s -> newDm.add(viewDmKclbMapper.selDmByMc(s)));
        }
        pieData.put("xAxis", xAxis);
        Map<String, Object> series = new HashMap<>();
        series.put("name", "门数");
        List<Integer> data = new ArrayList<>();
        int totalkyxsl = 0;
        if("学校".equals(xy)) {
            newDm.forEach((s) -> data.add(viewPyjhMapper.selKyxxkslAll(s, nj, xyAll)));
//            totalkyxsl = viewPyjhMapper.selKyxxksl(xy, null, nj);
            totalkyxsl = data.stream().mapToInt(s -> s).sum();
            pieData.put("title", "上海大学跨院系选课数据(共" + totalkyxsl + "门)");
        } else {
            newDm.forEach((s) -> data.add(viewPyjhMapper.selKyxxksl(xy, s, nj)));
//            totalkyxsl = viewPyjhMapper.selKyxxksl(xy, null, nj);
            totalkyxsl = data.stream().mapToInt(s -> s).sum();
            pieData.put("title", xy + "跨院系选课数据(共" + totalkyxsl + "门)");
        }
        series.put("data", data);
        pieData.put("series", series);
        mulityData.put("legend", "跨院系选课人数");
        Map<String, Object> seriesM = new HashMap<>();
        seriesM.put("name", "跨院系选课人数");
        List<Integer> dataM = new ArrayList<>();
        List<Map<String, Object>> seriesL = new ArrayList<>();

        int totalNum = 0;


        if("学校".equals(xy)) {
            Map<String, Object> percent = new HashMap<>();
            List<String> yAxis = new ArrayList<>(xyAll);
            totalNum = viewPyjhMapper.selKyxxkrsAll(newDm, nj, yAxis);
            percent.put("name", "跨院系选课人数");
            mulityData.put("yAxis", yAxis);
            List<String> dataP = new ArrayList<>();
            for(int i = 0; i < yAxis.size(); i++) {
                int num = viewPyjhMapper.selKyxxkrs(yAxis.get(i), newDm, nj);
                if(num ==0) {
                    yAxis.remove(i);
                    i--;
                } else {
                    dataM.add(num);
                    dataP.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(num), BigDecimal.valueOf(totalNum)));
                }
            }
            mulityData.put("title", "各学院跨院系选课人数(" + totalNum + "人)");
            percent.put("data", dataP);
            List<Map<String, Object>> seriesP = new ArrayList<>();
            seriesP.add(percent);
            mulityData.put("percent", seriesP);
        } else {
            List<String> yAxis = new ArrayList<>();
            yAxis.add(xy);
            mulityData.put("yAxis", yAxis);
            for (String yaxis : yAxis) {
                int num = viewPyjhMapper.selKyxxkrs(yaxis, newDm, nj);
                dataM.add(num);
            }
            totalNum = dataM.stream().mapToInt(s -> s).sum();
            mulityData.put("title", "各学院跨院系选课人数(" + totalNum + "人)");
        }
        mulityData.put("series", seriesL);
        seriesM.put("data", dataM);
        seriesL.add(seriesM);
        returnMap.put("pieData", pieData);
        returnMap.put("mulityData", mulityData);

        return returnMap;
    }

    /**
     * 调课数据
     * @param xymc  学院名称
     * @return
     */
    @Override
    public Map<String, Object> selectTksjGet(String xymc) {
        List<String> termList = selTermInTksj(xymc);
        String nd = termList.get(0).substring(0, 9);
        //找出当前数据库中最新年度和学期
        List<String> term = new ArrayList<>();
        for (String s : termList) {
            if(s.substring(0, 9).equals(nd))
                term.add(s);
        }
        return selectTksj(xymc, term);
    }

    private List<String> selTermInTksj(String xymc) {
        String yxsh = null;
        if(!"学校".equals(xymc))
            yxsh = viewDmXsMapper.selYxByXymc(xymc);
        List<Integer> termCode = viewTkxxMapper.selectTermCode(yxsh);
        List<String> term = new ArrayList<>();
        for (Integer tc : termCode) {
            term.add(viewDmXqMapper.selXqByTermCode(tc));
        }
        return term;
    }


    private Map<String, Object> selectTksj(String xymc, List<String> term) {

        //获取学期对应的编号
        List<Integer> termcode = new ArrayList<>();
        for (String s : term) {
            String code = viewDmXqMapper.selTermCodeByXq(s);
            //屏蔽没有的学期
            if(code == null)
                termcode.add(0);
            else
                termcode.add(Integer.parseInt(code));
        }

        List<Map<String, Object>> tableData = new ArrayList<>();

        if("学校".equals(xymc)) {
            List<String> yxsh = viewTkxxMapper.selectYxshByTermCode(termcode);
            if(yxsh != null) {
                for (String s : yxsh) {
                    Map<String, Object> map = new HashMap<>();
                    //查询每个学院的调课数量
                    int num = selTksj(s, termcode);
                    map.put("college", viewDmXsMapper.selXyByDm(s));
                    map.put("num", num);
                    tableData.add(map);
                }
            }
            //如果为null，什么都不做，返回空数组
        } else {
            String yxsh = viewDmXsMapper.selYxByXymc(xymc);
            selTksj(yxsh, termcode);
            Map<String, Object> map = new HashMap<>();
            map.put("college", viewDmXsMapper.selXyByDm(yxsh));
            map.put("num", selTksj(yxsh, termcode));
            tableData.add(map);
        }
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("tableData", tableData);

        return returnMap;
    }

    private int selTksj(String yxsh, List<Integer> termcode) {
        ViewTkxxExample example = new ViewTkxxExample();
        ViewTkxxExample.Criteria criteria = example.createCriteria();
        if(yxsh != null && !"".equals(yxsh))
            criteria.andYxshEqualTo(yxsh);
        if(termcode != null && !termcode.isEmpty())
            criteria.andTermcodeIn(termcode);

        return viewTkxxMapper.countByExample(example);
    }

    @Override
    public List<String> selectTermInTksj(String xymc) {
        String yxsh = null;
        if(!"学校".equals(xymc))
            yxsh = viewDmXsMapper.selYxByXymc(xymc);
        List<Integer> termCode = viewTkxxMapper.selectTermCode(yxsh);
        List<String> term = new ArrayList<>();
        for (Integer tc : termCode) {
            term.add(viewDmXqMapper.selXqByTermCode(tc));
        }
        Set<String> newTerm = new HashSet<>();
        term.forEach((s) -> newTerm.add(s.substring(0, 9)));
        List<String> returnList = new ArrayList<>(newTerm);
        returnList.sort((o1,o2) -> Integer.parseInt(o2.substring(0, 4)) - Integer.parseInt(o1.substring(0, 4)));
        return returnList;
    }


    @Override
    public List<String> selectTerm(String xymc) {
        List<String> term = null;
        if("学校".equals(xymc))
            term = viewKkbjMapper.selectAllTerm();
        else {
            term = viewKkbjMapper.selectTerm(selYxByXymc(xymc));
        }
        Set<String> newTerm = new HashSet<>();
        term.forEach((s) -> newTerm.add(s.substring(0, 9)));
        List<String> returnList = new ArrayList<>(newTerm);
        returnList.sort((o1,o2) -> Integer.parseInt(o2.substring(0, 4)) - Integer.parseInt(o1.substring(0, 4)));
        return returnList;
    }

    @Override
    public List<String> selectNd(String xymc) {
        List<String> nd = null;
        if(!"学校".equals(xymc))
            nd = viewPyfaMapper.selectNd(xymc);
        else
            nd = viewPyfaMapper.selectAllNd();
        for(int i = 0; i < nd.size(); i ++) {
            if(nd.get(i).matches("\\s*")) {
                nd.remove(i);
                i--;
            }
        }
        return nd;
    }

    @Override
    public Map<String, List<String>> selectNj(String xymc) {
        List<String> nj = null;
        if(!"学校".equals(xymc))
            nj = viewPyjhMapper.selNj(xymc);
        else
            nj = viewPyjhMapper.selAllNj();
        Map<String, List<String>> map = new HashMap<>();
        map.put("grade", nj);

        return map;
    }
    /**
     * 根据学院名称查询院系代码
     * @param xymc
     */
    private String selYxByXymc(String xymc) {
        if(xymc == null)
            throw new IllegalArgumentException("The argument cannot be null !");
        if(!"学校".equals(xymc))
            return viewDmXsMapper.selYxByXymc(xymc);
        return null;
    }

    /**
     * 根据课程类别查询课程编号
     * @param kclb
     * @return
     */
    private List<String> selKcbhBykclb(String kclb) {
        if(kclb == null)
            throw new IllegalArgumentException("The argument cannot be null !");
        return viewKcMapper.selKcbhBykclb(kclb);
    }

}

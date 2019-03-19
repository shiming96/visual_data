package edu.shu.service.impl;

import edu.shu.entity.QueryCriteria;
import edu.shu.mapper.ViewLxsjMapper;
import edu.shu.pojo.ViewLxsjExample;
import edu.shu.service.CgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MathUtil;

import java.math.BigDecimal;
import java.util.*;

@Service
public class CgServiceImpl implements CgService {

    @Autowired
    private ViewLxsjMapper viewLxsjMapper;

    @Override
    public Map<String, Object> search(QueryCriteria queryCriteria) {
        String xymc = queryCriteria.getCollege();   //学院名称
        String route = queryCriteria.getRoute();
        String nd = queryCriteria.getYear();
        String mc = "学校".equals(xymc) ? "上海大学" : xymc;
        String title = "";
        switch(route) {
            case "/cgsj":
                return selectCgzt(xymc, nd);
            case "/cgsj/xnzz":
                if("".equals(nd))
                    title = mc  + "校内资助出国数据";
                else
                    title = mc  + nd +  "年度校内资助出国数据";
                return selectXnzzOrGpcg(xymc, nd, "学校派出", title);
            case "/cgsj/gpcg":
                if("".equals(nd))
                    title = mc  + "国家公派出国数据";
                else
                    title = mc  + nd +  "年度国家公派出国数据";
                return selectXnzzOrGpcg(xymc, nd, "国家公派", title);
        }
        return null;
    }

    @Override
    public Map<String, Object> selectCgztGet(String xymc) {
        List<String> nd = viewLxsjMapper.selectNdByXy(xymc, null);
        return selectCgzt(xymc, nd.get(0));
    }

    private Map<String, Object> selectCgzt(String xymc, String nd) {
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> pieData = new HashMap<>();
        List<String> xAxis = viewLxsjMapper.selectCglbByXyAndNd(xymc, nd);
        pieData.put("xAxis", xAxis);
        String title = null;
        Map<String, Object> series = new HashMap<>();
        series.put("name", "数量");
        List<Integer> data = new ArrayList<>();
        if("学校".equals(xymc)) {
            if("".equals(nd))
                title = "上海大学出国总体数据";
            else
                title = "上海大学" + nd + "年度出国总体数据";
        } else {
            if("".equals(nd))
                title = xymc + "出国总体数据";
            else
                title = xymc + nd + "年度出国总体数据";
        }
        pieData.put("title", title);
        xAxis.forEach((s) -> data.add(selCgzt(xymc, nd, s)));
        series.put("data", data);
        pieData.put("series", series);

        returnMap.put("pieData", pieData);

        if("学校".equals(xymc)) {
            Map<String, Object> mulityData = new HashMap<>();
            mulityData.put("legend", "出国总体数据");
            List<String> yAxis = viewLxsjMapper.selectXyByNd(nd);
            mulityData.put("title", "各学院出国总体数据");
            mulityData.put("yAxis", yAxis);
            List<Map<String, Object>> seriesP= new ArrayList<>();
            List<Map<String, Object>> percent= new ArrayList<>();
            Map<String, Object> mapP = new HashMap<>();
            Map<String, Object> mapPer = new HashMap<>();
            mapP.put("name", "数量");
            mapPer.put("name", "比例");
            List<Integer> dataP = new ArrayList<>();
            List<String> dataPer = new ArrayList<>();
            int total = selCgzt(null, nd, null);
            yAxis.forEach((s) -> {
                int num = selCgzt(s, nd, null);
                dataP.add(num);
                dataPer.add(MathUtil.ADivideBPercent(BigDecimal.valueOf(num), BigDecimal.valueOf(total)));
            });
            mapP.put("data", dataP);
            mapPer.put("data", dataPer);
            seriesP.add(mapP);
            percent.add(mapPer);
            mulityData.put("series", seriesP);
            mulityData.put("percent", percent);
            returnMap.put("mulityData", mulityData);
        }

        return returnMap;
    }

    private int selCgzt(String xymc, String nd, String lxlb) {
        ViewLxsjExample example = new ViewLxsjExample();
        ViewLxsjExample.Criteria criteria = example.createCriteria();
        if(xymc != null && !"".equals(xymc) && !"学校".equals(xymc))
            criteria.and学院EqualTo(xymc);
        if(nd != null && !"".equals(nd))
            criteria.and派出时间EqualTo(nd);
        if(lxlb != null && !"".equals(lxlb))
            criteria.and留学类别EqualTo(lxlb);
        return viewLxsjMapper.countByExample(example);
    }


    @Override
    public Map<String, Object> selectXnzzGet(String xymc) {
        List<String> nd = viewLxsjMapper.selectNdByXy(xymc, "学校派出");
        String title = "";
        return selectXnzzOrGpcg(xymc, nd.get(0), "学校派出", "上海大学" + nd.get(0) + "年度校内资助出国数据");
    }


    @Override
    public Map<String, Object> selectGpcgGet(String xymc) {
        List<String> nd = viewLxsjMapper.selectNdByXy(xymc,"国家公派");
        return selectXnzzOrGpcg(xymc, nd.get(0), "国家公派", "上海大学" + nd.get(0) + "年度国家公派出国数据");
    }


    private Map<String, Object> selectXnzzOrGpcg(String xymc, String nd, String category, String title) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> chartData = new HashMap<>();
        chartData.put("xAxis", Arrays.asList("专硕", "学硕", "博士"));
        chartData.put("title", title);
        Map<String, Object> series = new HashMap<>();
        series.put("name", "数量");
        List<Integer> data = new ArrayList<>();
        data.add(viewLxsjMapper.selectXnzzOrGpcg(xymc, nd, "硕士", "专业学位", category));
        data.add(viewLxsjMapper.selectXnzzOrGpcg(xymc, nd, "硕士", "学术型", category));
        data.add(viewLxsjMapper.selectXnzzOrGpcg(xymc, nd, "博士", null, category));
        series.put("data", data);
        chartData.put("series", series);

        map.put("chartData", chartData);

        if("学校".equals(xymc)) {
            List<Map<String, Object>> tableData = new ArrayList<>();
            List<String> list = viewLxsjMapper.selectXyByNd(nd);
            list.forEach((s) -> {
                int num = viewLxsjMapper.selectXnzzOrGpcg(s, nd, null, null, category);
                if(num > 0) {
                    Map<String, Object> midMap = new HashMap<>();
                    midMap.put("college", s);
                    midMap.put("num", num);
                    tableData.add(midMap);
                }
            });
            map.put("tableData", tableData);
        }
        return map;
    }

    @Override
    public List<String> selectNdByxy(String xymc, String route) {
        if("/cgsj".equals(route))
            return viewLxsjMapper.selectNdByXy(xymc, null);
        if("/cgsj/xnzz".equals(route))
            return viewLxsjMapper.selectNdByXy(xymc, "学校派出");
        if("/cgsj/gpcg".equals(route))
            return viewLxsjMapper.selectNdByXy(xymc, "国家公派");

        return Collections.emptyList();

    }

}

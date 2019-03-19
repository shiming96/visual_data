package edu.shu.service.impl;

import edu.shu.entity.QueryCriteria;
import edu.shu.mapper.ViewZsSslqkMapper;
import edu.shu.pojo.ViewZsSslqkExample;
import edu.shu.service.SslqkService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class SslqkServiceImpl implements SslqkService {

    @Resource
    private ViewZsSslqkMapper viewZsSslqkMapper;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 条件查询
     * @param queryCriteria
     * @return
     */
    @Override
    public Map<String, Object> search(QueryCriteria queryCriteria) {
        String xymc = queryCriteria.getCollege();   //学院名称
        String zymc = queryCriteria.getDiscipline();    //专业名称
        String nd = queryCriteria.getYear();    //年度
        String route = queryCriteria.getRoute();

        switch(route) {
            case "/sysj":
                Map<String, Object> returnData = new HashMap<>();
                Map<String, Object> pieData = selectKSLY(xymc, zymc, nd);
                returnData.put("pieData", pieData);
                return returnData;
            case "/sysj/sssydq":
                return selectSYDQ(xymc, zymc, nd);
            case "/sysj/zzmm":
                return selectZZMM(xymc, zymc, nd);
            case "/sysj/mzqk":
                //查询民族情况,默认最近六年
                nd = String.valueOf(LocalDateTime.now().getYear());
                return selectMZQK(xymc, zymc, nd);
        }
        return null;
    }

    /**
     * 生源质量
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectSYZLGet(String xymc) {
        List<String> nd = selectND("学校", "所有专业");
        return selectSYZL(xymc, "所有专业", Integer.parseInt(nd.get(0)));
    }

    private Map<String, Object> selectSYZL(String xymc, String zymc, int nd) {

        String[] xAxis = {Integer.toString(nd-5), Integer.toString(nd-4), Integer.toString(nd-3),
                Integer.toString(nd-2), Integer.toString(nd-1), Integer.toString(nd)};
        String[] legend = {"985", "211", "本校"};
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> dataList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dataList.add(new HashMap<>());
        }
        List<Integer> data = new ArrayList<>();


        map.put("legend", legend);
        map.put("xAxis", xAxis);
        map.put("title", "上海大学近六年硕士研究生985·211生源人数统计");

        dataList.get(0).put("name", "985");
        data.add(selIs985(xymc, zymc, Integer.toString(nd - 5)));
        data.add(selIs985(xymc, zymc, Integer.toString(nd - 4)));
        data.add(selIs985(xymc, zymc, Integer.toString(nd - 3)));
        data.add(selIs985(xymc, zymc, Integer.toString(nd - 2)));
        data.add(selIs985(xymc, zymc, Integer.toString(nd - 1)));
        data.add(selIs985(xymc, zymc, Integer.toString(nd)));
        dataList.get(0).put("data", data.toArray());
        data.clear();

        dataList.get(1).put("name", "211");
        data.add(selIs211(xymc, zymc, Integer.toString(nd - 5)));
        data.add(selIs211(xymc, zymc, Integer.toString(nd - 4)));
        data.add(selIs211(xymc, zymc, Integer.toString(nd - 3)));
        data.add(selIs211(xymc, zymc, Integer.toString(nd - 2)));
        data.add(selIs211(xymc, zymc, Integer.toString(nd - 1)));
        data.add(selIs211(xymc, zymc, Integer.toString(nd)));
        dataList.get(1).put("data", data.toArray());
        data.clear();

        dataList.get(2).put("name", "本校");
        data.add(selIsBX(xymc, zymc, Integer.toString(nd - 5)));
        data.add(selIsBX(xymc, zymc, Integer.toString(nd - 4)));
        data.add(selIsBX(xymc, zymc, Integer.toString(nd - 3)));
        data.add(selIsBX(xymc, zymc, Integer.toString(nd - 2)));
        data.add(selIsBX(xymc, zymc, Integer.toString(nd - 1)));
        data.add(selIsBX(xymc, zymc, Integer.toString(nd)));
        dataList.get(2).put("data", data.toArray());

        map.put("data", dataList);
        return map;
    }
    /**
     * 考生来源
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectKSLYGet(String xymc) {
        List<String> nd = selectND("学校", "所有专业");
        return selectKSLY(xymc, "所有专业", nd.get(0));
    }

    private Map<String, Object> selectKSLY(String xymc, String zymc, String nd) {
        List<String> list = selectKSLYLB();
        String[] xAxis = list.toArray(new String[list.size()]);
        Map<String, Object> map = new HashMap<>();
        map.put("xAxis", xAxis);
        String xy = null;
        if("学校".equals(xymc))
            xy = "上海大学";
        else
            xy = xymc;
        if("".equals(nd))
            map.put("title", xy + "硕士考生来源情况统计");
        else
            map.put("title", xy + nd + "年度硕士考生来源情况统计");
        List<Integer> data = new ArrayList<>();
        list.forEach((s) -> data.add(selKSLY(xymc, zymc, nd+"", s)));
        Map<String, Object> midMap = new HashMap<>();
        midMap.put("name", "人数");
        midMap.put("data", data);
        map.put("series", midMap);

        return map;
    }
    /**
     * 生源地区
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectSYDQGet(String xymc) {
        List<String> nd = selectND("学校", "所有专业");
        return selectSYDQ(xymc, "所有专业", nd.get(0));
    }

    private Map<String, Object> selectSYDQ(String xymc, String zymc, String nd) {
        List<String> list = selectSYD();
        Map<String, Object> map = new HashMap<>();
        String xy = null;
        if("学校".equals(xymc))
            xy = "上海大学";
        else
            xy = xymc;
        if("".equals(nd))
            map.put("title", xy + "硕士生源数据");
        else
            map.put("title", xy + nd + "年度硕士生源数据");
        List<Map<String, Object>> result = new ArrayList<>();
        for (String s : list) {
            Map<String, Object> midMap = new HashMap<>();
            midMap.put("name", s);
            midMap.put("value", selSYDQ(xymc, zymc, nd+"", s));
            result.add(midMap);
        }
        map.put("result", result);

        return map;
    }
    /**
     *民族情况
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectMZQKGet(String xymc) {
        List<String> nd = selectND("学校", "所有专业");
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xymc + "sysj").get("mzqk");
        if(map == null) {
            map = selectMZQK(xymc, "所有专业", nd.get(0));
            redisTemplate.boundHashOps(xymc + "sysj").put("mzqk", map);
        } else {
            //从缓存中读取数据
        }
        return map;
    }

    private Map<String, Object> selectMZQK(String xymc, String zymc, String nd) {
        String[] label = {"民族",Integer.toString(Integer.parseInt(nd)-4), Integer.toString(Integer.parseInt(nd)-3),
                Integer.toString(Integer.parseInt(nd)-2), Integer.toString(Integer.parseInt(nd)-1), nd};
        List<String> list = selectMZ(xymc, zymc);
        Map<String, Object> map = new HashMap<>();
        map.put("label", label);
        List<Map<String, Object>> ssData = new ArrayList<>();
        for (String s : list) {
            Map<String, Object> midMap = new HashMap<>();
            for (int i = 1; i < label.length; i++) {
                midMap.put(label[i], selMZQK(xymc, zymc, label[i], s));
            }
            midMap.put("民族", s);
            boolean flag = false;
            for (Map.Entry<String, Object> entry : midMap.entrySet()) {
                if(entry.getValue() instanceof Integer) {
                    if((int)entry.getValue() != 0)
                        flag = true;
                }
            }
            if(flag)
                ssData.add(midMap);
        }
        map.put("ssData", ssData);

        return map;
    }
    /**
     * 硕士政治面貌
     * @param xymc
     * @return
     */
    @Override
    public Map<String, Object> selectZZMMGet(String xymc) {
        List<String> nd = selectND("学校", "所有专业");
        return selectZZMM(xymc, "所有专业", nd.get(0));
    }

    private Map<String, Object> selectZZMM(String xymc, String zymc, String nd) {
//        List<String> list = selectZZMMLB();
        List<String> list = Arrays.asList("农工党党员", "九三学社社员", "民建会员", "共青团员", "群众",
                "无党派人士", "中共党员", "中共预备党员");
        String[] legend = list.toArray(new String[list.size()]);
        Map<String, Object> map = new HashMap<>();
        map.put("legend", legend);
        String xy = null;
        if("学校".equals(xymc))
            xy = "上海大学";
        else
            xy = xymc;
        if("".equals(nd))
            map.put("title", xy + "硕士研究生政治面貌");
        else
            map.put("title", xy + nd + "年度硕士研究生政治面貌");
        List<Map<String, Object>> innerData = new ArrayList<>();
        List<Map<String, Object>> outerData = new ArrayList<>();
        for (String s : legend) {
            Map<String, Object> midMap = new HashMap<>();
            midMap.put("value", selZZMM(xymc, zymc, nd+"", s));
            midMap.put("name", s);
            outerData.add(midMap);
        }
        map.put("outerData", outerData);
        //农工党党员
        Map<String, Object> innerMap4 = new HashMap<>();
        int ngddy = selZZMM(xymc, zymc, nd+"", "农工党党员");
        innerMap4.put("value", ngddy);
        innerMap4.put("name", "农工党党员");
        innerData.add(innerMap4);
        //民主党派
        Map<String, Object> innerMap2 = new HashMap<>();
        int mzdp = selZZMM(xymc, zymc, nd+"", "农工党党员") + selZZMM(xymc, zymc, nd+"", "民建会员") + selZZMM(xymc, zymc, nd+"", "九三学社社员");
        innerMap2.put("value", mzdp);
        innerMap2.put("name", "民主党派");
        innerData.add(innerMap2);
        //其他
        Map<String, Object> innerMap3 = new HashMap<>();
        int other = selZZMM(xymc, zymc, nd+"", "群众") + selZZMM(xymc, zymc, nd+"", "无党派人士") + selZZMM(xymc, zymc, nd+"", "共青团员");
        innerMap3.put("value", other);
        innerMap3.put("name", "其他");
        innerData.add(innerMap3);
        //中国共产党
        Map<String, Object> innerMap1 = new HashMap<>();
        int zggcd = selZZMM(xymc, zymc, nd+"", "中共党员") + selZZMM(xymc, zymc, nd+"", "中共预备党员");
        innerMap1.put("value", zggcd);
        innerMap1.put("name", "中国共产党");
        innerData.add(innerMap1);

        map.put("innerData", innerData);

        return map;
    }
    @Override
    public List<String> selectND(String xymc, String zymc) {
        xymc = "学校".equals(xymc) ? null : xymc;
        zymc = "所有专业".equals(zymc) ? null : zymc;
        List<String> nd = viewZsSslqkMapper.selectND(xymc, zymc);
        //Lambda表达式
        nd.sort((o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
        return nd;

    }

    /**
     * 生源地
     * @return
     */
    private List<String> selectSYD() {
        return viewZsSslqkMapper.selectSYD();
    }

    /**
     * 考生来源类别
     * @return
     */
    private List<String> selectKSLYLB() {
        return viewZsSslqkMapper.selectKSLY();
    }

    /**
     * 政治面貌类别
     * @return
     */
    private List<String> selectZZMMLB() {
        return viewZsSslqkMapper.selectZZMM();
    }

    /**
     * 民族
     * @return
     */
    private List<String> selectMZ(String xymc, String zymc) {
        xymc = "学校".equals(xymc) ? null : xymc;
        zymc = "所有专业".equals(zymc) ? null : zymc;
        return viewZsSslqkMapper.selectMZ(xymc, zymc);
    }

    /**
     * 985人数
     * @param xymc
     * @param zymc
     * @param nd
     * @return
     */
    private int selIs985(String xymc, String zymc, String nd) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        criteria.andIs985EqualTo("1");
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        return viewZsSslqkMapper.countByExample(example);
    }

    /**
     * 211人数
     * @param xymc
     * @param zymc
     * @param nd
     * @return
     */
    private int selIs211(String xymc, String zymc, String nd) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        criteria.andIs211EqualTo("1");
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        return viewZsSslqkMapper.countByExample(example);
    }

    /**
     * 本校人数
     * @param xymc
     * @param zymc
     * @param nd
     * @return
     */
    private int selIsBX(String xymc, String zymc, String nd) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        criteria.and大毕院校EqualTo("上海大学");
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        return viewZsSslqkMapper.countByExample(example);
    }

    /**
     * 考生来源
     * @param xymc
     * @param zymc
     * @param nd
     * @param ksly
     * @return
     */
    private int selKSLY(String xymc, String zymc, String nd, String ksly) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        criteria.and考生来源EqualTo(ksly);
        return viewZsSslqkMapper.countByExample(example);
    }

    /**
     * 生源地人数
     * @param xymc
     * @param zymc
     * @param nd
     * @param syd
     * @return
     */
    private int selSYDQ(String xymc, String zymc, String nd, String syd) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        criteria.and生源地EqualTo(syd);
        return viewZsSslqkMapper.countByExample(example);
    }

    /**
     * 政治面貌
     * @param xymc
     * @param zymc
     * @param nd
     * @param zzmm
     * @return
     */
    private int selZZMM(String xymc, String zymc, String nd, String zzmm) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        criteria.and政治面貌EqualTo(zzmm);
        return viewZsSslqkMapper.countByExample(example);
    }

    private int selMZQK(String xymc, String zymc, String nd, String mz) {
        ViewZsSslqkExample example = new ViewZsSslqkExample();
        ViewZsSslqkExample.Criteria criteria = example.createCriteria();
        if(!"学校".equals(xymc) && xymc != null)
            criteria.and学院名称EqualTo(xymc);
        if(!"所有专业".equals(zymc) && zymc != null)
            criteria.and专业名称EqualTo(zymc);
        if(nd != null && !"".equals(nd))
            criteria.and年度EqualTo(nd);
        criteria.and民族EqualTo(mz);
        return viewZsSslqkMapper.countByExample(example);
    }

    @Override
    public Map<String, List<String>> selectzymc(String xymc) {
        List<String> zymc = viewZsSslqkMapper.selzymc(xymc);
        Map<String, List<String>> map = new HashMap<>();
        map.put("discipline", zymc);
        return map;
    }
}

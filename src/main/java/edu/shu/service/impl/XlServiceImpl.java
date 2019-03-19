package edu.shu.service.impl;

import edu.shu.entity.QueryCriteria;
import edu.shu.mapper.StudentXJMapper;
import edu.shu.mapper.ViewXlMapper;
import edu.shu.pojo.ViewXlExample;
import edu.shu.service.XlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import utils.MathUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XlServiceImpl implements XlService {

    @Autowired
    private StudentXJMapper studentXJMapper;
    @Autowired
    private ViewXlMapper viewXlMapper;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Map<String, Object> search(QueryCriteria queryCriteria) {
        String xy = queryCriteria.getCollege();   //学院名称
        String zy = queryCriteria.getDiscipline();    //专业名称
        String nj = queryCriteria.getGrade();    //年度
        String minByrq = queryCriteria.getStart();
        String maxByrq = queryCriteria.getEnd();
        String route = queryCriteria.getRoute();

        switch(route) {
            case "/xlsj":
                return selectXX(xy, zy, nj, minByrq, maxByrq,null,"总体毕业数据");
            case "/xlsj/zssj":
                return selectXX(xy, zy, nj, minByrq, maxByrq,"专硕","专硕毕业数据");
            case "/xlsj/xssj":
                return selectXX(xy, zy, nj, minByrq, maxByrq,"学硕", "学硕毕业数据");
            case "/xlsj/bssj":
                return selectXX(xy, zy, nj, minByrq, maxByrq,"博士", "博士毕业数据");
        }
        return null;
    }

    /**
     * 总体毕业数据
     * @param xy
     * @return
     */
    @Override
    public Map<String, Object> selectXXGet(String xy) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xy + "xlsj").get("xx");
        if(map == null) {
            map = selectXX(xy, "所有专业", null, null, null,null,"总体毕业数据");
            redisTemplate.boundHashOps(xy + "xlsj").put("xx", map);
        }
        return map;
    }

    /**
     * 专硕
     * @param xy
     * @return
     */
    @Override
    public Map<String, Object> selectZSGet(String xy) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xy + "xlsj").get("zs");
        if(map == null) {
            map = selectXX(xy, "所有专业", null, null, null,"专硕","专硕毕业数据");
            redisTemplate.boundHashOps(xy + "xlsj").put("zs", map);
        }
        return map;
    }

    /**
     * 学硕
     * @param xy
     * @return
     */
    @Override
    public Map<String, Object> selectXSGet(String xy) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xy + "xlsj").get("xs");
        if(map == null) {
            map = selectXX(xy, "所有专业", null, null, null,"学硕", "学硕毕业数据");
            redisTemplate.boundHashOps(xy + "xlsj").put("xs", map);
        }
        return map;
    }

    /**
     * 博士
     * @param xy
     * @return
     */
    @Override
    public Map<String, Object> selectBSGet(String xy) {
        Map<String, Object> map = (Map<String, Object>) redisTemplate.boundHashOps(xy + "xlsj").get("bs");
        if(map == null) {
            map = selectXX(xy, "所有专业", null, null, null,"博士", "博士毕业数据");
            redisTemplate.boundHashOps(xy + "xlsj").put("bs", map);
        }
        return map;
    }

    /**
     * 毕业结业数据
     * @param xy
     * @param zy
     * @param nj
     * @param minByrq
     * @param maxByrq
     * @return
     */
    private Map<String, Object> selectXX(String xy,String zy, String nj, String minByrq, String maxByrq, String category,String title) {
        String[] xAxis = {"毕业", "结业"};
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, Object> pieData = new HashMap<>();
        List<Map<String, Object>> tableData = new ArrayList<>();
        pieData.put("xAxis", xAxis);

        Map<String, Object> midMap = new HashMap<>();
        midMap.put("name", "人数");
        List<Integer> data = new ArrayList<>();
        Map<String, Integer> dataMap = selbjyjlNum(xy, zy, nj, minByrq, maxByrq,category);
        data.add(dataMap.get("毕业人数"));
        data.add(dataMap.get("结业人数"));
        midMap.put("data", data);
        pieData.put("series", midMap);

        returnMap.put("pieData", pieData);
        //权限控制
        if("学校".equals(xy)) {
            pieData.put("title", "上海大学" + title);
            List<String> college = viewXlMapper.selxy();
            for (String s : college) {
                Map<String, Integer> map = selbjyjlNum(s, zy, nj, minByrq, maxByrq, category);
                int num = map.get("毕业人数") + map.get("结业人数");
                if( num > 0) {
                    Map<String, Object> smap = new HashMap<>();
                    smap.put("college", s);
                    smap.put("yibiye", num);
                    smap.put("yingbiye", map.get("总人数"));
                    smap.put("percent", MathUtil.ADivideBPercent(BigDecimal.valueOf(num), BigDecimal.valueOf(map.get("总人数"))));
                    tableData.add(smap);
                }
            }
        } else {
            pieData.put("title", xy + title);
            Map<String, Object> smap = new HashMap<>();
            smap.put("college", xy);
            smap.put("yibiye", dataMap.get("毕业人数") + dataMap.get("结业人数"));
            smap.put("yingbiye", dataMap.get("总人数"));
            smap.put("percent", MathUtil.ADivideBPercent(BigDecimal.valueOf(dataMap.get("毕业人数") + dataMap.get("结业人数")), BigDecimal.valueOf(dataMap.get("总人数"))));
            tableData.add(smap);
        }
        returnMap.put("tableData", tableData);
        return returnMap;
    }

    @Override
    public Map<String, List<String>> selectzy(String xy, String route) {
        Map<String, List<String>> map = new HashMap<>();
        xy = "学校".equals(xy) ? null : xy;
        List<String> zy = viewXlMapper.selzy(xy);
        List<String> newZy = new ArrayList<>();

        if("/xlsj".equals(route)) {
            map.put("discipline", zy);
            return map;
        }
        else if("/xlsj/zssj".equals(route)) {
            for (String s : zy) {
                int num = selzyByCategory(xy, s, "专硕");
                if(num > 0)
                    newZy.add(s);
            }
        }
        else if("/xlsj/xssj".equals(route)) {
            for (String s : zy) {
                int num = selzyByCategory(xy, s, "学硕");
                if(num > 0)
                    newZy.add(s);
            }
        }
        else if("/xlsj/bssj".equals(route)) {
            for (String s : zy) {
                int num = selzyByCategory(xy, s, "博士");
                if(num > 0)
                    newZy.add(s);
            }
        }
        map.put("discipline", newZy);
        return map;
    }

    @Override
    public Map<String, List<String>> selectnj(String xy, String zy) {
        xy = "学校".equals(xy) ? null : xy;
        zy = "所有专业".equals(zy) ? null : zy;
        List<String> nj = viewXlMapper.selnj(xy, zy);
        Map<String, List<String>> map = new HashMap<>();
        map.put("grade", nj);
        return map;
    }

    @Override
    public Map<String, String> selectbyrq(String xy, String zy,String CC, String xwlb, String nj) {
        xy = "学校".equals(xy) ? null : xy;
        zy = "所有专业".equals(zy) ? null : zy;
        String maxByrq = viewXlMapper.selMaxbyrq(xy, zy, CC, xwlb, nj);
        String minByrq = viewXlMapper.selMinbyrq(xy, zy, CC, xwlb, nj);
        Map<String, String> map = new HashMap<>();
        map.put("end", maxByrq);
        map.put("start", minByrq);
        return map;
    }



    /**
     *  全校数据，分类别数据:专硕  学硕   博士
     * @param xy
     * @param zy
     * @param nj
     * @param minByrq
     * @param maxByrq
     * @param category
     * @return
     */
    private Map<String, Integer> selbjyjlNum(String xy, String zy,String nj, String minByrq, String maxByrq,String category) {
        ViewXlExample example1 = new ViewXlExample();
        ViewXlExample.Criteria criteria1 = example1.createCriteria();
        if(!"学校".equals(xy))
            criteria1.andXyEqualTo(xy);
        if(!"所有专业".equals(zy))
            criteria1.andZyEqualTo(zy);
        if( nj != null && !"".equals(nj))
            criteria1.andNjEqualTo(nj);
        if((minByrq != null && !"".equals(minByrq)) && (maxByrq != null && !"".equals(maxByrq)))
            criteria1.andByrqBetween(minByrq, maxByrq);
        if(category != null && !"".equals(category)) {
            if("专硕".equals(category)) {
                criteria1.andCcEqualTo("硕士");
                criteria1.andXwlbEqualTo("专业学位");
            }
            else if("学硕".equals(category)) {
                criteria1.andCcEqualTo("硕士");
                criteria1.andXwlbEqualTo("学术型");
            }
            else if("博士".equals(category)) {
                criteria1.andCcEqualTo("博士");
            }
        }
        criteria1.andBjyjlEqualTo("毕业");
        int byNum = viewXlMapper.countByExample(example1);

        ViewXlExample example2 = new ViewXlExample();
        ViewXlExample.Criteria criteria2 = example2.createCriteria();
        if(!"学校".equals(xy))
            criteria2.andXyEqualTo(xy);
        if(!"所有专业".equals(zy))
            criteria2.andZyEqualTo(zy);
        if( nj != null && !"".equals(nj))
            criteria2.andNjEqualTo(nj);
        if((minByrq != null && !"".equals(minByrq)) && (maxByrq != null && !"".equals(maxByrq)))
            criteria2.andByrqBetween(minByrq, maxByrq);
        if(category != null && !"".equals(category)) {
            if("专硕".equals(category)) {
                criteria2.andCcEqualTo("硕士");
                criteria2.andXwlbEqualTo("专业学位");
            }
            else if("学硕".equals(category)) {
                criteria2.andCcEqualTo("硕士");
                criteria2.andXwlbEqualTo("学术型");
            }
            else if("博士".equals(category)) {
                criteria2.andCcEqualTo("博士");
            }
        }
        criteria2.andBjyjlEqualTo("结业");
        int jyNum = viewXlMapper.countByExample(example2);
        int xjNum = 0;
        if(category == null)
            xjNum = studentXJMapper.selNumByNj(xy, zy, nj, null,null, minByrq, maxByrq);
        else if("专硕".equals(category))
            xjNum = studentXJMapper.selNumByNj(xy, zy, nj, "硕士","专业学位", minByrq, maxByrq);
        else if("学硕".equals(category))
            xjNum = studentXJMapper.selNumByNj(xy, zy, nj, "硕士","学术型", minByrq, maxByrq);
        else if("博士".equals(category))
            xjNum = studentXJMapper.selNumByNj(xy, zy, nj, "博士",null, minByrq, maxByrq);

        int allNum = byNum + jyNum + xjNum;
        Map<String, Integer> map = new HashMap<>();
        map.put("毕业人数", byNum);
        map.put("结业人数", jyNum);
        map.put("总人数", allNum);
        return map;
    }

    private int selzyByCategory(String xy, String zy,String category) {
        ViewXlExample example = new ViewXlExample();
        ViewXlExample.Criteria criteria = example.createCriteria();
        if(!"学校".equals(xy))
            criteria.andXyEqualTo(xy);
        if(!"所有专业".equals(zy))
            criteria.andZyEqualTo(zy);
        if(category != null && !"".equals(category)) {
            if("专硕".equals(category)) {
                criteria.andCcEqualTo("硕士");
                criteria.andXwlbEqualTo("专业学位");
            }
            else if("学硕".equals(category)) {
                criteria.andCcEqualTo("硕士");
                criteria.andXwlbEqualTo("学术型");
            }
            else if("博士".equals(category)) {
                criteria.andCcEqualTo("博士");
            }
        }
        return viewXlMapper.countByExample(example);
    }

}

package edu.shu.service;

import edu.shu.entity.QueryCriteria;

import java.util.List;
import java.util.Map;

public interface KcService {

    Map<String, Object> search(QueryCriteria queryCriteria);

    //公共课数据
    Map<String, Object> selectGgkGet(String xymc);

    //培养方案课程数据
    Map<String, Object> selectPyfakcGet(String xymc);

    //学期开课数据
    Map<String, Object> selectXqkkGet(String xymc);

    //跨院系数据
    Map<String, Object> selectKyxsjGet(String xymc);

    //调课数据
    Map<String, Object> selectTksjGet(String xymc);

    //查询调课数据中的termcode
    List<String> selectTermInTksj(String xymc);

    //查询课程排课表中的学期 + 年度
    List<String> selectTerm(String xymc);


    //查询培养方案中的年度
    List<String> selectNd(String xymc);


    //查询培养计划中的年级
    Map<String, List<String>> selectNj(String xymc);
}

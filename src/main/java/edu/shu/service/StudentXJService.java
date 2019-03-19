package edu.shu.service;

import edu.shu.pojo.StudentXJ;
import edu.shu.entity.QueryCriteria;

import java.util.List;
import java.util.Map;

public interface StudentXJService {

    Map search(QueryCriteria queryCriteria);

    Map<String, Object> selectXJGet(String xymc);

    Map<String, Object> selectXQRSFBGet(String xymc);

    Map<String, Object> selectLBSJGet(String xymc);

    Map<String, Object> selectCXZSJGet(String xymc);

    Map<String, Object> selectXJYDGet(String xymc);

    List<Map<String, String>> selectXQRSFBXQ(String xq,String xymc, String zymc, String nj);

    List<StudentXJ> selectCXZXX(String xymc, String zymc);

    Map<String, List<String>> selectzymc(String xymc);

    Map<String, List<String>> selectnj(String xymc, String zymc);

    List<String> selectNd(String xy);



}

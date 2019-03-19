package edu.shu.service;

import edu.shu.entity.QueryCriteria;

import java.util.List;
import java.util.Map;

public interface SslqkService {


    Map<String, Object> search(QueryCriteria queryCriteria);

    Map<String, Object> selectSYZLGet(String xymc);
    Map<String, Object> selectKSLYGet(String xymc);

    Map<String, Object> selectSYDQGet(String xymc);
    Map<String, Object> selectMZQKGet(String xymc);

    Map<String, Object> selectZZMMGet(String xymc);

    List<String> selectND(String xymc, String zymc);

    Map<String, List<String>> selectzymc(String xymc);

}

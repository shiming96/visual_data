package edu.shu.service;

import edu.shu.entity.QueryCriteria;

import java.util.List;
import java.util.Map;

public interface CgService {

    Map<String, Object> search(QueryCriteria queryCriteria);

    //出国总体
    Map<String, Object> selectCgztGet(String xymc);
    //校内资助
    Map<String, Object> selectXnzzGet(String xymc);
    //公派出国
    Map<String, Object> selectGpcgGet(String xymc);

    List<String> selectNdByxy(String xymc, String category);


}

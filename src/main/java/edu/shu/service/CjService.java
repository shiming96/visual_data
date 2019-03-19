package edu.shu.service;

import edu.shu.entity.QueryCriteria;
import edu.shu.entity.StuXfzt;

import java.util.List;
import java.util.Map;

public interface CjService {

    Map<String, Object> search(QueryCriteria queryCriteria);

    Map<String, Object> selectCjztGet(String xymc);

    Map<String, Object> selectCjyjGet(String xymc);

    Map<String, Object> selectXfztGet(String xymc);

    List<StuXfzt> selectStuXfzt(String xymc, String nj);

    Map<String, List<String>> selectNjByXy(String xymc);

}

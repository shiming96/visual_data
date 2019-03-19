package edu.shu.service;

import edu.shu.entity.QueryCriteria;

import java.util.List;
import java.util.Map;

public interface XlService {


    Map<String, Object> selectXXGet(String xy);
    Map<String, Object> selectZSGet(String xy);
    Map<String, Object> selectXSGet(String xy);
    Map<String, Object> selectBSGet(String xy);
    Map<String, Object> search(QueryCriteria queryCriteria);


    Map<String, List<String>> selectzy(String xy, String route);
    Map<String, List<String>> selectnj(String xy, String zy);
    Map<String, String> selectbyrq(String xy, String zy,String cc, String xwlb, String nj);

}

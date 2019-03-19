package edu.shu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 院系表
 */
public interface ViewDmXsMapper {

    @Select("select mc from View_DM_XS")
    List<String> selXs();

    @Select("select dm from View_DM_XS where mc=#{0}")
    String selYxByXymc(String xymc);

    @Select("select mc from View_DM_XS where dm=#{dm}")
    String selXyByDm(String dm);

}

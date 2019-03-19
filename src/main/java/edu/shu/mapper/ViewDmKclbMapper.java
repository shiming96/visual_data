package edu.shu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 课程类别
 */
public interface ViewDmKclbMapper {

    @Select("select mc from View_DM_KCLB where dm = #{dm}")
    String selMcByDm(String dm);

    @Select("select dm from View_DM_KCLB where mc=#{0}")
    String selKclxByKclb(String kclb);

    @Select("select dm from View_DM_KCLB where mc = #{mc}")
    String selDmByMc(String mc);

    @Select("select mc from View_DM_KCLB")
    List<String> selKclb();


}

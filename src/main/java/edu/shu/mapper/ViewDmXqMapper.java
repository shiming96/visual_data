package edu.shu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 学期表
 */
public interface ViewDmXqMapper {

    @Select("select mc from View_DM_XQ")
    List<String> selXq();

    @Select("select mc from View_DM_XQ where dm = #{termcode}")
    String selXqByTermCode(int termcode);

    @Select("select dm from View_DM_XQ where mc = #{mc}")
    String selTermCodeByXq(String mc);
}

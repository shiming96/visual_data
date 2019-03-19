package edu.shu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 课程库
 */
public interface ViewKcMapper {

    //根据课程类别查询课程编号
    @Select("SELECT KCBH FROM View_KC where KCLB = #{0}")
    List<String> selKcbhBykclb(String kclb);
}

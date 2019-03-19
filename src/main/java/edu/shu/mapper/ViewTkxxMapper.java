package edu.shu.mapper;

import edu.shu.pojo.ViewTkxx;
import edu.shu.pojo.ViewTkxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewTkxxMapper {
    int countByExample(ViewTkxxExample example);

    List<ViewTkxx> selectByExample(ViewTkxxExample example);

    List<String> selectYxshByTermCode(@Param("termcode") List<Integer> termcode);


    List<Integer> selectTermCode(@Param("yxsh") String yxsh);

}
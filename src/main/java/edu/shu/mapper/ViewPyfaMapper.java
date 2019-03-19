package edu.shu.mapper;

import edu.shu.pojo.ViewPyfa;
import edu.shu.pojo.ViewPyfaExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ViewPyfaMapper {
    int countByExample(ViewPyfaExample example);

    List<ViewPyfa> selectByExample(ViewPyfaExample example);

    @Select("SELECT DISTINCT nd FROM View_PYFA WHERE xy=#{xymc} ORDER BY nd desc")
    List<String> selectNd(@Param("xymc") String xymc);

    @Select("SELECT DISTINCT nd FROM View_PYFA ORDER BY nd desc")
    List<String> selectAllNd();

    @Select("SELECT DISTINCT kclx FROM View_PYFA WHERE nd = #{nd}")
    List<String> selKclbByNd(String nd);
}
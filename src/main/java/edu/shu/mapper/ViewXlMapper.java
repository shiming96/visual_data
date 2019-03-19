package edu.shu.mapper;

import edu.shu.pojo.ViewXl;
import edu.shu.pojo.ViewXlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewXlMapper {
    int countByExample(ViewXlExample example);


    List<ViewXl> selectByExample(ViewXlExample example);


    List<String> selxy();
    List<String> selzy(@Param("xy") String xy);
    List<String> selnj(@Param("xy") String xy, @Param("zy") String zy);
    String selMaxbyrq(@Param("xy") String xy, @Param("zy") String zy, @Param("CC") String CC, @Param("xwlb") String xwlb, @Param("nj") String nj);
    String selMinbyrq(@Param("xy") String xy, @Param("zy") String zy, @Param("CC") String CC, @Param("xwlb") String xwlb, @Param("nj") String nj);

}
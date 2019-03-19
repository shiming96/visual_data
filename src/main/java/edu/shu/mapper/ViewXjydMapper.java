package edu.shu.mapper;

import edu.shu.pojo.ViewXjyd;
import edu.shu.pojo.ViewXjydExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ViewXjydMapper {
    int countByExample(ViewXjydExample example);
    List<ViewXjyd> selectByExample(ViewXjydExample example);

    int selNumByXyAndcate(@Param("xymc") String xymc, @Param("cate") String cate, @Param("nd") String nd);


    int selNumByXyAndSomeCate(@Param("xymc") String xymc, @Param("cate") List<String> cate, @Param("nd") String nd);

    @Select("SELECT DISTINCT [学籍异动] FROM View_XJYD")
    List<String> selCategory();

    @Select("select DISTINCT substring(学籍异动日,1,4) as nd from View_XJYD ORDER BY nd desc")
    List<String> selNd();

    @Select("select DISTINCT substring(View_XJYD.[学籍异动日],1,4) as nd from View_XJYD,View_Xj_All\n" +
            "WHERE View_XJYD.[学号] = View_Xj_All.xh AND View_Xj_All.xymc = #{xy}\n" +
            "ORDER BY nd desc")
    List<String> selNdByXy(String xy);


}
package edu.shu.mapper;

import edu.shu.pojo.ViewPyjh;
import edu.shu.pojo.ViewPyjhExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 跨院系专业选课数据
 */
public interface ViewPyjhMapper {
    int countByExample(ViewPyjhExample example);

    List<ViewPyjh> selectByExample(ViewPyjhExample example);

    //跨院系选课数量(学校)
    int selKyxxkslAll(@Param("kclb") String kclb, @Param("nj") String nj, @Param("yAxis") List<String> yAxis);
    //跨院系选课人数(学校)
    int selKyxxkrsAll(@Param("kclb") List<String> kclb, @Param("nj") String nj, @Param("yAxis") List<String> yAxis);

    //跨院系选课数量
    int selKyxxksl(@Param("xy") String xy, @Param("kclb") String kclb, @Param("nj") String nj);
    //跨院系选课人数
    int selKyxxkrs(@Param("xy") String xy, @Param("kclb") List<String> kclb, @Param("nj") String nj);

    @Select("select distinct substring(xh,0,3) from View_PYJH WHERE xy = #{xy} and XH NOT LIKE ('%[A-Z,a-z]%')")
    List<String> selNj(@Param("xy") String xy);

    @Select("select distinct substring(xh,0,3) from View_PYJH where XH NOT LIKE ('%[A-Z,a-z]%')")
    List<String> selAllNj();

    List<String> selDmByNj(@Param("xy") String xy, @Param("nj") String nj);
}
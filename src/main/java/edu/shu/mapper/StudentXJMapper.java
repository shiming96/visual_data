package edu.shu.mapper;

import edu.shu.pojo.StudentXJ;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface StudentXJMapper {

    //学籍状态
    int selXJZT(@Param("isCXZ") String isCXZ, @Param("status") String status, @Param("xymc") String xymc, @Param("nj") String nj, @Param("zymc") String zymc, @Param("xq") String xq);

    //超学制数据
    int selCXZSJ(@Param("xymc") String xymc, @Param("zymc") String zymc, @Param("cqsj") String cqsj);
    List<Map<String, Object>> selXYRS();
    List<StudentXJ> selCXZXX(@Param("xymc") String xymc, @Param("zymc") String zymc);
    //学籍异动


    //类别数据
    int selLBSJ(@Param("isCXZ") String isCXZ, @Param("xymc") String xymc, @Param("nj") String nj, @Param("xwlb") String xwlb, @Param("cc") String cc, @Param("xxxs") String xxxs, @Param("XKML") String XKML, @Param("xh") String xh);
    //查询学科门类
    List<String> selXKML(@Param("cc") String cc);

    //校区人数分布
    int selXQRSFB(@Param("isCXZ") String isCXZ, @Param("xymc") String xymc, @Param("zymc") String zymc, @Param("nj") String nj, @Param("xq") String xq, @Param("xb") String xb, @Param("cc") String cc);
    List<Map<String,String>> selXQRSFBXQ(@Param("isCXZ") String isCXZ, @Param("xymc") String xymc, @Param("xq") String xq, @Param("zymc") String zymc, @Param("nj") String nj);

    //超学制人数
    int selCXZSS(@Param("isCXZ") String isCXZ, @Param("xq") String xq, @Param("xymc") String xymc, @Param("zymc") String zymc, @Param("nj") String nj);



    //专业名称
    List<String> selzymc(@Param("xymc") String xymc);

    //年级
    List<String> selnj(@Param("isCXZ") String isCXZ, @Param("xymc") String xymc, @Param("zymc") String zymc);

    @Select("SELECT * FROM View_Xj WHERE xh = #{xh}")
    StudentXJ selPeoByXh(@Param("xh") String xh);

    @Select("SELECT DISTINCT top 3 nj FROM View_Xj  ORDER BY nj desc")
    List<String> selTop3nj();

    int selNumByNj(@Param("xymc") String xy, @Param("zymc") String zy, @Param("nj") String nj, @Param("cc") String cc, @Param("xwlb") String xwlb, @Param("startTime") String startTime, @Param("endTime") String endTime);

}
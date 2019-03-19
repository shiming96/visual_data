package edu.shu.mapper;

import edu.shu.entity.StuCjyjInfo;
import edu.shu.entity.StuXfztInfo;
import edu.shu.pojo.ViewCj;
import edu.shu.pojo.ViewCjExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewCjMapper {
    int countByExample(ViewCjExample example);
    List<ViewCj> selectByExample(ViewCjExample example);

    /**
     * 查询成绩状态
     * @param category  及格  | 不及格 | 总人数
     * @param xwlb  学术型 | 专业学位
     * @param cc    硕士 |博士
     * @param xymc 学院名称
     * @return
     */
    int selectCjzt(@Param("category") String category, @Param("xwlb") String xwlb, @Param("cc") String cc, @Param("xymc") String xymc);

    /**
     * 学分状态查询
     * @param category  修满 | 没修满
     * @param xymc  学院名称
     * @param xwlb  学位类别 :  专业学位 | 学术型
     * @param cc    硕士 | 博士
     * @return
     */
    int selectXfzt(@Param("category") String category, @Param("xymc") String xymc, @Param("xwlb") String xwlb, @Param("cc") String cc, @Param("nj") String nj);

    /**
     * 查询学分未修满学生的信息
     * @param xymc
     * @return
     */
    List<StuXfztInfo> selectStuXfztInfo(@Param("xymc") String xymc, @Param("nj") String nj);

    /**
     * 成绩预警
     * @param xymc  学院名称
     * @return
     */
    int selectCjyj(@Param("xymc") String xymc);

    List<StuCjyjInfo> selectStuCjyjInfo(@Param("xymc") String xymc);

    List<String> selectNjByXy(@Param("xymc") String xymc);
}
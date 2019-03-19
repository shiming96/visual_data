package edu.shu.mapper;

import edu.shu.pojo.ViewKkbj;
import edu.shu.pojo.ViewKkbjExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 课程排课表
 */
public interface ViewKkbjMapper {
    int countByExample(ViewKkbjExample example);
    List<ViewKkbj> selectByExample(ViewKkbjExample example);

    int selectkkmc(@Param("xymc") String xymc, @Param("kclb") String kclb, @Param("Term") List<String> Term);
    int selectkkms(@Param("xymc") String xymc, @Param("kclb") String kclb, @Param("Term") List<String> Term);

    @Select("SELECT DISTINCT Term FROM View_KKBJ")
    List<String> selectAllTerm();

    @Select("SELECT DISTINCT Term FROM View_KKBJ WHERE yx = #{yx}")
    List<String> selectTerm(@Param("yx") String yx);
}


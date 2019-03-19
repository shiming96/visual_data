package edu.shu.mapper;

import edu.shu.pojo.ViewZsSslqk;
import edu.shu.pojo.ViewZsSslqkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewZsSslqkMapper {
    int countByExample(ViewZsSslqkExample example);

    List<ViewZsSslqk> selectByExample(ViewZsSslqkExample example);

    List<String> selectSYD();
    List<String> selectKSLY();
    List<String> selectZZMM();
    List<String> selectMZ(@Param("xymc") String xymc, @Param("zymc") String zymc);
    List<String> selectND(@Param("xymc") String xymc, @Param("zymc") String zymc);
    List<String> selzymc(@Param("xymc") String xymc);

}
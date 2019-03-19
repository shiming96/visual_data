package edu.shu.mapper;

import edu.shu.pojo.ViewLxsj;
import edu.shu.pojo.ViewLxsjExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewLxsjMapper {
    int countByExample(ViewLxsjExample example);

    List<ViewLxsj> selectByExample(ViewLxsjExample example);

    List<String> selectCglbByXyAndNd(@Param("xy") String xy, @Param("nd") String nd);

    List<String> selectNdByXy(@Param("xy") String xy, @Param("category") String category);

    List<String> selectXyByNd(@Param("nd") String nd);

    int selectXnzzOrGpcg(@Param("xy") String xy, @Param("nd") String nd, @Param("cc") String cc, @Param("xwlb") String xwlb, @Param("category") String category);

}
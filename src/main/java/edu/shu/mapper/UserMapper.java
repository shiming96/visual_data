package edu.shu.mapper;

import edu.shu.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selUser(@Param("num") String num, @Param("name") String name);

}

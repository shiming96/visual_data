package edu.shu.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KYXXSMapper {

    @Select("SELECT mc FROM KYXXS")
    List<String> selectxy();
}

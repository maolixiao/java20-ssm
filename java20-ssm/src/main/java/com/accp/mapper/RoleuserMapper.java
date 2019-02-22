package com.accp.mapper;

import com.accp.domain.Roleuser;
import com.accp.domain.RoleuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleuserMapper {
    long countByExample(RoleuserExample example);

    int deleteByExample(RoleuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roleuser record);

    int insertSelective(Roleuser record);

    List<Roleuser> selectByExample(RoleuserExample example);

    Roleuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roleuser record, @Param("example") RoleuserExample example);

    int updateByExample(@Param("record") Roleuser record, @Param("example") RoleuserExample example);

    int updateByPrimaryKeySelective(Roleuser record);

    int updateByPrimaryKey(Roleuser record);
}
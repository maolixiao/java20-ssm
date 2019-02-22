package com.accp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Rolemodule;
import com.accp.domain.RolemoduleExample;

public interface RolemoduleMapper {
	
	int insertList(Map<String,Object> map);
	
	
    long countByExample(RolemoduleExample example);

    int deleteByExample(RolemoduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rolemodule record);

    int insertSelective(Rolemodule record);

    List<Rolemodule> selectByExample(RolemoduleExample example);

    Rolemodule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rolemodule record, @Param("example") RolemoduleExample example);

    int updateByExample(@Param("record") Rolemodule record, @Param("example") RolemoduleExample example);

    int updateByPrimaryKeySelective(Rolemodule record);

    int updateByPrimaryKey(Rolemodule record);
}
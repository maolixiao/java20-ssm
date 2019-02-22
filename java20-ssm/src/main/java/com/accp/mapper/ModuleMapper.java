package com.accp.mapper;

import com.accp.domain.Module;
import com.accp.domain.ModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleMapper {
	int queryTotalCount(Module module);
	
	List<Module> queryByPage(@Param("module") Module module,@Param("currentPage")Integer currentPage,@Param("pageSize")Integer pageSize);
	
	List<Module> queryByParentId(Integer id);
	
    long countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}
package com.accp.service;

import java.util.List;

import com.accp.domain.Module;
import com.accp.domain.PageBean;

public interface ModuleService {
	
	
	public List<Module> queryByParentId(Integer id);
	
	/**
	 * 
	 * @param currentPage Ò³Âë
	 * @param pageSize
	 * @return
	 */
	public PageBean<Module> queryByPage(Module module,Integer currentPage,Integer pageSize);

}

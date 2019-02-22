package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Module;
import com.accp.domain.PageBean;
import com.accp.mapper.ModuleMapper;
import com.accp.service.ModuleService;
@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	ModuleMapper moduleMapper;

//	public static void main(String[] args) {
//		ApplicationContext application = 
//				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		ModuleMapper m = (ModuleMapper)application.getBean("moduleMapper");
//		List<Module> list = m.queryByParentId(0);
//		System.out.println(list);
//	}
	
	public List<Module> queryByParentId(Integer id){
		return moduleMapper.queryByParentId(id);
	}
	/**
	 * 
	 * @param currentPage 页码
	 * @param pageSize
	 * @return
	 */
	public PageBean<Module> queryByPage(Module module,Integer currentPage,Integer pageSize){
		//分页数据
		int index = (currentPage-1)*pageSize; //下标
		List<Module> list = moduleMapper.queryByPage(module,index,pageSize);
		int totalSize = (int)moduleMapper.queryTotalCount(module);
		PageBean<Module> page = new PageBean<Module>(currentPage, pageSize, totalSize, list);
		return page;
	}
}

package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Module;
import com.accp.domain.PageBean;
import com.accp.service.ModuleService;

@Controller
@RequestMapping("/model")
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;

	@RequestMapping("/query/{id}")
	@ResponseBody
	public List<Module> queryModelParentId(@PathVariable("id") Integer id){
		return moduleService.queryByParentId(id);
	}
	
	@RequestMapping("/toQueryByPage")
	public String toQueryByPage(Model model,Integer currentPage,Integer pageSize,Module module) {
		if(currentPage==null) {
			currentPage = 1;
		}
		if(pageSize==null) {
			pageSize = 2;
		}
// 		获取当前页的数据  《module 具有条件数据的实体对象》
		PageBean<Module> page = moduleService.queryByPage(module,currentPage, pageSize);
		model.addAttribute("page", page);
		model.addAttribute("module", module);
		return "module/query";
	}
	
	
	@RequestMapping("/toAjaxQuery")
	public String toPage() {
		return "module/ajaxQuery";
	}
	
	@RequestMapping("/ajaxQuery")
	@ResponseBody
	public PageBean<Module> toPage(Integer currentPage,Integer pageSize,Module module) {
		//返回的数据， 虽然返回 pagebean 对象 但是 该对象的页数数据在ServiceImpl中处理了
		if(currentPage==null) {
			currentPage = 1;
		}
		if(pageSize==null) {
			pageSize = 2;
		}
		PageBean<Module> page = moduleService.queryByPage(module,currentPage, pageSize);
		return page;
	}
	
	@RequestMapping("/delete")
	public String delete(Integer [] xz) {
		return null;
	}
}

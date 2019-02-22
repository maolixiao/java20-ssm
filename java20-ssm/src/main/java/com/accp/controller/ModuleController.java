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
// 		��ȡ��ǰҳ������  ��module �����������ݵ�ʵ�����
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
		//���ص����ݣ� ��Ȼ���� pagebean ���� ���� �ö����ҳ��������ServiceImpl�д�����
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

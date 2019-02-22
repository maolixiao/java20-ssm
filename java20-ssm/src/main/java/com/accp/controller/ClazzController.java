package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Clazz;
import com.accp.service.ClazzService;

@Controller
@RequestMapping("/clz")
public class ClazzController {
	
	@Autowired
	ClazzService clazzService;
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "clazz/add";
	}
	
	@RequestMapping("/add")
	public String add(Clazz clz) {
		clazzService.add(clz);
		return null;
	}
	
}

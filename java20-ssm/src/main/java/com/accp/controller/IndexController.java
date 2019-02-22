package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Module;
import com.accp.service.ModuleService;

@Controller
public class IndexController {
	
	@Autowired
	ModuleService moduleService;
	
	@RequestMapping("/index")
	public String toIndex(Model model) {
		return "index";
	}
	
}

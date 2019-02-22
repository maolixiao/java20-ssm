package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Role;
import com.accp.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;

	@RequestMapping("/toAdd")
	public String toAdd() {
		return "role/add";
	}
	
	@RequestMapping("/add")
	public String add(Role role) {
		roleService.add(role);
		return "redirect:toAdd";
	}
	
}

package com.accp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Role;
import com.accp.mapper.RoleMapper;
import com.accp.mapper.RolemoduleMapper;
import com.accp.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleMapper roleMapper;
	
	@Autowired
	RolemoduleMapper rolemoduleMapper;

	public int add(Role role) {
		
		int count = roleMapper.insertSelective(role);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roleid", role.getId());
		map.put("mlist", role.getMlist());
		rolemoduleMapper.insertList(map);
		return count;
	}
	
}

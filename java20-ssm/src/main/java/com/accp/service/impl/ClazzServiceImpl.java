package com.accp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Clazz;
import com.accp.mapper.ClazzMapper;
import com.accp.mapper.StudentMapper;
import com.accp.service.ClazzService;

@Service
@Transactional
public class ClazzServiceImpl implements ClazzService {
	
	@Autowired
	ClazzMapper clazzMapper;
	@Autowired
	StudentMapper studentMapper;

	public int add(Clazz clz) {
		int cid = clazzMapper.insert(clz);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cid", clz.getId());
		map.put("stuList", clz.getStuList());
		studentMapper.insertList(map);
		return 0;
	}

	
	
}

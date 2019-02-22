package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Student;
import com.accp.mapper.StudentMapper;
import com.accp.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	public List<Student> queryAll(){
		return studentMapper.selectByExample(null);
	}
	
	public int add(Student stu) {
		return studentMapper.insertSelective(stu);
	}
	
}

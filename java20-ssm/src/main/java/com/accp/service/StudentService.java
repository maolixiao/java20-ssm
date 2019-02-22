package com.accp.service;

import java.util.List;

import com.accp.domain.Student;

public interface StudentService {

	
	public List<Student> queryAll();
	
	public int add(Student stu);
}

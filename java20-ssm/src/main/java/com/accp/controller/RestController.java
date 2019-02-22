package com.accp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Student;
import com.accp.exception.MyException;

@Controller
public class RestController {
	
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String toQuery(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		
//		if(1==1) {
//			throw new MyException("我错了......");
//		}
		if(2==2) {
			throw new ArithmeticException("真的错了....");
		}
		
		return "rest/query";
	}
	
	/**
	 * 单个提取
	 */
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String query(@PathVariable("id") Integer id) {
		return "query";
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	@ResponseBody
	public String add(Student stu) {
		return "add";
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable("id") Integer id) {
		return "delete";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	@ResponseBody
	public String update(Student stu) {
		return "update";
	}
	
	

}

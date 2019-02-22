package com.accp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.alibaba.fastjson.JSON;

@Controller  //表示为浏览器可以访问到的
@RequestMapping("/stu")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/show")
	public String show(Model model) {
		System.out.println("我被请求到了.....");
		model.addAttribute("stuList", studentService.queryAll());
		model.addAttribute("stuName", "张三");
		return "show";
	}
	@RequestMapping("/delete")
	public String delete(Integer id) {
		System.out.println(id);
		return "redirect:show";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "student/add";
	}
	
	@RequestMapping("/add")
	public String add(Student stu) {
		studentService.add(stu);
		return "redirect:show";
	}
	
	@RequestMapping("/toQuery")
	public String toQuery() {
		return "student/query";
	}
	
	@RequestMapping("/query")
	@ResponseBody  //走消息转换器
	public List<Student> query() {
		List<Student> list = studentService.queryAll();
		//将对象转换成字符串 （序列号过程）
//		return JSON.toJSONString(list);//一定走视图解析器（解析逻辑路径  404）
		//将字符串转换成对象 （反序列化）
		return list;
	}
	
	//请求类型过过来的数据内容为json格式，需要反序列化数据
	@RequestMapping(value="/ajaxAdd",produces="application/json;charset=utf-8")
//	@RequestMapping("/ajaxAdd")
	public String ajaxAdd(@RequestBody Clazz clz) {//请数据走消息转换器
		return null;
	}
	
}

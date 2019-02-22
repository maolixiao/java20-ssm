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

@Controller  //��ʾΪ��������Է��ʵ���
@RequestMapping("/stu")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/show")
	public String show(Model model) {
		System.out.println("�ұ�������.....");
		model.addAttribute("stuList", studentService.queryAll());
		model.addAttribute("stuName", "����");
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
	@ResponseBody  //����Ϣת����
	public List<Student> query() {
		List<Student> list = studentService.queryAll();
		//������ת�����ַ��� �����кŹ��̣�
//		return JSON.toJSONString(list);//һ������ͼ�������������߼�·��  404��
		//���ַ���ת���ɶ��� �������л���
		return list;
	}
	
	//�������͹���������������Ϊjson��ʽ����Ҫ�����л�����
	@RequestMapping(value="/ajaxAdd",produces="application/json;charset=utf-8")
//	@RequestMapping("/ajaxAdd")
	public String ajaxAdd(@RequestBody Clazz clz) {//����������Ϣת����
		return null;
	}
	
}

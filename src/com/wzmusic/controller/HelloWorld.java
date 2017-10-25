package com.wzmusic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wzmusic.bean.Student;


@Controller
public class HelloWorld {
	/*
	 * ��ӡHello worlds
	 */
	@RequestMapping("/helloworld")
	public ModelAndView hello(HttpSession session){
		String s1="zxx";
		session.setAttribute("user", s1);
		
		System.out.println("111111111111111111111");
		ModelAndView m=new ModelAndView();
		
		List<Student> student=new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s=new Student();
			s.setId(i);
			s.setName("Сѧ��"+i);
			s.setAge(i+15);
			student.add(s);
		}
		
		m.setViewName("success");
		m.addObject("hh1", "ssss1345234236543563463");
		m.addObject("guida", "���ݴ�ѧ1111122222222255555558888877777");
		m.addObject("student", student);
		return m;
	}
	@RequestMapping("/p")
	public String p(){
		return "success";
	}
}

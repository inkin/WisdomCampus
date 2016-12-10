package com.ocean.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ocean.model.Student;
import com.ocean.service.StudentService;
import com.ocean.util.JsonTool;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource
	StudentService service;
	
	
	/**
	 * 登录
	 * @param request
	 * @param response
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response){
		JSONObject jsonObject = null;
		try {
			jsonObject = JsonTool.readJson(request);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String account = jsonObject.getString("account");
		String password = jsonObject.getString("password");
		
		Student student = service.login(account);
		
		if(student==null){
			System.out.println("没有该学生");
		}else if(!password.equals(student.getPassword())){
			System.out.println("密码不正确");
		}
		else {
			try {
				request.setAttribute(account, student);
				request.getRequestDispatcher("/view/index.html").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@RequestMapping("/selectStudentByName")
	public void selectStudentByName(){
		String studentName = "龙卷风";
		
		Student student =  service.selectStudentByName(studentName);
		
		System.out.println(student.toString());
	}
	
	@RequestMapping("/selectClassmates")
	public void selectClassmates(HttpServletRequest request, HttpServletResponse response){
//		String account = request.getParameter("account");
		String account = "201324130000";
		
		List<Student> classmates = service.selectClassmates(account);
		
		for(Iterator<Student> iterator = classmates.iterator();iterator.hasNext();){
			Student student = iterator.next();
			System.out.println(student.toString());
		}
		
	}
	
}

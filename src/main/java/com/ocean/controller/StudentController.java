package com.ocean.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Student;
import com.ocean.service.StudentService;

import net.sf.json.JSONObject;

/**
 * RequestMapping  //前端页面访问接口
 *  
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController 
{
	@Resource
	StudentService service;

	/**
	 * 登录
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public JSONObject login(@RequestBody JSONObject json) 
	{
		String account = json.getString("account");
		String password = json.getString("password");
		json.clear();

		Student student = service.login(account);

		if (student == null) 
		{
			json.put("result", "no such a student");
			return json;
		} 
		else if (!password.equals(student.getPassword())) 
		{
			json.put("result", "password error");
			return json;
		} 
		else 
		{
			json.put("result", "success");
			return json;
		}

	}

	/**
	 * 根据姓名查找学生
	 */
	@RequestMapping(value = "/selectStudentByName")
	public void selectStudentByName( ) 
	{
		String studentName = "龙卷风";

		Student student = service.selectStudentByName(studentName);

		System.out.println(student.toString());
	}

	/*
	 * 根据班级查找学生
	 */
	@RequestMapping("/selectClassmates")
	public void selectClassmates(HttpServletRequest request, HttpServletResponse response) 
	{
		// String account = request.getParameter("account");
		String account = "201324130000";

		List<Student> classmates = service.selectClassmates(account);

		for (Iterator<Student> iterator = classmates.iterator(); iterator.hasNext();) 
		{
			Student student = iterator.next();
			System.out.println(student.toString());
		}

	}

}

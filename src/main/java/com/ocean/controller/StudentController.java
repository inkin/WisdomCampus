package com.ocean.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/student")
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
	@RequestMapping("/login")
	@ResponseBody
	public JSONObject login(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, Object> user) 
	{
		String account = (String) user.get("account");
		String password = (String) user.get("password");

		Student student = service.login(account);

		if (student == null) 
		{
			Map<Object, String> map = new HashMap<Object, String>();
			map.put("status", "no such a student");
			JSONObject json = JSONObject.fromObject(map);
			return json;
		} 
		else if (!password.equals(student.getPassword())) 
		{
			Map<Object, String> map = new HashMap<Object, String>();
			map.put("status", "password error");
			JSONObject json = JSONObject.fromObject(map);
			return json;
		} 
		else 
		{
			Map<Object, String> map = new HashMap<Object, String>();
			map.put("status", "success");
			JSONObject json = JSONObject.fromObject(map);
			return json;
		}

	}

	/**
	 * 根据姓名查找学生
	 */
	@RequestMapping("/selectStudentByName")
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

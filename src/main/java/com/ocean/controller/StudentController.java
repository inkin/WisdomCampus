package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Student;
import com.ocean.service.StudentService;

import net.sf.json.JSONArray;
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
		System.out.println(account);
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
	@ResponseBody
	public JSONArray selectStudentByName( @RequestBody JSONObject json ) 
	{
		String studentName = json.getString("studentName");
		List<Student> students = service.selectStudentByName(studentName);
		JSONArray jsonArray = JSONArray.fromObject(students);
		return jsonArray;
	}

	/*
	 * 根据班级查找学生
	 */
	@RequestMapping("/selectClassmates")
	@ResponseBody
	public JSONArray selectClassmates(@RequestBody JSONObject json) 
	{
		String account = json.getString("account");

		List<Student> classmates = service.selectClassmates(account);

		JSONArray jsonArray = JSONArray.fromObject(classmates);
		
		return jsonArray;

	}

}

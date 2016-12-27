package com.ocean.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Student;
import com.ocean.service.StudentService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * RequestMapping  前端页面访问接口
 *  
 * @author Ocean
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
	@RequestMapping(value = "/selectStudent")
	@ResponseBody
	public JSONArray selectStudentByName( @RequestParam(value = "key") String key ) 
	{
		List<Student> students = service.selectStudent(key);
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
	
	@RequestMapping(value = "updateExpression")
	@ResponseBody
	public JSONObject updateExpression(@RequestBody JSONObject json)
	{
		String account = json.getString("account");
		String expression = json.getString("expression");
		json.clear();
		Map<String, String> map = new HashMap<String, String>();
		map.put("account", account);
		map.put("expression", expression);
		service.updateExpression(map);
		json.put("result", "ok");
		return json;
	}
	
	@RequestMapping(value = "/updatePassword")
	@ResponseBody
	public JSONObject updatePassword(@RequestBody JSONObject json)
	{
		String account = json.getString("account");
		String oldPassword = json.getString("oldPassword");
		String newPassword = json.getString("newPassword");
		json.clear();
		
		//判断旧密码是否正确
		Student student = service.login(account);
		//正确
		if(student.getPassword().equals(oldPassword))
		{
			json.put("oldPassword", "correct");
			Map<String, String> map = new HashMap<String, String>();
			map.put("account", account);
			map.put("newPassword", newPassword);
			
			service.updatePassword(map);
			json.put("result", "ok");
		}
		//错误
		else
		{
			json.put("oldPassword", "wrong");
		}
		
		return json;
	}
	
	@RequestMapping(value = "/deleteStudent")
	@ResponseBody
	public JSONObject deleteStudent(@RequestBody JSONObject json)
	{
		service.deleteStudent(json.getString("studentId"));
		json.clear();
		json.put("result", "ok");
		return json;
	}

}

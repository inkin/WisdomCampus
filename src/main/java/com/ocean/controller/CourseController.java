package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Course;
import com.ocean.service.CourseService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/course")
public class CourseController {
	@Resource CourseService service;
	
	@RequestMapping(value = "/addCourse")
	@ResponseBody
	public JSONObject addCourse(@RequestBody JSONObject json)
	{
		String courseNo = json.getString("courseNo");
		String courseName = json.getString("courseName");
		String courseTerm = json.getString("courseTerm");
		String teacherNo = json.getString("teacherNo");
		Course course = new Course(courseNo, courseName, courseTerm, teacherNo);
		json.clear();
		
		service.addCourse(course);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/updateCourse")
	@ResponseBody
	public JSONObject updateCourse(@RequestBody JSONObject json)
	{
		String courseNo = json.getString("courseNo");
		String courseName = json.getString("courseName");
		String courseTerm = json.getString("courseTerm");
		String teacherNo = json.getString("teacherNo");
		Course course = new Course(courseNo, courseName, courseTerm, teacherNo);
		json.clear();
		
		service.update(course);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping("/deleteCourse")
	@ResponseBody
	public JSONObject deleteCourse(@RequestBody JSONObject json)
	{
		String courseNo = json.getString("courseNo");
		service.deleteCourse(courseNo);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/selectCourse")
	@ResponseBody
	public JSONArray selectCourse(@RequestBody JSONObject json)
	{
		String key = json.getString("key");
		List<Course> courses = service.selectCourse(key);
		JSONArray jsonArray = JSONArray.fromObject(courses);
		return jsonArray;
	}
	
	
}

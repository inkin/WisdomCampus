package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Teacher;
import com.ocean.service.TeacherService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "teacher")
public class TeacherController {
	@Resource TeacherService service;
	
	@RequestMapping(value = "/addTeacher")
	@ResponseBody
	public JSONObject addTeacher(@RequestBody JSONObject json)
	{
		Teacher teacher = new Teacher();
		teacher.setTeacherNo(json.getString("teacherNo"));
		teacher.setTeacherName(json.getString("teacherName"));
		teacher.setTeacherPicture(json.getString("teacherPicture"));
		teacher.setExpression(json.getString("expression"));
		teacher.setInstituteNo(json.getString("instituteNo"));
		teacher.setTeacherDegree(json.getString("teacherDegree"));
		teacher.setTeacherMail(json.getString("teacherMail"));
		teacher.setTeacherTell(json.getString("teacherTell"));
		teacher.setPassword(json.getString("teacherNo"));
		json.clear();
		
		service.addTeacher(teacher);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/updateTeacher")
	@ResponseBody
	public JSONObject updateTeacher(@RequestBody JSONObject json)
	{
		Teacher teacher = new Teacher();
		teacher.setTeacherNo(json.getString("teacherNo"));
		teacher.setTeacherName(json.getString("teacherName"));
		teacher.setTeacherPicture(json.getString("teacherPicture"));
		teacher.setExpression(json.getString("expression"));
		teacher.setInstituteNo(json.getString("instituteNo"));
		teacher.setTeacherDegree(json.getString("teacherDegree"));
		teacher.setTeacherMail(json.getString("teacherMail"));
		teacher.setTeacherTell(json.getString("teacherTell"));
		teacher.setPassword(json.getString("teacherNo"));
		json.clear();
		
		service.updateTeacher(teacher);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/selectTeacher")
	@ResponseBody
	public JSONArray selectTeacher(@RequestParam(value = "key") String key)
	{
		List<Teacher> teachers = service.selectTeacher(key);
		JSONArray jsonArray = JSONArray.fromObject(teachers);
		return jsonArray;
	}
	
	@RequestMapping(value = "/deleteTeacher")
	@ResponseBody
	public JSONObject deleteTeacher(@RequestParam(value = "teacherId") String teacherId)
	{
		service.deleteTeacher(teacherId);
		JSONObject json = new JSONObject();
		json.put("result", "ok");
		
		return json;
	}

}

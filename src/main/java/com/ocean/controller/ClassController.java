package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.aspectj.weaver.JoinPointSignature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Clazz;
import com.ocean.service.ClassService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "class")
public class ClassController {
	@Resource ClassService service;
	
	@RequestMapping(value = "addClass")
	@ResponseBody
	public JSONObject addClass(@RequestBody JSONObject json)
	{
		Clazz clazz = new Clazz();
		clazz.setClassName(json.getString("className"));
		clazz.setClassMember(json.getInt("classMember"));
		clazz.setClassGrade(json.getString("classGrade"));
		clazz.setInstituteNo(json.getString("instituteNo"));
		clazz.setClassNo(json.getString("classNo"));
		json.clear();
		service.addClass(clazz);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/updateClass")
	@ResponseBody
	public JSONObject updateClass(@RequestBody JSONObject json)
	{
		Clazz clazz = new Clazz();
		clazz.setClassName(json.getString("className"));
		clazz.setClassMember(json.getInt("classMember"));
		clazz.setClassGrade(json.getString("classGrade"));
		clazz.setInstituteNo(json.getString("instituteNo"));
		clazz.setClassNo(json.getString("classNo"));
		json.clear();
		
		service.updateClass(clazz);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/deleteClass")
	@ResponseBody
	public JSONObject deleteClass(@RequestBody JSONObject json)
	{
		String classNo = json.getString("classNo");
		
		service.deleteClass(classNo);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/selectClass")
	@ResponseBody
	public JSONArray selectClass(@RequestBody JSONObject json)
	{
		String key = json.getString("key");
		List<Clazz> clazzs = service.seleteClass(key);
		JSONArray jsonArray = JSONArray.fromObject(clazzs);
		
		return jsonArray;
	}
}

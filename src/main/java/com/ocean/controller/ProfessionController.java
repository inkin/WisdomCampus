package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Institute;
import com.ocean.service.ProfessionService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/profession")
public class ProfessionController {

	@Resource
	ProfessionService service;

	@RequestMapping(value = "/addProfession")
	@ResponseBody
	public JSONObject addProfession(@RequestBody JSONObject json) {
		Institute institute = new Institute();

		institute.setInstituteNo(json.getString("instituteNo"));
		institute.setInstituteName(json.getString("instituteName"));
		institute.setProfession(json.getString("profession"));
		json.clear();
		
		service.addProfession(institute);
		json.put("result", "ok");
		return json;
	}

	@RequestMapping(value = "/updateProfession")
	@ResponseBody
	public JSONObject updateProfession(@RequestBody JSONObject json) {
		Institute institute = new Institute();
		institute.setInstituteName(json.getString("instituteName"));
		institute.setInstituteNo(json.getString("instituteNo"));
		institute.setProfession(json.getString("profession"));

		service.updateProfession(institute);
		json.put("result", "ok");
		return json;
	}

	@RequestMapping(value = "/deleteProfession")
	@ResponseBody
	public JSONObject deleteProfession(@RequestBody JSONObject json) {
		String instituteNo = json.getString("instituteNo");
		service.deleteProfession(instituteNo);
		json.put("result", "ok");
		return json;

	}

	@RequestMapping(value = "/selectProfession")
	@ResponseBody
	public JSONArray selectProfession(@RequestBody JSONObject json) {
		String key = json.getString("key");
		List<Institute> institutes = service.selectProfession(key);
		JSONArray jsonArray = JSONArray.fromObject(institutes);
		
		return jsonArray;
	}

}

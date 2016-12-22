package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ocean.model.Institute;
import com.ocean.service.ProfessionService;

@Controller
@RequestMapping(value = "/profession")
public class ProfessionController {
	
	@Resource ProfessionService service;
	
	@RequestMapping(value = "/addProfession")
	public void addProfession()
	{
		Institute institute = new Institute();
		
		institute.setInstituteName("工程学院");
		institute.setInstituteNo("05");
		institute.setProfession("机械工程");
		
		service.addProfession(institute);
	}
	
	@RequestMapping(value = "/updateProfession")
	public void updateProfession()
	{
		Institute institute = new Institute();
		institute.setInstituteName("计算机");
		institute.setInstituteNo("05");
		institute.setProfession("智能家居");
		
		service.updateProfession(institute);
	}
	
	@RequestMapping(value = "/deleteProfession")
	public void deleteProfession()
	{
		String instituteNo = "05";
		service.deleteProfession(instituteNo);
		
	}
	
	@RequestMapping(value = "/selectProfession")
	public void selectProfession()
	{
		String key = "网络";
		 List<Institute> institutes = service.selectProfession(key);
		 System.out.println(institutes);
	}
	
}

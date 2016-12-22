package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.ProfessionDao;
import com.ocean.model.Institute;

@Service
public class ProfessionService {
	
	@Resource ProfessionDao dao;
	
	public void addProfession(Institute institute)
	{
		dao.addProfession(institute);
	}
	
	public void updateProfession(Institute institute)
	{
		dao.updateProfession(institute);
	}
	
	public void deleteProfession(String instituteNo)
	{
		dao.deleteProfession(instituteNo);
	}
	
	public List<Institute> selectProfession(String key)
	{
		return dao.selectProfession(key);
	}
}

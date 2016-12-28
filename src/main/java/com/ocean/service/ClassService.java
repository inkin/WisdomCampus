package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.ClassDao;
import com.ocean.model.Clazz;

@Service
/**
 * 
 * @author Ocean
 *
 */
public class ClassService {
	@Resource ClassDao dao;
	
	public void addClass(Clazz clazz)
	{
		dao.addClass(clazz);
	}
	
	public void updateClass(Clazz clazz)
	{
		dao.updateClass(clazz);
	}
	
	public void deleteClass(String classNo)
	{
		dao.deleteClass(classNo);
	}
	
	public List<Clazz> seleteClass(String key)
	{
		return dao.selectClass(key);
	}
}

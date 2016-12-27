package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.TeacherDao;
import com.ocean.model.Teacher;

@Service
public class TeacherService 
{
	@Resource
	TeacherDao dao;
	public void addTeacher(Teacher teacher)
	{
		dao.addTeacher(teacher);
	}
	
	public void updateTeacher(Teacher teacher)
	{
		dao.updateTeacher(teacher);
	}
	
	public List<Teacher> selectTeacher(String key)
	{
		return dao.selectTeacher(key);
	}
	
	public void deleteTeacher(String teacherId)
	{
		dao.deleteTeacher(teacherId);
	}

}

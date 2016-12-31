package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.CourseDao;
import com.ocean.model.Course;

@Service
public class CourseService {
	@Resource CourseDao dao;
	
	public void addCourse(Course course)
	{
		dao.addCourse(course);
	}
	
	public void update(Course course)
	{
		dao.updateCourse(course);
	}
	
	public void deleteCourse(String courseNo)
	{
		dao.deleteCourse(courseNo);
	}
	
	public List<Course>selectCourse(String key)
	{
		return dao.selectCourse(key);
	}
}

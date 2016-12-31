package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Course;

@Repository 
/**
 * 课程
 * @author Ocean
 *
 */
public interface CourseDao {
	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(String courseNo);
	List<Course> selectCourse(String key);
}

package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Teacher;

@Repository
/**
 * 教师模块
 * @author Ocean
 *
 */
public interface TeacherDao {
	
	/**
	 * 添加教师信息
	 * @param teacher
	 */
	void addTeacher(Teacher teacher);
	
	/**
	 * 修改教师信息
	 * @param teacher
	 */
	void updateTeacher(Teacher teacher);
	
	/**
	 * 查找教师信息
	 * @param key
	 * @return
	 */
	List<Teacher>selectTeacher(String key);
	
	/**
	 * 删除教师信息
	 * @param teachreId
	 */
	void deleteTeacher(String teacherId);
	
	
}

package com.ocean.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ocean.model.Student;

@Repository
public interface StudentDao {
	
	/**
	 * 添加学生
	 * @param student
	 */
	void addStudent(Student student);
	
	/**
	 * 学生登录
	 * @param account
	 * @return
	 */
	Student login(String account);

	/**
	 * 查询学生
	 * @param studentName
	 * @return
	 */
	List<Student> selectStudent(String key);

	/**
	 * 查询同班同学的基本信息
	 * @return
	 */
	List<Student> selectClassmates(String account);
	
	/**
	 * 修改个人说明
	 * @param account
	 * @param expression
	 */
	void updateExpression(Map<String, String> map);
	
	/**
	 * 修改密码
	 * @param account
	 * @param newPassword
	 */
	void updatePassword(Map<String, String> map);
	
	/**
	 * 删除学生
	 * @param studentId
	 */
	void deleteStudent(String studentId);
}

package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Student;

@Repository
public interface StudentDao {
	
	/**
	 * 学生登录
	 * @param account
	 * @return
	 */
	Student login(String account);

	/**
	 * 根据名字查询学生
	 * @param studentName
	 * @return
	 */
	List<Student> selectStudentByName(String studentName);

	/**
	 * 查询同班同学的基本信息
	 * @return
	 */
	List<Student> selectClassmates(String account);
	
	/**
	 * 修改密码
	 * @param account
	 * @param newPassword
	 */
	void updatePassword(String account, String newPassword);
	
	/**
	 * 修改个人说明
	 * @param account
	 * @param expression
	 */
	void updateExpression(String account,String expression);
}

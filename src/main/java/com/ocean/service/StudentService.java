package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.StudentDao;
import com.ocean.model.Student;

@Service
public class StudentService {
	@Resource
	StudentDao dao;

	/**
	 * 根据名字查询学生
	 * @param studentName
	 * @return
	 */
	public Student selectStudentByName(String studentName)
	{
		return dao.selectStudentByName(studentName);
	}

	/**
	 * 学生登录
	 * @param account
	 * @return
	 */
	public Student login(String account) 
	{
		return dao.login(account);
	}
	
	/**
	 * 查询同班同学
	 * @param account
	 * @return
	 */
	public List<Student> selectClassmates(String account)
	{
		return dao.selectClassmates(account);
	}
	
	/**
	 * 更改个人说明
	 * @param account
	 * @param expression
	 */
	public void updateExpression(String account,String expression)
	{
		dao.updateExpression(account, expression);
	}
	
	/**
	 * 更改密码
	 * @param account
	 * @param newPassword
	 */
	public void updatePassword(String account,String newPassword)
	{
		dao.updatePassword(account, newPassword);
	}
}

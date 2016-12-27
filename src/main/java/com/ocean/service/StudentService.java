package com.ocean.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.StudentDao;
import com.ocean.model.Student;

@Service
public class StudentService {
	@Resource
	StudentDao dao;

	/**
	 * 查询学生
	 * @param studentName
	 * @return
	 */
	public List<Student> selectStudent(String key)
	{
		return dao.selectStudent(key);
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
	public void updateExpression(Map<String, String> map)
	{
		dao.updateExpression(map);
	}
	
	/**
	 * 更改密码
	 * @param account
	 * @param newPassword
	 * @param oldPassword
	 */
	public void updatePassword(Map<String, String> map)
	{
		dao.updatePassword(map);
	}
	
	/**
	 * 删除学生
	 * @param studentId
	 */
	public void deleteStudent(String studentId)
	{
		dao.deleteStudent(studentId);
	}
}

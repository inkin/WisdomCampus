package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.ListDocumentImpl;
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
	public Student selectStudentByName(String studentName){
		return dao.selectStudentByName(studentName);
	}

	public Student login(String account) {
		return dao.login(account);
	}
	
	public List<Student> selectClassmates(String account){
		return dao.selectClassmates(account);
	}
	
	public void updateExpression(String account,String expression){
		dao.updateExpression(account, expression);
	}
	
	public void updatePassword(String account,String newPassword){
		dao.updatePassword(account, newPassword);
	}
}

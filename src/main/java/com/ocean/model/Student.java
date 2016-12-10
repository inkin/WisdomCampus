package com.ocean.model;

/**
 * 学生实体类
 * @author Ocean
 *
 */
public class Student {
	private String studentNo;
	private String studentName;
	private String studentTell;
	private String studentMail;
	private String studentPicture;
	private String studentSex;
	private String classNo;
	private String expression;
	private String password;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTell() {
		return studentTell;
	}

	public void setStudentTell(String studentTell) {
		this.studentTell = studentTell;
	}

	public String getStudentMail() {
		return studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

	public String getStudentPicture() {
		return studentPicture;
	}

	public void setStudentPicture(String studentPicture) {
		this.studentPicture = studentPicture;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentTell=" + studentTell
				+ ", studentMail=" + studentMail + ", studentPicture=" + studentPicture + ", studentSex=" + studentSex
				+ ", classNo=" + classNo + ", expression=" + expression + ", password=" + password + "]";
	}

	public Student(String studentNo, String studentName, String studentTell, String studentMail, String studentPicture,
			String studentSex, String classNo, String expression, String password) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentTell = studentTell;
		this.studentMail = studentMail;
		this.studentPicture = studentPicture;
		this.studentSex = studentSex;
		this.classNo = classNo;
		this.expression = expression;
		this.password = password;
	}

	public Student(String studentNo, String studentName, String studentTell, String studentMail, String studentPicture,
			String studentSex, String classNo, String expression) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentTell = studentTell;
		this.studentMail = studentMail;
		this.studentPicture = studentPicture;
		this.studentSex = studentSex;
		this.classNo = classNo;
		this.expression = expression;
	}

	public Student() {

	}


}

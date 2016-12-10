package com.ocean.model;

/**
 * 教师实体类
 * @author Ocean
 *
 */
public class Teacher {
	private String teacherNo;
	private String teacherName;
	private String teacherDegree;
	private String teacherTell;
	private String teacherMail;
	private String teacherPicture;
	private String expression;
	private String instituteNo;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherDegree() {
		return teacherDegree;
	}

	public void setTeacherDegree(String teacherDegree) {
		this.teacherDegree = teacherDegree;
	}

	public String getTeacherTell() {
		return teacherTell;
	}

	public void setTeacherTell(String teacherTell) {
		this.teacherTell = teacherTell;
	}

	public String getTeacherMail() {
		return teacherMail;
	}

	public void setTeacherMail(String teacherMail) {
		this.teacherMail = teacherMail;
	}

	public String getTeacherPicture() {
		return teacherPicture;
	}

	public void setTeacherPicture(String teacherPicture) {
		this.teacherPicture = teacherPicture;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getInstituteNo() {
		return instituteNo;
	}

	public void setInstituteNo(String instituteNo) {
		this.instituteNo = instituteNo;
	}

	@Override
	public String toString() {
		return "Teacher [teacherNo=" + teacherNo + ", teacherName=" + teacherName + ", teacherDegree=" + teacherDegree
				+ ", teacherTell=" + teacherTell + ", teacherMail=" + teacherMail + ", teacherPicture=" + teacherPicture
				+ ", expression=" + expression + ", instituteNo=" + instituteNo + ", password=" + password + "]";
	}

	public Teacher() {

	}

	public Teacher(String teacherNo, String teacherName, String teacherDegree, String teacherTell, String teacherMail,
			String teacherPicture, String expression, String instituteNo, String password) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.teacherDegree = teacherDegree;
		this.teacherTell = teacherTell;
		this.teacherMail = teacherMail;
		this.teacherPicture = teacherPicture;
		this.expression = expression;
		this.instituteNo = instituteNo;
		this.password = password;
	}

	public Teacher(String teacherNo, String teacherName, String teacherDegree, String teacherTell, String teacherMail,
			String teacherPicture, String expression, String instituteNo) {
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.teacherDegree = teacherDegree;
		this.teacherTell = teacherTell;
		this.teacherMail = teacherMail;
		this.teacherPicture = teacherPicture;
		this.expression = expression;
		this.instituteNo = instituteNo;
	}

}

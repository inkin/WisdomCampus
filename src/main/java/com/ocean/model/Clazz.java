package com.ocean.model;

/**
 * 班级实体类
 * 
 * @author Ocean
 *
 */

public class Clazz {
	private String classNo;
	private String className;
	private int classMember;
	private String classGrade;
	private String instituteNo;

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassMember() {
		return classMember;
	}

	public void setClassMember(int classMember) {
		this.classMember = classMember;
	}

	public String getClassGrade() {
		return classGrade;
	}

	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}

	public String getInstituteNo() {
		return instituteNo;
	}

	public void setInstituteNo(String instituteNo) {
		this.instituteNo = instituteNo;
	}

	@Override
	public String toString() {
		return "Clazz [classNo=" + classNo + ", className=" + className + ", classMember=" + classMember
				+ ", classGrade=" + classGrade + ", instituteNo=" + instituteNo + "]";
	}

	public Clazz(String classNo, String className, int classMember, String classGrade, String instituteNo) {
		this.classNo = classNo;
		this.className = className;
		this.classMember = classMember;
		this.classGrade = classGrade;
		this.instituteNo = instituteNo;
	}

	public Clazz() {

	}

}

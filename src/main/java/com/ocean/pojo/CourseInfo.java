package com.ocean.pojo;

public class CourseInfo {
	private String courseName;
	private String courseTerm;
	private String teacherName;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTerm() {
		return courseTerm;
	}
	public void setCourseTerm(String courseTerm) {
		this.courseTerm = courseTerm;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public CourseInfo(String courseName, String courseTerm, String teacherName) {
		this.courseName = courseName;
		this.courseTerm = courseTerm;
		this.teacherName = teacherName;
	}
	public CourseInfo() {
	}
	
	
}

package com.ocean.model;
/**
 * 课程实体类
 * @author Ocean
 *
 */
public class Course {
	private String courseNo;
	private String courseName;
	private String courseTerm;
	private String teacherNo;

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

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

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	@Override
	public String toString() {
		return "Course [courseNo=" + courseNo + ", courseName=" + courseName + ", courseTerm=" + courseTerm
				+ ", teacherNo=" + teacherNo + "]";
	}

	public Course(String courseNo, String courseName, String courseTerm, String teacherNo) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.courseTerm = courseTerm;
		this.teacherNo = teacherNo;
	}

	public Course() {

	}

}

package net.skhu.dto;

import java.util.Date;

public class Register {
	int id;
	int studentId;
	String StudentNumber;
	String StudentName;
	int courseId;
	String courseName;
	int unit;
	int grade;
	Date createDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}

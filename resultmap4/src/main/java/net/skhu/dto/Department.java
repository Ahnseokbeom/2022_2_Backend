package net.skhu.dto;

import java.util.List;

import lombok.Data;

@Data
public class Department {
	int id;
	int departmentId;
	String departmentName;
	List<Student> student;
}

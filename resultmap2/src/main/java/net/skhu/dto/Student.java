package net.skhu.dto;

import lombok.Data;

@Data
public class Student {
	int id;
	String studentNumber;
	String name;
	String department;
	int year;
}
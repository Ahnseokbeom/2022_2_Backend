package net.skhu.dto;

import lombok.Data;

@Data
public class Project {
	int id;
	String title;
	int managerId;
	int progress;
	String priority;
	Manager manager;
}

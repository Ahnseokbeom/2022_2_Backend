package net.skhu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String title;
	int progress;
	String priority;
	
	@ManyToOne
	@JoinColumn(name = "managerId")
	Manager manager;
	
	@JsonIgnore
	@ToString.Exclude
	@OneToMany(mappedBy="project")
	List<Assignment> assignment;
	
}

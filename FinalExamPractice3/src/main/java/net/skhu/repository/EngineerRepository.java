package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer>{
	
	Engineer findByEmployeeNo(String employeeNo);
	
	List<Engineer> findByName(String name);
	
	List<Engineer> findByNameStartsWith(String name);
	
	List<Engineer> findByRoleTitle(String title);
}

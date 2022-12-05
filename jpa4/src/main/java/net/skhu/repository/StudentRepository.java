package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	Student findByStudentNo(String studentNo);
	// select * from student where studentNo = ${studentNo};
	
	List<Student> findByName(String name);
	// select * from student where name = ${name}
	
	List<Student> findByNameStartsWith(String name);
	// select * from student where name like ${name}%
	
	List<Student> findByDepartmentName(String name);
	
	List<Student> findByDepartmentNameStartsWith(String name);
	
	List<Student> findByOrderByName();
	// select * from student order by name
	
	List<Student> findByOrderByNameDesc();
	// select * from student order by name desc
	List<Student> findByDepartmentIdOrderByNameDesc(int id);
	// select * from student where departmentId = ${id} order by name desc
	
	List<Student> findByDepartmentIdOrderByName(int id);
	// select * from student where departmentId = ${id} order by name
}

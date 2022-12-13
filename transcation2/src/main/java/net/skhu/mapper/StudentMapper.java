package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	@Select("select s.*, d.name departmentName from student s left join department d on s.departmentId= d.id")
	List<Student> findAll();
	
	@Delete("delete from student where id = #{id};")
	void deleteById(int id);
}

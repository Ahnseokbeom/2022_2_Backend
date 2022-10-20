package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	@ResultMap("StudentWithDepartment")
	@Select("select * from student s join department d on s.departmentId = d.id order by s.id;")
	List<Student> findAll();
}
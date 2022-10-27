package net.skhu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.skhu.dto.Engineer;

@Mapper
public interface EngineerMapper {
	@Select("SELECT * FROM engineer WHERE id = #{id}")
	Engineer findOne(int id);


	@Select("select e.*, r.title from engineer e join role r on e.roleId = r.id;")
	List<Engineer> findAll();

	@Insert("INSERT Engineer (employeeNo, name, roleId, sex, phone, email) "
			+ "values( #{employeeNo}), #{name}, #{roleId}, #{sex}, #{phone}, #{email}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Engineer Engineer);

	@Update("UPDATE Engineer SET " + " employeeNo = #{employeeNo}, " + " name = #{name}, "
			+ " roleId = #{roleId}, " + " sex = #{sex} " + " phone = #{phone} " +" email = #{email} " +"WHERE id = #{id} ")
	void update(Engineer engineer);

	@Delete("DELETE FROM engineer WHERE id = #{id}")
	void delete(int id);
	}
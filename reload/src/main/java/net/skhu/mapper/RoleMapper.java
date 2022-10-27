package net.skhu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.skhu.dto.Role;

@Mapper
public interface RoleMapper {
	@Select("SELECT * FROM role")
	List<Role> findAll();

	@Select("SELECT * FROM role WHERE id = #{id}")
	Role findOne(int id);
}
package net.skhu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import net.skhu.dto.Project;

@Mapper
public interface ProjectMapper {
	List<Project> findAll();
}
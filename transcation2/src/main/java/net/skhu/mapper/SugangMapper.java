package net.skhu.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SugangMapper {
	@Delete("delete from sugang where studentId = #{studentId};")
	void deleteByStudentId(int studentId);
}

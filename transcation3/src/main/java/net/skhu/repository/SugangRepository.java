package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.skhu.entity.Sugang;

public interface SugangRepository extends JpaRepository<Sugang, Integer> {
	
	void deleteByStudentId(int studentId);
}
package net.skhu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.skhu.entity.Student;
import net.skhu.repository.StudentRepository;
import net.skhu.repository.SugangRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	SugangRepository sugangRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Transactional
	public void deleteById(int id) {
		sugangRepository.deleteByStudentId(id);
		studentRepository.deleteById(id);
	}
}
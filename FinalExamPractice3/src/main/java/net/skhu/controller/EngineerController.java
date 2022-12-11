package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.entity.Engineer;
import net.skhu.repository.EngineerRepository;

@RestController
public class EngineerController {
	@Autowired EngineerRepository engineerRepository;
	
	@RequestMapping("test1")
	public Engineer test1() {
		return engineerRepository.findByEmployeeNo("19721");
	}
	
	@RequestMapping("test2")
	public List<Engineer> test2() {
		return engineerRepository.findByName("박진희");
	}
	
	@RequestMapping("test3")
	public List<Engineer> test3(){
		return engineerRepository.findByNameStartsWith("김");
	}
	
	@RequestMapping("test4")
	public List<Engineer> test4(){
		return engineerRepository.findByRoleTitle("백엔드개발자");
	}
}

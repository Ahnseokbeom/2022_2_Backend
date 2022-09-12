package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.dto.Person;
import net.skhu.dto.Student;

@Controller
@RequestMapping("third")
public class ThirdController {
	
	@RequestMapping(value="test1",method=RequestMethod.GET)
	public String test1(Model model) {
		model.addAttribute("person",new Person());
		return "third/test1";
	}
	@RequestMapping(value="test1",method=RequestMethod.POST)
	public String test1(Model model, Person person) {
		model.addAttribute("message","저장되었습니다.");
		return "third/test1";
	}
	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("person",new Person());
		return "third/test1";
	}
	@PostMapping("test2")
	public String test2(Model model, Person person) {
		model.addAttribute("message","저장되었습니다.");
		return "third/test1";
	}
	@GetMapping("test3")
	public String test3(Model model) {
		model.addAttribute("student",new Student());
		return "third/test3";
	}
	@PostMapping("test3")
	public String test3(Model model, Student student) {
		model.addAttribute("message","저장완료!");
		return "third/test3";
	}
}

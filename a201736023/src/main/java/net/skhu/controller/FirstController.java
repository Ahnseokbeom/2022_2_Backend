package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.dto.Student;

@Controller
public class FirstController {
	@RequestMapping("exam1")
	public String exam1(Model model) {
		model.addAttribute("studentNo", "201736023");
		model.addAttribute("name", "안석범");
		model.addAttribute("semester","8");
		return "exam1";
	}
	@RequestMapping("exam2")
	public String exam2(Model model) {
		Student stu = new Student("201736023", "안석범", 8);
		model.addAttribute("stu",stu);
		return "exam2";
	}
	@RequestMapping(value="exam3", method = RequestMethod.GET)
	public String exam3(Model model) {
		model.addAttribute("stu",new Student());
		return "exam3";
	}
	@RequestMapping(value = "exam3", method=RequestMethod.POST)
	public String exam3(Model model, Student stu) {
		model.addAttribute("message","저장되었습니다.");
		model.addAttribute("stu", stu);
		return "exam3";
	}
	@RequestMapping(value="exam4", method = RequestMethod.GET)
	public String exam4(Model model) {
		Student stu = new Student("201736023","안석범",8);
		model.addAttribute("stu",stu);
		return "exam4";
	}
	@RequestMapping(value = "exam4", method=RequestMethod.POST)
	public String exam4(Model model, Student stu) {
		model.addAttribute("message","저장되었습니다.");
		model.addAttribute("stu", stu);
		return "exam4";
	}
}
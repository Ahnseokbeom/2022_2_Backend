package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.ProjectMapper;

@Controller
public class ProjectController {
	@Autowired ProjectMapper projectMapper;
	
	@RequestMapping("project/list")
	public String list(Model model) {
		model.addAttribute("project",projectMapper.findAll());
		return "project/list";
	}
}

package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.entity.Jumoon;
import net.skhu.repository.JumoonRepository;

@Controller
@RequestMapping("exam")
public class JumoonController {
	@Autowired JumoonRepository JR;
	
}

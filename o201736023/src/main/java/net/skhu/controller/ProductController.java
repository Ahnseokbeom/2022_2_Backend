package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Product;
import net.skhu.repository.CategoryRepository;
import net.skhu.repository.ProductRepository;

@Controller
@RequestMapping("exam")
public class ProductController {
	@Autowired CategoryRepository CR;
	@Autowired ProductRepository PR;
	
	@RequestMapping("list1")
	public String list1(Model model) {
		List<Product> products = PR.findAll();
		model.addAttribute("products",products);
		return "exam/list1";
	}
	
	@RequestMapping("list2")
	public String list2(Model model) {
		List<Product> products = PR.findAll();
		model.addAttribute("products",products);
		return "exam/list2";
	}
	@RequestMapping("list3")
	public String list3(Model model) {
		return "exam/list3";
	}
	
	@RequestMapping("list4")
	public String list4(Model model) {
		return "exam/list4";
	}
}

package net.skhu.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.info.model.Student;

@RestController
public class InfoController {
	@GetMapping("/info")
	public Object projectInfo() {
		Student student = new Student();
		return student;
	}
}

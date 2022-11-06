package net.skhu.info;

import java.util.Date;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.info.model.Project;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class InfoController {
	@GetMapping("/info")
	public Object projectInfo() {
		log.debug("/info start");
		Project pro = new Project();
		pro.projectName = "test";
		pro.author = "SB";
		pro.createDate = new Date();
		return pro;
	}
}

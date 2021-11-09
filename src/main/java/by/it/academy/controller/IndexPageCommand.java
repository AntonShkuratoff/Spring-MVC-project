package by.it.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageCommand {
	
	@RequestMapping("/")
	public String execute() {
		return "redirect:controller/news-list";
	}
}

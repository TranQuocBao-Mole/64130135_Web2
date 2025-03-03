package bao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("Say Hi")
	public String SayHello() {
		return "chao";
	}
}

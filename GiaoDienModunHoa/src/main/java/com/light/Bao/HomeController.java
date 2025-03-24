package com.light.Bao;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	  @GetMapping("/")
	    public String home() {
	        return "frontEnd/index";
	    }

	    @GetMapping("/about")
	    public String about() {
	        return "frontEnd/about";
	    }
}
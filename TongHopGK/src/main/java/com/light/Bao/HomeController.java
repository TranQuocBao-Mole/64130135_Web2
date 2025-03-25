package com.light.Bao;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	  @GetMapping("/")
	    public String home() {
	        return "frontEnd/index";
	    }
	  @GetMapping("/")
	    public String list() {
	        return "frontEnd/list";
	    }
	  @GetMapping("/")
	    public String addnew() {
	        return "frontEnd/addnew";
	    }

	    @GetMapping("/about")
	    public String about() {
	        return "frontEnd/about";
	    }
}
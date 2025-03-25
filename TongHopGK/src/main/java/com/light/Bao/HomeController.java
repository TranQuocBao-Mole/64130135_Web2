package com.light.Bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class HomeController {
	  @GetMapping("/")
	    public String index() {
	        return "frontEnd/index";
	    }
	  @GetMapping("/list")
	    public String list() {
	        return "frontEnd/list";
	    }
	  @GetMapping("/addnew")
	    public String addnew() {
	        return "frontEnd/addnew";
	    }

	    @GetMapping("/about")
	    public String about() {
	        return "frontEnd/about";
	    }
}
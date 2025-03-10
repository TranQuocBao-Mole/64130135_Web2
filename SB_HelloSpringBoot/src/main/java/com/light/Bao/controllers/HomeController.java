package com.light.Bao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class HomeController {
	@GetMapping("/")
	public String trangChu() {
		return "index";
	}
	@GetMapping("/about")
	public String GioiThieu() {
		return "about";
	}
	@GetMapping("login")
	public String DangNhap() {
		return "login";
	}
}

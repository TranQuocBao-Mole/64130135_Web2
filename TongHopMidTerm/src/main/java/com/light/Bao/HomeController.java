package com.light.Bao;

import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HomeController {
	ArrayList<SinhVien> list = new ArrayList<SinhVien>();
	  @GetMapping("/Home")
	    public String Home(ModelMap model) {
	        return "frontEnd/Home";
	    }
		@GetMapping("/About")
	    public String About(ModelMap model) {
	        return "frontEnd/About";
	    }
		@GetMapping("/List")
		public String listMethod(ModelMap map) {
		
			list.add(new SinhVien("001", "Nguyen Van A", 8.5));
			list.add(new SinhVien("002", "Nguyen Van B", 7.5));
			list.add(new SinhVien("003", "Nguyen Van C", 9.5));
			map.addAttribute("list", list);
			return "frontend/List";
		}
		@GetMapping("/Addnew")
		public String DisplayStudent(ModelMap model) {
			model.addAttribute("list",list);
			return "frontEnd/Addnew";
		}
		@PostMapping("/Addnew")
		public String addStudent(ModelMap model, String mssv, String hoten, double dtb) {
			list.add(new SinhVien(mssv,hoten,dtb));
			model.addAttribute("list",list);
			return "frontEnd/Addnew";
		}
	
	
	  
}

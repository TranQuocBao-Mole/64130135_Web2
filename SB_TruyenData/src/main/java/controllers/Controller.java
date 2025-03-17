package controllers;


import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controller {
	@GetMapping("/profile")
	public String thongtinSV(ModelMap model) {
		 model.addAttribute("mssv", "64130854");
	        model.addAttribute("hoTen", "Nguyễn Bùi Quang Huy");
	        model.addAttribute("namSinh", 2004);
	        model.addAttribute("gioiTinh", "Nam");
	        return "profile";
	}
	
	@GetMapping("/truyenObject")
	public String getStudent(ModelMap model) {
		ArrayList<SinhVien> dsSinhViens=new ArrayList<SinhVien>();
		dsSinhViens.add(new SinhVien(64130854,"Nguyễn Bùi Quang Huy",21));
		dsSinhViens.add(new SinhVien(64130854,"Đồng Nguyên Quang",21));
		dsSinhViens.add(new SinhVien(64130854,"Miểu Văn Trung",21));
	
		model.addAttribute("students",dsSinhViens);
		return "sinhviens";
	}
	
	
}
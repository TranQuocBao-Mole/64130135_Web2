package com.light.Bao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BMIController {
    @GetMapping("BMI")
    public String showForm() {
        return "BMI"; 
    }
    
    @PostMapping("BMI")
    public String calculateBMI(ModelMap model, HttpServletRequest request) {
        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));
            String standard = request.getParameter("standard");
            
            if (weight <= 0 || height <= 0) {
                model.addAttribute("message", "Cân nặng và chiều cao phải lớn hơn 0");
                return "BMI";
            }
            
            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0; 
            String result;
            
            if ("asia".equals(standard)) {
                if (bmi < 18.5) {
                    result = "Gầy";
                } else if (bmi < 23) {
                    result = "Bình thường";
                } else if (bmi < 25) {
                    result = "Thừa cân";
                } else {
                    result = "Béo phì";
                }
            } else { 
                if (bmi < 18.5) {
                    result = "Gầy";
                } else if (bmi < 24.9) {
                    result = "Bình thường";
                } else if (bmi < 29.9) {
                    result = "Thừa cân";
                } else {
                    result = "Béo phì";
                }
            }
            
            model.addAttribute("bmi", bmi);
            model.addAttribute("result", result);
            model.addAttribute("message", "Kết quả BMI của bạn: " + bmi + " - " + result);
            
        } catch (NumberFormatException e) {
            model.addAttribute("message", "Vui lòng nhập số hợp lệ");
        }
        
        return "BMI";
    }
}
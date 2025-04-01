package thiGK.ntu64130135.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    private List<Student> students = new ArrayList<>();

    // Hardcode some sample data
    public StudentController() {
        students.add(new Student("S001", "John Doe", "G01"));
        students.add(new Student("S002", "Jane Smith", "G02"));
    }

    @GetMapping("/all")
    public String listStudents(Model model) {
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/add";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        students.add(student);
        return "redirect:/student/all";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        Student student = students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("student", student);
        return "student/edit";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable String id, @ModelAttribute Student student) {
        students.removeIf(s -> s.getId().equals(id));
        students.add(student);
        return "redirect:/student/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        students.removeIf(s -> s.getId().equals(id));
        return "redirect:/student/all";
    }
}
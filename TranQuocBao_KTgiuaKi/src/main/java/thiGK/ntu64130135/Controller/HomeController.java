package thiGK.ntu64130135.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.Year;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("currentYear", Year.now().getValue());
        
        // Mock data - replace with real database calls
        model.addAttribute("dashboardStats", new DashboardStats(125, 42, 15));
        
        return "dashboard";
    }
    // Student endpoints
    @GetMapping("/student/list")
    public String showStudentList(Model model) {
        // Add student list data to model
        return "student/list";
    }

    @GetMapping("/student/add")
    public String showAddStudentForm(Model model) {
        // Add empty student object to model
        return "student/add";
    }

    // Topic endpoints
    @GetMapping("/topic/list")
    public String showTopicList(Model model) {
        // Add topic list data to model
        return "topic/list";
    }

    @GetMapping("/topic/add")
    public String showAddTopicForm(Model model) {
        // Add empty topic object to model
        return "topic/add";
    }

    public record DashboardStats(long studentCount, long topicCount, long supervisorCount) {}
}
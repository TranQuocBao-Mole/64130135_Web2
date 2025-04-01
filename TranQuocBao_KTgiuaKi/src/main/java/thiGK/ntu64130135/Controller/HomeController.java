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

    public record DashboardStats(long studentCount, long topicCount, long supervisorCount) {}
}
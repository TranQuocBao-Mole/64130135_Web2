package thiGK.ntu64130135.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.Year;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        // Set current year for the footer
        model.addAttribute("currentYear", Year.now().getValue());
        
        // Create dashboard statistics (you would replace this with actual service calls)
        DashboardStats stats = new DashboardStats();
        stats.setStudentCount(125);  // Replace with actual count from service
        stats.setTopicCount(42);    // Replace with actual count from service
        stats.setSupervisorCount(15); // Replace with actual count from service
        
        model.addAttribute("dashboardStats", stats);
        
        return "dashboard"; // This should match your Thymeleaf template name (dashboard.html)
    }
    
    // Inner class for dashboard statistics
    public static class DashboardStats {
        private long studentCount;
        private long topicCount;
        private long supervisorCount;
        
        // Getters and setters
        public long getStudentCount() {
            return studentCount;
        }
        
        public void setStudentCount(long studentCount) {
            this.studentCount = studentCount;
        }
        
        public long getTopicCount() {
            return topicCount;
        }
        
        public void setTopicCount(long topicCount) {
            this.topicCount = topicCount;
        }
        
        public long getSupervisorCount() {
            return supervisorCount;
        }
        
        public void setSupervisorCount(long supervisorCount) {
            this.supervisorCount = supervisorCount;
        }
    }
}
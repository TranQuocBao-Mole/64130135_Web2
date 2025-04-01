package thiGK.ntu64130135.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add any model attributes needed for the dashboard
        model.addAttribute("pageTitle", "Dashboard");
        return "dashboard"; // This corresponds to dashboard.html
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return home(model); // Reuse the home method
    }


}
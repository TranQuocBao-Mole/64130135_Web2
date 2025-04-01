package thiGK.ntu64130135.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import model.Topic;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {
    
    private List<Topic> topics = new ArrayList<>();

    // Hardcode some sample data
    public TopicController() {
        topics.add(new Topic("T001", "Spring Boot", "SUP01", "Framework"));
        topics.add(new Topic("T002", "AI Basics", "SUP02", "Theory"));
    }

    @GetMapping("/all")
    public String listTopics(Model model) {
        model.addAttribute("topics", topics);
        return "topic/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("topic", new Topic());
        return "topic/add";
    }

    @PostMapping("/save")
    public String saveTopic(@ModelAttribute Topic topic) {
        topics.add(topic);
        return "redirect:/topic/all";
    }
}
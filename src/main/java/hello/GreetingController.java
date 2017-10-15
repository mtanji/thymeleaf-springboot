package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting) {
//        return "result";
//    }

    private List<Greeting> greetings = new ArrayList<>();

    @PostMapping("/greeting")
    public String greetingSubmit(Model model , @ModelAttribute Greeting greeting) {
    	greetings.add(greeting);
    	model.addAttribute("greetings", greetings);
        return "result2";
    }
}

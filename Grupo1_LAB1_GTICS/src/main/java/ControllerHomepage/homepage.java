package ControllerHomepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepage {
    @GetMapping("/homepage")
    public String homePage(){
        return "Bitcoin";
    }
}

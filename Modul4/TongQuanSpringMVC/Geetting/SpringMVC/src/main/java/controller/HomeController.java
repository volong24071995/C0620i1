package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message", "HELLOL HGO GFSJF");
        return "index";
    }

    @GetMapping(value = "/greeting")
    public  String greeting(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("name", name);
        return  "greeting";
    }

}
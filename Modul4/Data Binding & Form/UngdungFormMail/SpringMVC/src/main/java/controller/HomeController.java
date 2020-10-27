package controller;

import model.PagesEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    public static String[] languages={"English", "Vietnamese", "Japanese", "Chinese"};
    private static Integer[] size={ 5, 10, 15, 25, 50, 100};

    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("pagesEmail",new PagesEmail());
        model.addAttribute("languages", languages);
        model.addAttribute("size", size);
        return "index";
    }

    @PostMapping(value = "/greeting")
    public  String greeting(@ModelAttribute PagesEmail pagesEmail, Model model){
        model.addAttribute("pagesEmail",pagesEmail);
        return  "greeting";
    }

}
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller

public class HomeController {
    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "condiment",required = false, defaultValue ="Chon it nhat 1 cai " ) String[] condiment,Model model) {
        model.addAttribute("condiment",condiment);
        return "greeting";

    }

}
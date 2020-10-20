package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.DictionaryService;

@Controller
public class HomeController {
    private static DictionaryService dictionaryService=new DictionaryService();
    @GetMapping(value = "/search")
    public String index(){
        return "index";
    }

    @PostMapping (value = "/result")
    public  String result(@RequestParam String name, Model model){
        String mean=dictionaryService.findOne(name);
        if (mean!=null){
            model.addAttribute("name",name);
            model.addAttribute("mean",mean);
        }else {
            model.addAttribute("message","Not found");
        }
        return  "greeting";
    }

}
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyentienController {
    @GetMapping(value = "/chuyentien")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/result")
    public  String greeting(@RequestParam double usd,@RequestParam double tigia , Model model){
        double result=usd*tigia;
        model.addAttribute("usd", usd);
        model.addAttribute("tigia", tigia);
        model.addAttribute("ketqua", result);
        return  "greeting";
    }
}
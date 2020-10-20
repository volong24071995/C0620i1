package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    private boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @GetMapping("/check")
    String check() {
        return "index";
    }

    @PostMapping(value = "/validate")
    public  String greeting(@RequestParam String email, Model model){
        if (validateEmail(email)){
            model.addAttribute("name", email);
            return  "greeting";
        }else {
            model.addAttribute("message", "Email is invalid");
            return "index";
        }
    }

}
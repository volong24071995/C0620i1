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
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/greeting")
    public  String greeting(@RequestParam(value = "first",required = false,defaultValue = "0") String first,
                            @RequestParam (value = "second",required = false,defaultValue = "0") String second,
                            @RequestParam String operator, Model model){
        double a=Double.parseDouble(first);
        double b=Double.parseDouble(second);
        double result=0;
        String cmt=null;
        switch (operator){
            case "Addition(+)":
                result=a+b;
                break;
            case "Subtraction(-)":
                result=a-b;
                break;
            case "Multiplication(x)":
                result=a*b;
                break;
            case "Division(/)":
                if (b==0){
                    cmt="Khong thể chia cho 0";
                }else {
                    result=a/b;
                }
                break;
        }
        model.addAttribute("result",result);
        model.addAttribute("cmt",cmt);
        return  "greeting";
    }

}
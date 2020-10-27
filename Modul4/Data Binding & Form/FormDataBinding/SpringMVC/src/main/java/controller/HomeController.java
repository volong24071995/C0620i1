package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @GetMapping(value = "/employee")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping(value = "/addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "info";
    }

}
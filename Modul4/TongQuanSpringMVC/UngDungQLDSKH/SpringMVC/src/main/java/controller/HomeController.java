package controller;

import dao.ManagementCustomersDAO;
import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    private static ManagementCustomersDAO managementCustomersDAO=new ManagementCustomersDAO();
    @GetMapping(value = "/list")
    public String list(Model model){
        List<Customer> list=managementCustomersDAO.findAll();
        model.addAttribute("customers", list);
        return "index";
    }

    @GetMapping(value = "/edit")
    public  String edit(@RequestParam int id, Model model){
        Customer customer=managementCustomersDAO.findOne(id);
        model.addAttribute("customer", customer);
        model.addAttribute("action","/update" );
        return  "edit";
    }

    @PostMapping (value = "/update")
    public  String update(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam String address, Model model){
        Customer customer=new Customer(id,name,email,address);
        managementCustomersDAO.update(customer);
        List<Customer> list=managementCustomersDAO.findAll();
        model.addAttribute("customers", list);
        return "index";
    }

    @GetMapping(value = "/create")
    public  String save(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer", customer);
        model.addAttribute("action","/save" );
        return  "edit";
    }

    @PostMapping (value = "/save")
    public  String save(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam String address, Model model){
        Customer customer=new Customer(id,name,email,address);
        managementCustomersDAO.save(customer);
        List<Customer> list=managementCustomersDAO.findAll();
        model.addAttribute("customers", list);
        return "index";
    }

    @GetMapping(value = "/delete")
    public  String delete(@RequestParam int id, Model model){
        managementCustomersDAO.deleteById(id);
        List<Customer> list=managementCustomersDAO.findAll();
        model.addAttribute("customers", list);
        return "index";
    }


}
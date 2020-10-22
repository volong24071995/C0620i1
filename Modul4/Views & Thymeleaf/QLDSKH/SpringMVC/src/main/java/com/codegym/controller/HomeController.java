package com.codegym.controller;

import com.codegym.dao.ManagementCustomersDAO;
import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ManagementCustomersDAO managementCustomersDAO;

    @GetMapping("/list")
    public ModelAndView index() {
        List<Customer> customerList = managementCustomersDAO.findAll();
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public ModelAndView create() {
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirect) {
        managementCustomersDAO.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/list";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", managementCustomersDAO.findOne(id));
        return "/delete";
    }

    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        managementCustomersDAO.deleteById(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/list";
    }
    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", managementCustomersDAO.findOne(id));
        return "/view";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", managementCustomersDAO.findOne(id));
        return "/edit";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        managementCustomersDAO.update(customer);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/list";
    }

}
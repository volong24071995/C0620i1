package com.codegym.controller;

import com.codegym.dao.ManagementCustomersDAO;
import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customers")
public class HomeController {
    @Autowired
    private ManagementCustomersDAO managementCustomersDAO;

    @GetMapping
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView("/index");
        List<Customer> list=managementCustomersDAO.findAll();
        modelAndView.addObject("customers", list);
        return modelAndView;
    }

    @GetMapping(value = "/edit")
    public  ModelAndView edit(@RequestParam int id){
        Customer customer=managementCustomersDAO.findOne(id);
        ModelAndView modelAndView=new ModelAndView("edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("action","/update" );
        return  modelAndView;
    }


    @PostMapping (value = "/update")
    public  String update(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam String address, Model model){
        Customer customer=new Customer(id,name,email,address);
        managementCustomersDAO.update(customer);
        return "redirect:/customers";
    }

    @GetMapping(value = "/create")
    public  ModelAndView save(){
        Customer customer=new Customer();
        ModelAndView modelAndView=new ModelAndView("edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("action","/save" );
        return modelAndView;
    }

    @PostMapping (value = "/save")
    public  String save(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam String address, Model model){
        Customer customer=new Customer(id,name,email,address);
        managementCustomersDAO.save(customer);
        return "redirect:/customers";
    }

    @GetMapping(value = "/delete")
    public  String delete(@RequestParam int id, Model model){
        managementCustomersDAO.deleteById(id);
        return "redirect:/customers";
    }


}
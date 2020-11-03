package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.model.Province;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping(produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView showList(@RequestParam("s") Optional<String> s, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        Page<Customer> customers;
        if(s.isPresent()){
            customers = customerService.findAllByNameContaining(s.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        modelAndView.addObject("customers", customers);

        return modelAndView;
    }

    @GetMapping(value = "{id}",produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customer = customerService.findOne(id);
        Iterable<Province> provinces=provinceService.findAll();
        modelAndView.addObject("provinces", provinces);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping(produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String updateCustomer(Customer customer,long province) {
        customer.setProvince(provinceService.findById(province));
        customerService.save(customer);
        return "redirect:/customers";
    }

    @GetMapping(value = "/create",produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView=new ModelAndView("customers/create");
        modelAndView.addObject("customer",new Customer());
        Iterable<Province> provinces = provinceService.findAll();
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }

    @PostMapping(value = "/save",produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String saveCustomer(Customer customer, long province) {
        customer.setProvince(provinceService.findById(province));
        customerService.save(customer);
        return "redirect:/customers";
    }

    @GetMapping(value = "/delete/{id}",produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String delete(@PathVariable Long id) {
        customerService.remove(id);
        return "redirect:/customers";
    }
}


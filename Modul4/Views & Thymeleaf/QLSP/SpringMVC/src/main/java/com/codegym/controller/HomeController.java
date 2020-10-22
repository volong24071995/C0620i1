package com.codegym.controller;

import com.codegym.dao.ProductDAO;
import com.codegym.model.Product;
import com.codegym.model.ProductLine;
import com.codegym.service.ProductLineService;
import com.codegym.service.ProductService;
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
    private ProductService productService;
    @Autowired
    private ProductLineService productLineService;

    @GetMapping("/list")
    public ModelAndView index() {
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("products", productList);
        return modelAndView;
    }

    @GetMapping("/products/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        List<ProductLine> lineList=productLineService.findAll();
        model.addAttribute("lineList",lineList);
        return "create";
    }

    @PostMapping("/products/save")
    public String save(Product product, RedirectAttributes redirect) {
        ProductLine productLine=productLineService.findOne(product.getMaProductLine());
        product.setProductLine(productLine);
        productService.save(product);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/list";
    }

    @GetMapping("/products/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        Product product=productService.findOne(id);
        model.addAttribute("product",product );
        return "/delete";
    }

    @PostMapping("/products/delete")
    public String delete(Product customer, RedirectAttributes redirect) {
        productService.deleteById(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/list";
    }

    @GetMapping("/products/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findOne(id));
        return "/view";
    }

    @GetMapping("/products/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findOne(id));
        List<ProductLine> lineList=productLineService.findAll();
        model.addAttribute("lineList",lineList);
        return "/edit";
    }

    @PostMapping("/products/update")
    public String update(Product product, RedirectAttributes redirect) {
        ProductLine productLine=productLineService.findOne(product.getMaProductLine());
        product.setProductLine(productLine);
        productService.update(product);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/list";
    }

}
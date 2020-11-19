package com.codegym.demo.controller;


import com.codegym.demo.model.Category;
import com.codegym.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.sql.SQLException;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public ModelAndView listProvinces(Pageable pageable){
        Page<Category> categories = categoryService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @GetMapping("/create-category")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView saveProvince(@ModelAttribute("category") Category category){
        try {
            categoryService.save(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ModelAndView modelAndView = new ModelAndView("/category/create");
            modelAndView.addObject("category", new Category());
            modelAndView.addObject("message", "New province created successfully");
            return modelAndView;
        }
    }

    @GetMapping("/edit-category/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Category category = categoryService.findById(id);
        if(category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-category")
    public ModelAndView updateProvince(@ModelAttribute("category") Category category){
        try {
            categoryService.save(category);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category);
            modelAndView.addObject("message", "Province updated successfully");
            return modelAndView;
        }
    }

    @GetMapping("/delete-category/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Category category = categoryService.findById(id);
        if(category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category", category);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-category")
    public String deleteProvince(@ModelAttribute("category") Category category){
        try {
            categoryService.delete(category.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return "redirect:categories";
        }
    }

}

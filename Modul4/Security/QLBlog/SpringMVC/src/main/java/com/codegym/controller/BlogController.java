package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/blogs")
    public ModelAndView showBlogList() {
        ModelAndView modelAndView = new ModelAndView("/blog/index");
        return modelAndView;
    }

    @GetMapping("/blogs/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        return modelAndView;
    }

    @GetMapping("/blogs/loginUser")
    public ModelAndView loginUser() {
        ModelAndView modelAndView = new ModelAndView("/blog/wellcome");
        return modelAndView;
    }


}
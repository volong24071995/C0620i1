package com.codegym.blog.controller;

import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        return modelAndView;
    }
}

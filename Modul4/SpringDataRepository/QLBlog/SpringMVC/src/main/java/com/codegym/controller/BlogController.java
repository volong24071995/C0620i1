package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog")Blog blog,long category) {
        blog.setCategory(categoryService.findById(category));
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("categories", categoryService.findAll());
        modelAndView.addObject("message", "Blog created successfully");
        return modelAndView;
    }

    @GetMapping("/blogers")
    public ModelAndView showBlogList(@RequestParam("s") Optional<String> s, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/blog/index");
        Page<Blog> blogs;
        if(s.isPresent()){
            blogs = blogService.findAllByNameContaining(s.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showUpdateForm(@PathVariable Long id) {
        Blog bloger = blogService.findOne(id);
        if (bloger != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", bloger);
            modelAndView.addObject("categories", categoryService.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView update(@ModelAttribute("blog")Blog blog,long category) {
        blog.setCategory(categoryService.findById(category));
        blogService.save(blog);

        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("categories", categoryService.findAll());
        modelAndView.addObject("message", "Updated blog successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Blog blog = blogService.findOne(id);

        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String delete(@ModelAttribute("blog")Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:blogers";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView view(@PathVariable Long id) {
        Blog blog = blogService.findOne(id);

        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
}
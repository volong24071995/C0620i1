package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogServiceIplm;

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog")Blog blog) {
        blogServiceIplm.save(blog);

        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog created successfully");
        return modelAndView;
    }

    @GetMapping("/blogers")
    public ModelAndView showBlogList() {
        List<Blog> blog = blogServiceIplm.findAll();

        ModelAndView modelAndView = new ModelAndView("/blog/index");
        modelAndView.addObject("blogs", blog);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showUpdateForm(@PathVariable Long id) {
        Blog bloger = blogServiceIplm.findById(id);
        if (bloger != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", bloger);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView update(@ModelAttribute("blog")Blog blog) {
        blogServiceIplm.save(blog);

        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Updated blog successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Blog blog = blogServiceIplm.findById(id);

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
        blogServiceIplm.remove(blog.getId());
        return "redirect:blogers";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView view(@PathVariable Long id) {
        Blog blog = blogServiceIplm.findById(id);

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
package com.codegym.blog.controller;

import com.codegym.blog.model.Category;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiCategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/api/categories/", method = RequestMethod.GET)
    public Page<Category> listAllCategory(Pageable pageable ) {
        Page<Category> categories = categoryService.findAll(pageable);
        return categories;
    }

    @RequestMapping(value = "/api/categories/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Category getCategory(@PathVariable("id") long id) {
        Category category = categoryService.findById(id);
        return  category;
    }

}

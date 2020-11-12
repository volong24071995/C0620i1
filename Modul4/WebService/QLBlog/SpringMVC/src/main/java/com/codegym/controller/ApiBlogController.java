package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiBlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/api/blogs/", method = RequestMethod.GET)
    public ResponseEntity<Page<Blog>> listAllCustomers(Pageable pageable) {
        Page<Blog> blogs = (Page<Blog>) blogService.findAll(pageable);
        if (blogs.isEmpty()) {
            return new ResponseEntity<Page<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Page<Blog>>(blogs, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/blogs/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getCustomer(@PathVariable("id") long id) {
        System.out.println("Fetching blog with id " + id);
        Blog blog = blogService.findOne(id);
        if (blog == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/blogs/listBlogs/{id}", method = RequestMethod.GET)
    public ResponseEntity<Page<Blog>> listBlogsByCategoryId(@PathVariable("id") long id, Pageable pageable) {
        Page<Blog> blogs = (Page<Blog>) blogService.findAllByCategoryId(id,pageable);
        if (blogs.isEmpty()) {
            return new ResponseEntity<Page<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Page<Blog>>(blogs, HttpStatus.OK);
    }
}

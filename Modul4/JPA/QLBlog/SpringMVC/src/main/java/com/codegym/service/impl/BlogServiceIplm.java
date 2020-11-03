package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.repository.BlogerRepository;
import com.codegym.repository.impl.BlogerRepositoryIplm;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class BlogServiceIplm implements BlogService {

    @Autowired
    private BlogerRepository blogServiceIplm;

    @Override
    public List<Blog> findAll() {
        return blogServiceIplm.findAll();
    }

    @Override
    public Blog findById(long id) {
        return blogServiceIplm.findById(id);
    }

    @Override
    public void save(Blog bloger) {
        blogServiceIplm.save(bloger);
    }

    @Override
    public void remove(long id) {
        blogServiceIplm.remove(id);
    }
}
package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(long id);

    void save(Blog bloger);

    void remove(long id);
}
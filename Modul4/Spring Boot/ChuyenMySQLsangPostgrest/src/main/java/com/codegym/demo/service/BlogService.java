package com.codegym.demo.service;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService extends BaseService<Blog> {

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}

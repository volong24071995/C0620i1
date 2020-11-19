package com.codegym.demo.service.impl;


import com.codegym.demo.model.Blog;
import com.codegym.demo.repository.BlogRepository;
import com.codegym.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return null;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public boolean save(Blog blog) {
        if (blog!=null){
            blogRepository.save(blog);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        if (blogRepository.findById(id)!=null){
            blogRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Page<Blog> findAllByNameContaining(String name, Pageable pageable) {
        return blogRepository.findAllByNameContaining(name,pageable);
    }
}

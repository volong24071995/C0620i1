package com.codegym.demo.service.impl;


import com.codegym.demo.model.Category;
import com.codegym.demo.repository.CategoryRepository;
import com.codegym.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Category findById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public boolean save(Category category) {
        if (category!=null){
            categoryRepository.save(category);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        if (categoryRepository.findById(id)!=null){
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

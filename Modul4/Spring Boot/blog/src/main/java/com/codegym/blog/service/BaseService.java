package com.codegym.blog.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<T> {
    Iterable<T> findAll();
    Page<T> findAll(Pageable pageable);
    T findById(long id);
    void save(T element);
    void delete(long id);
}

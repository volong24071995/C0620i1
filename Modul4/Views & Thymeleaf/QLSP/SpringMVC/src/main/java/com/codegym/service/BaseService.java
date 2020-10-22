package com.codegym.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    void save(T element);
    void deleteById(int id);
    void update(T element);
    T findOne(int id);
}

package com.codegym.demo.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.SQLException;

public interface BaseService<T> {
    Iterable<T> findAll() ;
    Page<T> findAll(Pageable pageable);
    T findById(long id);
    boolean save(T element) throws SQLException;
    boolean delete(long id) throws SQLException;
}

package com.codegym.service;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Iterable<User> findAll();

    User findOne(Long id);

    User save(User user);

    void delete(Long id);

    void remove(Long id);

    Iterable<User> findAll(long id);

    Page<User> findAllByNameContaining(String firstname, Pageable pageable);
}

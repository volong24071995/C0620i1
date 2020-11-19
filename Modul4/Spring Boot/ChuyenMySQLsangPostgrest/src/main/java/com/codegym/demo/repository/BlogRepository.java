package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}
package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Page<Blog> findAllByNameContaining(String firstname, Pageable pageable);
    Page<Blog> findAllByCategoryId(long id,Pageable pageable);
    Page<Blog> findAllByNameLike(String name,Pageable pageable);
}
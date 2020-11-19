package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
}
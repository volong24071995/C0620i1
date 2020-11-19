package com.codegym.blog.repository;

import com.codegym.blog.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}

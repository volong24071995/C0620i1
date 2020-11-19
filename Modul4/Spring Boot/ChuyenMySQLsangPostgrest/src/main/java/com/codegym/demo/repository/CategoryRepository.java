package com.codegym.demo.repository;


import com.codegym.demo.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}

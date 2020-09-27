package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static int id=3;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "John", 1000,"mota" ,"Hanoi"));
        products.put(2, new Product(2, "Bill", 2000,"mota" , "Danang"));
        products.put(3, new Product(3, "Alex", 3000,"mota" , "Saigon"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        id=id+1;
        product.setId(id);
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}

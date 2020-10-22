package com.codegym.service;

import com.codegym.dao.ProductDAO;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements BaseService<Product> {
    private static ProductDAO productDAO=new ProductDAO();

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public void deleteById(int id) {
        productDAO.deleteById(id);
    }

    @Override
    public void update(Product product) {
        productDAO.update(product);
    }

    @Override
    public Product findOne(int id) {
        return productDAO.findOne(id);
    }
}

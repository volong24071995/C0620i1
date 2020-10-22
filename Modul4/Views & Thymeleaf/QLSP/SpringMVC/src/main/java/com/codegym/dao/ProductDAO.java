package com.codegym.dao;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO implements BaseDao<Product> {
    private static ProductLinesDao productLinesDao=new ProductLinesDao();
    private static Map<Integer, Product> list=new HashMap<>();
    private static int autoId=2;
    static {
        list.put(1,new Product(1,"Day chuyen vang",10000,productLinesDao.findOne(1)));
        list.put(2,new Product(2,"Iphone 7s",10000,productLinesDao.findOne(3)));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Product product) {
        autoId++;
        product.setId(autoId);
        list.put(autoId,product);
    }

    @Override
    public void deleteById(int id) {
        list.remove(id);
    }

    @Override
    public void update(Product product) {
        list.put(product.getId(),product);
    }

    @Override
    public Product findOne(int id) {
        return list.get(id);
    }
}

package com.codegym.dao;

import com.codegym.model.ProductLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductLinesDao implements BaseDao<ProductLine> {
    private static Map<Integer,ProductLine> lineList=new HashMap<>();
    static {
        lineList.put(1,new ProductLine(1,"Trang suc"));
        lineList.put(2,new ProductLine(2,"Xe may"));
        lineList.put(3,new ProductLine(3,"Phone"));
    }
    @Override
    public List<ProductLine> findAll() {
        return new ArrayList<>(lineList.values());
    }

    @Override
    public void save(ProductLine element) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(ProductLine element) {

    }

    @Override
    public ProductLine findOne(int id) {
        return lineList.get(id);
    }
}

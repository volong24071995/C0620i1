package com.codegym.service;

import com.codegym.dao.ProductLinesDao;
import com.codegym.model.ProductLine;

import java.util.List;

public class ProductLineService implements BaseService<ProductLine> {
    private static ProductLinesDao productLinesDao=new ProductLinesDao();
    @Override
    public List<ProductLine> findAll() {
        return productLinesDao.findAll();
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
        return productLinesDao.findOne(id);
    }
}

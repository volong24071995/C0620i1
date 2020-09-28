package com.codegym.dao;

import com.codegym.model.MissWorld;
import com.codegym.model.Tinhthanh;

import java.util.List;

public interface TinhthanhDao {
    List<Tinhthanh> findAll();

    void save(Tinhthanh tinhthanh);

    Tinhthanh findById(int id);

    void update(int id, Tinhthanh tinhthanh);

    void remove(int id);
}

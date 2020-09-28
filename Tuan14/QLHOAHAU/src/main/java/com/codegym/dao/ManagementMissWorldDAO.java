package com.codegym.dao;

import com.codegym.model.MissWorld;

import java.util.List;

public interface ManagementMissWorldDAO {
    List<MissWorld> findAll();

    void save(MissWorld missWorld);

    MissWorld findById(String identityCard);

    void update(String identityCard, MissWorld missWorld);

    void remove(String identityCard);
}

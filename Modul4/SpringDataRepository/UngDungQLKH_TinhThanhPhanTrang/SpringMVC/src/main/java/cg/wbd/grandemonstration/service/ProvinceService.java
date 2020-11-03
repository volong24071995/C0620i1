package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
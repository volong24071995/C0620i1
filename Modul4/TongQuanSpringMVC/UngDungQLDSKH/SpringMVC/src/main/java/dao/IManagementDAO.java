package dao;

import java.util.List;

public interface IManagementDAO<T> {
    List<T> findAll();
    void save(T element);
    void deleteById(int id);
    void update(T element);
    T findOne(int id);
}

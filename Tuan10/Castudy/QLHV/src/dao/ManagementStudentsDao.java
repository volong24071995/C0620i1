package dao;

import entity.Student;

public interface ManagementStudentsDao {
     void add(Student student);
     void edit(int id);
     void delete(int id);
     void getAll();
}

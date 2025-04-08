package org.humber.week12.student;

import java.util.List;

public interface Database {

    void save(Student student);

    void delete(Student student);

    Student find(int id);

    List<Student> findAll();

}

package org.humber.week12.student;

import java.util.HashMap;
import java.util.List;

public class HashMapDatabase implements Database {

    private HashMap<Integer, Student> students;

    public HashMapDatabase() {
        students = new HashMap<>();
    }


    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student.getId());
    }

    @Override
    public Student find(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> findAll() {
        return students.values().stream().toList();
    }
}

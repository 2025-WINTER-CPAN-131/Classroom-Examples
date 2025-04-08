package org.humber.week12.student;

import java.util.ArrayList;
import java.util.List;

public class ListDatabase implements Database {

    private List<Student> students;

    public ListDatabase() {
        students = new ArrayList<>();
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public Student find(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}

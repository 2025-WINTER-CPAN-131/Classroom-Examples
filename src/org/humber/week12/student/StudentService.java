package org.humber.week12.student;

import java.util.List;

public interface StudentService {

    void addStudent();

    void removeStudent();

    Student getStudent() throws StudentNotFoundException;

    List<Student> getAllStudents();
}

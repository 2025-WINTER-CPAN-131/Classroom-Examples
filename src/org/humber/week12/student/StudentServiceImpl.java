package org.humber.week12.student;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    private final Scanner scanner;
    private final Database database;
    private int nextId;

    public StudentServiceImpl(Scanner scanner, Database database) {
        this.scanner = scanner;
        this.database = database;
        this.nextId = 1;
    }


    @Override
    public void addStudent() {
        try{
            System.out.println("Enter student name: ");
            String name = scanner.next();
            Student student = new Student(name, nextId);
            database.save(student); // save student to database
            nextId++;
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Failed to add student!, Due to: " + e.getMessage());
        }
    }

    @Override
    public void removeStudent() {
        try{
            Student student = getStudent();
            if (student != null) {
                database.delete(student);
                System.out.println("Student removed successfully!");
            } else {
                System.out.println("Student not found!");
            }
        } catch (Exception e) {
            System.out.println("Failed to remove student!, Due to: " + e.getMessage());
        }
    }

    @Override
    public Student getStudent() throws StudentNotFoundException {
        Student student = null;
        try{
            System.out.println("Enter student id: ");
            int id = scanner.nextInt();
            student = database.find(id);
        } catch (Exception e) {
            System.out.println("Failed to get student!, Due to: " + e.getMessage());
        }
        if (student == null) {
            throw new StudentNotFoundException("Student not found!");
        }
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        try{
            return database.findAll();
        } catch (Exception e) {
            System.out.println("Failed to get all students!, Due to: " + e.getMessage());
        }
        return Collections.emptyList();
    }
}

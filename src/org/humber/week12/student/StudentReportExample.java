package org.humber.week12.student;

import java.util.List;
import java.util.Scanner;

public class StudentReportExample {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Database database = new HashMapDatabase();
        StudentService studentService = new StudentServiceImpl(scanner, database);

        int choice = 0;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Get Student By Id");
            System.out.println("4. Get All Students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.removeStudent();
                    break;
                case 3:
                    try{
                        Student student = studentService.getStudent();
                        System.out.println("Student: " + student.getName() + " Id: " + student.getId());
                    } catch (StudentNotFoundException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    List<Student> studentList = studentService.getAllStudents();
                    studentList.forEach(s -> System.out.println("Student: " + s.getName() + " Id: " + s.getId()));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice\n Please try again.");
            }


        } while (choice != 5);


    }

}

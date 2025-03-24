package org.humber.week10;

abstract class Employee {


    abstract public double getSalary();

    public int getTotalVacationDays() {
        return 10;
    }

}

class Manager extends Employee {

    @Override
    public double getSalary() {
        return 100_000;
    }

    @Override
    public int getTotalVacationDays() {
        return 15;
    }

    public int getBonus() {
        return 10_000;
    }
}

class Developer extends Employee {

    @Override
    public double getSalary() {
        return 80000;
    }
}


public class AbstractExample {

    public static void main(String[] args) {

        Employee e1 = new Employee() {
            @Override
            public double getSalary() {
                return 100;
            }
        };

        Employee e2 = new Employee() {
            @Override
            public double getSalary() {
                return 200;
            }
        };

        Employee developer = new Developer();

        Employee manager = new Manager();



        Employee[] employees = new Employee[4];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = developer;
        employees[3] = manager;

        printEmployees(employees);
    }

    private static void printEmployees(Employee[] employees) {

        for(Employee employee : employees) {

            if(employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Manager Salary: " + manager.getSalary() +
                        ", Vacation Days: " + manager.getTotalVacationDays()
                        + ", Bonus: " + manager.getBonus());
                continue;
            }

            System.out.println("Employee Salary: " + employee.getSalary() +
                    ", Vacation Days: " + employee.getTotalVacationDays());
        }
    }



}

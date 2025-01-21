package org.humber.week2;


import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Calculator calc1 = new Calculator();
        System.out.println("Sum: " + calculator.add(num1, num2));
        calculator.setNum(2);
        System.out.println("num: " + calculator.getNum());
        Math.pow(2, 3);
    }
}

class Calculator {

    // Instance variable
    private int num = 1;

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

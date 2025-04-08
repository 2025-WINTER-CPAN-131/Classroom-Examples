package org.humber.week12;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void breath() {
        System.out.println("Cat is breathing");
    }
}

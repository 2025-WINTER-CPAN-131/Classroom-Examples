package org.humber.week12;

public class LivingBeingExample {


    public static void main(String[] args) {

        Cat cat = new Cat();

        LivingBeing livingBeing = cat;
        livingBeing.breath();

        Animal animal = cat;

        animal.makeSound();
        animal.eat();
        animal.sleep();

    }

}

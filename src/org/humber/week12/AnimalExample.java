package org.humber.week12;

public class AnimalExample {

    public static void main(String[] args) {
        Animal animal = new Cat();

        printAnimal(animal);
    }

    private static void printAnimal(Animal animal) {
        animal.makeSound();
        animal.eat();
        animal.sleep();
        animal.breath();
    }

}

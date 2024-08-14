package org.academy.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal duck = new Duck();
        duck.makeSound();
    }
}

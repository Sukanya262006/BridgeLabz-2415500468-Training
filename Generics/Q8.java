package generics;

import java.util.*;

class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void sound() { System.out.println("Bark"); } }
class Cat extends Animal { void sound() { System.out.println("Meow"); } }

class Q8 {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) a.sound();
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}

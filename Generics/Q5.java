package generics;
class Fruit {
    String name;
    Fruit(String name) { this.name = name; }
}

class Apple extends Fruit { Apple() { super("Apple"); } }
class Mango extends Fruit { Mango() { super("Mango"); } }

class FruitBox<T extends Fruit> {
    java.util.List<T> fruits = new java.util.ArrayList<>();

    void addFruit(T fruit) { fruits.add(fruit); }

    void display() {
        for (T f : fruits) System.out.println(f.name);
    }
}

public class Q5 {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.display();
        // FruitBox<Car> box2 = new FruitBox<>(); // ❌ compile error: Car not a Fruit
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Rex", 5), new Cat("Whiskers", 3), new Bird("Tweety", 1) };
        for (Animal a : animals) { a.makeSound(); }
    }
}
package lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "yellow", 3, 200, 10);
        Cat cat2 = new Cat("Markise", "red", 4, 150, 15);
        Dog dog1 = new Dog("Michiel", "black", 2, 500, 10, 0.5);
        Dog dog2 = new Dog("Koks", "white", 8, 700, 5, 1);
        Animal.printCount();
        Animal[] animals = {cat1, cat2, dog1, dog2};

        for (Animal animal : animals) {
//            System.out.println(animal.toString());
            System.out.println("Result: " + animal.run(200));
            System.out.println("Result: " + animal.swim(7));
            System.out.println("Result: " + animal.jump(1));
        }
    }
}
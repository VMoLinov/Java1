package lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Yellow", 3);
        Dog dog = new Dog("Michiel", "Black", 6);
        Animal.printCount();
        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.run(200);
            animal.jump(10);
            animal.swim(5);
        }
    }
}
package lesson7;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Robert", "red", 2, 5, false);
        Cat cat2 = new Cat("Josh", "white", 7, 3, false);
        Cat cat3 = new Cat("Miles", "black", 1, 7, false);
        Cat cat4 = new Cat("Bekka", "red", 4, 6, false);
        Cat cat5 = new Cat("Totto", "yellow", 6, 4, false);
        Plate plate = new Plate(10);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
        plate.printInfo();
        for (Cat cat : cats) {
            plate.addFood(1);
            cat.eat(plate);
            System.out.printf("%s's satiety is %s%n", cat.getName(), cat.isSatiety());
            plate.printInfo();
//            System.out.println(cat.toString());
        }
    }
}

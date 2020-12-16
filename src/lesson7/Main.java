package lesson7;

public class Main {

    static char percent = '%'; //How i can avoid that? String #20

    public static void main(String[] args) {
        Cat cat1 = new Cat("Robert", "red", 2, 5);
        Cat cat2 = new Cat("Josh", "white", 7, 3);
        Cat cat3 = new Cat("Miles", "black", 1, 7);
        Cat cat4 = new Cat("Bekka", "red", 4, 6);
        Cat cat5 = new Cat("Totto", "yellow", 6, 4);
        Plate plate = new Plate(5);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
        plate.printInfo();
        for (Cat cat : cats) {
            plate.addFood(plate.rand.nextInt(2)); //Add or not (1 or 0)
            cat.eat(plate);
            System.out.printf("%s's satiety is %.0f%s %n", cat.getName(), cat.getSatiety(), percent);
            plate.printInfo();
//            System.out.println(cat.toString());
        }
    }
}

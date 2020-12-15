package lesson7;

import java.util.Random;

public class Plate {

    Random rand = new Random();

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this(0);
    }

    public void addFood(int food) {
        this.food += food;
    }

    public double decreaseFood(int x) {
        while (food > 0) {
            int y = rand.nextInt(x) + 1; //How much cat will be eat
            if (food >= y) {
                food -= y;
                return (double) y / x * 100; //Percent satiety
            }
        }
        return 0;
    }

    public void printInfo() {
        System.out.println("food = " + food);
    }
}

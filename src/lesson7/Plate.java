package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this(0);
    }

    public boolean decreaseFood(int x) {
        if (food > x) {
            food -= x;
            return true;
        } else System.out.println("not enough food");
        return false;
    }

    public void printInfo() {
        System.out.println("food = " + food);
    }

    public void setAddFood(int food) {
        this.food += food;
    }
}
package lesson6;

public class Dog extends Animal {

    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    private final double MAX_JUMP = 0.5;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public Dog() {
    }

    @Override
    public void run(int i) {
        if (i <= MAX_RUN && i >= 0) System.out.printf("%s run %d meters.%n", name, i);
        else if (i > MAX_RUN) System.out.printf("%s can't run %d meters. Maximum - %d.%n", name, i, MAX_RUN);
        else System.out.printf("%d is negative range.%n", i);
    }

    @Override
    public void swim(int i) {
        if (i <= MAX_SWIM && i >= 0) System.out.printf("%s swim %d meters.%n", name, i);
        else if (i > MAX_SWIM) System.out.printf("%s can't swim %d meters. Maximum - %d.%n", name, i, MAX_SWIM);
        else System.out.printf("%d is negative range.%n", i);
    }

    @Override
    public void jump(double i) {
        if (i <= MAX_JUMP && i >= 0) System.out.printf("%s jump %.1f meters.%n", name, i);
        else if (i > MAX_JUMP) System.out.printf("%s can't jump %.1f meters. Maximum - %.1f.%n", name, i, MAX_JUMP);
        else System.out.printf("%d is negative range.%n", i);
    }
}
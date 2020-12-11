package lesson6;

public class Cat extends Animal {

    private final int MAX_RUN = 200;
    private final double MAX_JUMP = 10;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat() {
    }

    @Override
    public void run(int i) {
        if (i <= MAX_RUN && i>= 0) System.out.printf("%s run %d meters.%n", name, i);
        else if (i > MAX_RUN) System.out.printf("%s can't run %d meters. Maximum - %d.%n", name, i, MAX_RUN);
        else System.out.printf("%d is negative range.%n", i);
    }

    @Override
    public void swim(int i) {
        System.out.printf("%s have drowned.%n", name);
    }

    @Override
    public void jump(double i) {
        if (i <= MAX_JUMP && i >= 0) System.out.printf("%s jump %.1f meters.%n", name, i);
        else if (i > MAX_JUMP) System.out.printf("%s can't jump %.1f meters. Maximum - %.1f.%n", name, MAX_JUMP);
        else System.out.printf("%d is negative number.%n", i);
    }
}
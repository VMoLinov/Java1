package lesson6;

public class Dog extends Animal {

    public Dog(String name, String color, int age, int maxRun, int maxSwim, double maxJump) {
        super(name, color, age, maxRun, maxSwim, maxJump);
    }

    public Dog() {
    }

    @Override
    public boolean run(int i) {
        System.out.printf("%s run %d meters. ", name, i);
        return  i <= maxRun && i >= 0;
    }

    @Override
    public boolean swim(int i) {
        System.out.printf("%s swim %d meters. ", name, i);
        return  i <= maxSwim && i >= 0;
    }

    @Override
    public boolean jump(double i) {
        System.out.printf("%s jump %.1f meters. ", name, i);
        return  i <= maxJump && i >= 0;
    }
}
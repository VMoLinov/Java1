package lesson6;

public abstract class Animal {

    protected static int count = 0;
    protected String name;
    protected String color;
    protected int age;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;


    public Animal(String name, String color, int age, int maxRun, int maxSwim, double maxJump) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        count++;
    }

    public Animal() {
        this(null, null, 0, 0, 0, 0);
    }

    public abstract boolean run(int i);

    public abstract boolean swim(int i);

    public abstract boolean jump(double i);

    public static void printCount() {
        System.out.printf("Total animals: %d%n", count);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", maxRun=" + maxRun +
                ", maxSwim=" + maxSwim +
                ", maxJump=" + maxJump +
                '}';
    }
}
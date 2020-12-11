package lesson6;

public abstract class Animal {

    protected static int count = 0;
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public Animal() {
        this(null, null, 0);
    }

    public abstract void run(int i);

    public abstract void swim(int i);

    public abstract void jump(double i);

    public static void printCount() {
        System.out.printf("Total animals: %d%n", count);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
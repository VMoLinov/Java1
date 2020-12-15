package lesson7;

public class Cat {

    private final String name;
    private final String color;
    private final int age;
    private final int appetite;
    private double satiety;

    public Cat(String name, String color, int age, int appetite) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.appetite = appetite;
        satiety = 0;
    }

    public Cat() {
        this(null, null, 0, 0);
    }

    public void eat(Plate x) {
        satiety = x.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public double getSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

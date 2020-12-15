package lesson7;

public class Cat {

    private final String name;
    private final String color;
    private final int age;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, String color, int age, int appetite, boolean satiety) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public Cat() {
        this(null, null, 0, 0, false);
    }

    public void eat(Plate x) {
        satiety = x.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
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

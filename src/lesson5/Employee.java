package lesson5;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    private static Employee[] personArray = new Employee[5];

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        pushEmployers();
        for (int i = 0; i < personArray.length; i++) {
            if (getAge(i) > 40) System.out.println(personArray[i].toString());
        }
    }

    private static void pushEmployers() {
        personArray[0] = new Employee("Vadim Petrov", "auto-tester", "vm@example.com",
                "+79161232323", 70000, 25);
        personArray[1] = new Employee("Maxim Titov", "front-end", "mt@exapmle.com",
                "+79289879898", 60000, 42);
        personArray[2] = new Employee("Roman Nikulin", "technical chief", "rn@example.com",
                "+79284531898", 200000, 29);
        personArray[3] = new Employee("Alexey Solnechny", "back-end", "as@example.com",
                "+79245813248", 90000, 49);
        personArray[4] = new Employee("Marina Shulga", "web-interface", "ms@example.com",
                "+79245832898", 60000, 32);
    }

    private static int getAge(int i) {
        return personArray[i].age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Position: %s; Email: %s; Phone: %s; Salary: %d; Age: %d;", name,
                position, email, phone, salary, age);
    }
}
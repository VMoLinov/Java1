/* Домашнее задание
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
(включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
сообщение «Привет, указанное_имя!».
8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
package lesson1;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //Task 1
        // Если раскомментировать - можно будет самому вводить в консоль переменные для функций.
        Scanner enter = new Scanner(System.in);
        System.out.println("Добрый день! Хотите ли Вы ввести свои переменные для заданий?");
        while (true) {
            System.out.print("Yes / No ");
            String answer = enter.nextLine();
            if (Objects.equals(answer.toLowerCase(), "yes") == true) {
                doWorkScenario1();
                break;
            } else if (Objects.equals(answer.toLowerCase(), "no") == true) {

                doWorkScenario2();
                break;
            } else System.out.print("Повторите ввод ");
        }
        System.out.println("Thank you!");
    }

    public static void doWorkScenario1() {
        System.out.println(check.exercise(2));
        byte eightBit = check.byteTrue(); //Beginning task 2
        short sixteenBit = check.shortTrue();
        int thirtyTwoBit = check.intTrue();
        long sixtyForBit = check.longTrue();
        float thirtyTwoBitDot = check.floatTrue();
        double sixtyForBitDot = check.doubleTrue();
        char sym = check.charTrue();
        boolean logic = check.booleanTrue(); //End of task 2
        System.out.println("byte = " + eightBit + "; short = " + sixteenBit + "; int = " + thirtyTwoBit + "; long = "
                + sixtyForBit + "; float = " + thirtyTwoBitDot + "; double = " + sixtyForBitDot + "; char = " + sym + "; boolean = " + logic + ";");
        System.out.println("End of exercise №2\n");

        System.out.println(check.exercise(3));
        float f[] = new float[4];
        String a[] = new String[]{"a", "b", "c", "d"};
        for (int i = 0; i < f.length; i++) {
            System.out.println("Переменная " + a[i]);
            f[i] = check.floatTrue();
        }
        System.out.println("Answer exercise №3. float = " + calculate(f[0], f[1], f[2], f[3]) + "\n");

        System.out.println(check.exercise(4));
        int z[] = new int[2];
        for (int i = 0; i < z.length; i++) z[i] = check.intTrue();
        System.out.println("Answer exercise №4: boolean = " + compare(z[0], z[1]) + "\n");

        System.out.println(check.exercise(5));
        int task5 = check.intTrue();
        System.out.print("Answer exercise №5: ");
        isPlusOrMinus(task5);

        System.out.println(check.exercise(6));
        int task6 = check.intTrue();
        System.out.print("Answer exercise №6: boolean = " + logicCompare(task6) + "\n");
        System.out.println(" ");

        System.out.println(check.exercise(7));
        String name = check.nameTrue();
        hello(name);

        Scanner answerTask8 = new Scanner(System.in);
        System.out.println(check.exercise(8));
        System.out.print("Введите год: ");
        int task8;
        while (true) {
            if (answerTask8.hasNextInt()) {
                task8 = answerTask8.nextInt();
                break;
            } else {
                System.out.print("Повторите ввод ");
                answerTask8.nextLine();
            }
        }
        System.out.print("Answer exercise №8: ");
        isLeapYear(task8);

    }

    public static void doWorkScenario2() {
        byte eightBit = -128; // Beginning task 2
        short sixteenBit = 32767;
        int thirtyTwoBit = 77777;
        long sixtyForBit = 700000L;
        float thirtyTwoBitDot = 42.73f;
        double sixtyForBitDot = -427.731;
        char sym = '+';
        boolean logic = true; // End of task 2
        float task3 = calculate(42.76701f, 38.427513f, 72.4821354f, 22.4812476f); // Task 3
        boolean task4 = compare(8, 9); // Task 4
        boolean task6 = logicCompare(2); // Task 6
        System.out.println(check.exercise(2));
        System.out.println("byte = " + eightBit + "; short = " + sixteenBit + "; int = " + thirtyTwoBit + "; long = "
                + sixtyForBit + "; float = " + thirtyTwoBitDot + "; double = " + sixtyForBitDot + "; char = " + sym + "; boolean = " + logic + ";");
        System.out.println("End of exercise №2\n");
        System.out.println(check.exercise(3));
        System.out.println("Answer exercise №3. float = " + task3 + "\n");
        System.out.println(check.exercise(4));
        System.out.println("Answer exercise №4: boolean = " + task4 + "\n");
        System.out.println(check.exercise(5));
        System.out.print("Answer exercise №5: ");
        isPlusOrMinus(-1); // Task 5
        System.out.println(check.exercise(6));
        System.out.print("Answer exercise №6: boolean = " + task6 + "\n");
        System.out.println(" ");
        System.out.println(check.exercise(7));
        hello("Student name"); // Task 7
        System.out.println(check.exercise(8));
        System.out.print("Answer exercise №8: ");
        isLeapYear(444); // Task 8
    }

    public static float calculate(float a, float b, float c, float d) { // Task 3
        if (d != 0) return a * (b + (c / d));
        else {
            System.out.println("Деление на ноль недопустимо");
            return 0;
        }
    }

    public static boolean compare(int a, int b) { // Task 4
        return (a + b <= 20 && a + b >= 10);
    }

    public static void isPlusOrMinus(int x) { // Task 5
        if (x < 0) System.out.println(x + " is negative number\n");
        else System.out.println(x + " is positive number\n");
    }

    public static boolean logicCompare(int x) { // Task 6
        return (x < 0);
    }

    public static void hello(String name) { // Task 7
        System.out.println("Answer exercise №7: Hello, " + name + "!\n");
    }

    public static void isLeapYear(int x) { // Task 8
        if ((x % 400 == 0) || (x % 4 == 0 && x % 100 != 0)) System.out.println(x + " is a leap year");
        else System.out.println(x + " isn't a leap year");
    }
} 
package lesson1;

import java.util.Scanner;

public class check {

    public static String exercise(int number) {
        if (number == 1) return "Задание №1. Создать пустой проект в IntelliJ IDEA и прописать метод main().";
        else if (number == 2)
            return "Задание №2. Создать переменные всех пройденных типов данных и инициализировать их значения.";
        else if (number == 3)
            return "Задание №3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,\n" +
                    "где a, b, c, d – аргументы этого метода, имеющие тип float.";
        else if (number == 4)
            return "Задание №4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20\n" +
                    "(включительно), если да – вернуть true, в противном случае – false.";
        else if (number == 5)
            return "Задание №5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,\n" +
                    "положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.";
        else if (number == 6)
            return "Задание №6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число\n" +
                    "отрицательное, и вернуть false если положительное.";
        else if (number == 7)
            return "Задание №7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль\n" +
                    "сообщение «Привет, указанное_имя!».";
        else if (number == 8)
            return "Задание №8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год\n" +
                    "является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.";
        else return null;
    }

    public static byte byteTrue() {
        Scanner checkByte = new Scanner(System.in);
        System.out.print("Введите числовую переменную byte (число от -128 до 127): ");
        while (true) {
            if (checkByte.hasNextByte()) return checkByte.nextByte();
            else {
                System.out.print("Повторите ввод ");
                checkByte.nextLine();
            }
        }
    }

    public static short shortTrue() {
        Scanner checkShort = new Scanner(System.in);
        System.out.print("Введите числовую переменную short (число от -32768 до 32767): ");
        while (true) {
            if (checkShort.hasNextShort()) return checkShort.nextShort();
            else {
                System.out.print("Повторите ввод ");
                checkShort.nextLine();
            }
        }
    }

    public static int intTrue() {
        Scanner checkInt = new Scanner(System.in);
        System.out.print("Введите числовую переменную int (число от -2147483648 до 2147483647): ");
        while (true) {
            if (checkInt.hasNextInt()) return checkInt.nextInt();
            else {
                System.out.print("Повторите ввод ");
                checkInt.nextLine();
            }
        }
    }

    public static long longTrue() {
        Scanner checkLong = new Scanner(System.in);
        System.out.print("Введите числовую переменную long (число от -9223372036854775808 до 9223372036854775807): ");
        while (true) {
            if (checkLong.hasNextLong()) return checkLong.nextLong();
            else {
                System.out.print("Повторите ввод ");
                checkLong.nextLine();
            }
        }
    }

    public static float floatTrue() {
        Scanner checkFloat = new Scanner(System.in);
        System.out.print("Введите числовую переменную float через запятую (например 12,93) ");
        while (true) {
            if (checkFloat.hasNextFloat()) return checkFloat.nextFloat();
            else {
                System.out.print("Повторите ввод ");
                checkFloat.nextLine();
            }
        }
    }

    public static double doubleTrue() {
        Scanner checkDouble = new Scanner(System.in);
        System.out.print("Введите числовую переменную double (через запятую (например 127,489) ");
        while (true) {
            if (checkDouble.hasNextDouble()) return checkDouble.nextFloat();
            else {
                System.out.print("Повторите ввод ");
                checkDouble.nextLine();
            }
        }
    }

    public static char charTrue() {
        Scanner checkChar = new Scanner(System.in);
        System.out.print("Введите символьную переменную char (* / + / # и прочее) ");
        return checkChar.next().charAt(0);
    }

    public static boolean booleanTrue() {
        Scanner checkBoolean = new Scanner(System.in);
        System.out.print("Введите логическую переменную boolean (false / true) ");
        while (true) {
            if (checkBoolean.hasNextBoolean()) return checkBoolean.nextBoolean();
            else {
                System.out.print("Повторите ввод ");
                checkBoolean.nextLine();
            }
        }
    }

    public static String nameTrue() {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        return name.nextLine();
    }
}
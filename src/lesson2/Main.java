/* author @VMolinov
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если
в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами
||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
-> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
выбирать сами.*/
package lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        intArray();         //Task1
        pushArray();        //Task2
        multiplyArray();    //Task3
        diagonalArray();    //Task4
        minMaxArray();      //Task5
        balance();          //Task6
        move();             //Task7
    }

    public static void intArray() { //Task1
        System.out.println("Task1:");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println("Inverted array: " + Arrays.toString(arr) + "\n");
    }

    public static void pushArray() { //Task2
        System.out.println("Task2:");
        int[] arr = new int[8];
        System.out.println("Empty array: " + Arrays.toString(arr));
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x += 3;
        }
        System.out.println("Pushed array: " + Arrays.toString(arr) + "\n");
    }

    public static void multiplyArray() { //Task3
        System.out.println("Task3:");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println("Multiply array: " + Arrays.toString(arr) + "\n");
    }

    public static void diagonalArray() { //Task4
        System.out.println("Task4:");
        int length = 11;
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == length - 1)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void minMaxArray() { //Task5
        System.out.println("Task5:");
        int[] arr = arrays.newArray(100);
        System.out.println("Array: " + Arrays.toString(arr));
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("min = " + min + " max = " + max + "\n");
    }

    public static void balance() { //Task6
        System.out.println("Task6:");
//        int[] arr = new int[]{12, -8, -4, 0};
        int[] arr = arrays.newArray(20);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Balance = " + arrays.checkBalance(arr) + "\n");
    }

    public static void move() { //Task7
        System.out.println("Task7:");
        int[] arr = arrays.newArray(100);
        int n = generateN();
        System.out.println("Original array: " + Arrays.toString(arr));
        arrays.moveArray(arr, n);
        System.out.println("Moved array: " + Arrays.toString(arr));

    }

    public static int generateN() { //Generate 'n' from -10 to 10
        int n = 0;
        while (n == 0) n = (int) ((Math.random() * 10) - (Math.random() * 10));
        System.out.println("n = " + n);
        return n;
    }
}
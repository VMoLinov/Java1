package lesson2;

import java.util.Arrays;

public class arrays {

    public static int[] newArray(int range) {               // Передаем максимальное число массива
        int length = 0;
        while (length <= 2) {                               // Генерируем длину массива, пока она не станет > 2 значений
            length = (int) (Math.random() * 20);            // Максимальная длина массива - 20
        }
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {              // Наполняем массив числами от -range до range
            arr[i] = (int) ((Math.random() * range) - (Math.random() * range));
        }
        return arr;
    }

    public static boolean checkBalance(int[] arr) {
        System.out.println(arr.length);
        int left = 0, right = 0;                            // Инициализируем значения счетчиков левой и правой части массива
        for (int i = 0; i < arr.length; i++) {              // Считаем левую часть
            left += arr[i];
            right = 0;                                      // Обнуляем правую часть перед каждым входом в цикл её подсчета
            for (int j = i + 1; j < arr.length; j++) {      // Считаем правую часть
                right += arr[j];
            }
            if (left == right) break;                       // Проверка на выход из цикла
        }
        return left == right;
    }

    public static void moveArray(int[] arr, int n) {
        int temp, STEP = 1;                                 // Инициализация подменной переменной и величины шага (сдвига)
        if (n > 0) {                                        // При сдвиге отличном от 1 - корректно работать не будет
            while (n != 0) {                                // Двигаем n раз на величину шага вправо
                for (int i = arr.length - STEP; i > 0; i--) {
                    temp = arr[i - STEP];
                    arr[i - STEP] = arr[i];
                    arr[i] = temp;
                }
                n--;
            }
        } else {
            while (n != 0) {                                // Двигаем n раз на величину шага влево
                for (int i = 0; i < arr.length - STEP; i++) {
                    temp = arr[i + STEP];
                    arr[i + STEP] = arr[i];
                    arr[i] = temp;
                }
                n++;
            }
        }
    }
}
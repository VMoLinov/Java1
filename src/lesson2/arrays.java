package lesson2;

import java.util.Arrays;

public class arrays {

    public static int[] newArray(int range) {               //transfer max number of array
        int length = 0;
        while (length <= 2) {                               //generate array's length, until > 2 value
            length = (int) (Math.random() * 20);            //max length = 20
        }
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {              //push array's values from -range to range
            arr[i] = (int) ((Math.random() * range) - (Math.random() * range));
        }
        return arr;
    }

    public static boolean checkBalance(int[] arr) {
        int left = 0, right = 0;                            //initialize count's value left and right array's side
        for (int i = 0; i < arr.length - 1; i++) {          //count left side, last array's value doesn't matter for count
            left += arr[i];
            right = 0;                                      //zero right before enter in right count loop
            for (int j = i + 1; j < arr.length; j++) {      //count right side
                right += arr[j];
            }
            if (left == right) break;                       //exit check
        }
        return left == right;
    }

    public static void moveArray(int[] arr, int n) {
        int temp;
        final int STEP = 1;                                 //initialize temporary and step over variables
        if (n > 0) {                                        //if move step different that 1 - method doesn't work correctly
            while (n != 0) {                                //move 'n' times on step value to right
                for (int i = arr.length - STEP; i > 0; i--) {
                    temp = arr[i - STEP];
                    arr[i - STEP] = arr[i];
                    arr[i] = temp;
                }
                n--;
            }
        } else {
            while (n != 0) {                                //move 'n' times on step value to left
                for (int i = 0; i < arr.length - STEP; i++) {
                    temp = arr[i + STEP];                   //'n' always int and go to 0 - loop will not be infinity
                    arr[i + STEP] = arr[i];
                    arr[i] = temp;
                }
                n++;
            }
        }
    }
}
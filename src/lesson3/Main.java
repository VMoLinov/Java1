/*author @VMolinov
1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2. * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
"grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
"pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом
и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.*/
package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();
    }

    public static void guessTheNumber() {
        Random rand = new Random();
        int repeat;
        String start = "Guess the number from 0 to 9", end = "Do you want repeat the game? 1 - yes / 0 - no";
        do {
            int number = rand.nextInt(10), max = 9, min = 0, tryCount = 3;
            while (tryCount > 0) {
                int userAnswer = getNumber(start, max, min);
                if (userAnswer == number) {
                    System.out.println("Congratulations! You win!");
                    break;
                } else if (userAnswer < number) System.out.println("Your number is less");
                else System.out.println("Your number is greater");
                if (--tryCount > 0) System.out.printf("You have %d attempts%n", tryCount);
                else System.out.println("You lose");
            }
            repeat = getNumber(end, 1, 0);
        } while (repeat == 1);
    }

    public static int getNumber(String input, int max, int min) {
        Scanner userAnswer = new Scanner(System.in);
        int x;
        do {
            System.out.println(input);
            x = userAnswer.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static void guessTheWord() {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)], compare = "", split;
//        String word = words[24], compare = "", split;
        do {
            split = compare;
            String userWord = getWord();
            compare = compareWords(word, userWord);
            if (compare.length() == 15) {
                compare = compareRightChars(compare, split);
                System.out.printf("Try again. Right characters:%n%s%n", compare);
            } else System.out.println("You win!");
        } while (compare.length() == 15);
    }

    private static String getWord() {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("Guess the word");
        String userWord = userAnswer.nextLine();
        while ((userWord.length() < 1) || (userWord.length() >15)) {
            System.out.println("Try again. Word's less than 16 characters and greater than 1");
            userWord = userAnswer.nextLine();
        }
        return userWord;
    }

    public static String compareWords(String word, String userWord) {
        String userWordCompare = compareLength(word, userWord);
        String compare = "";
        int countWrong = 0;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i), b = userWordCompare.charAt(i);
            if (a == b) compare += a;
            else {
                countWrong++;
                compare += '#';
            }
        }
        if (countWrong > 0) for (int i = word.length(); i < 15; i++) compare += '#';
        return compare;
    }

    public static String compareRightChars(String compare, String userAnswer) {
        String returnWord = "", userWord = compareLength(compare, userAnswer);
        for (int i = 0; i < compare.length(); i++) {
            char a = compare.charAt(i), b = userWord.charAt(i);
            if (a != '#') returnWord += a;
            else returnWord += b;
        }
        return returnWord;
    }

    public static String compareLength(String a, String b) {
        if (a.length() > b.length()) for (int i = a.length() - b.length(); i > 0; i--) b += '#';
        return b;
    }
}
package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 5;
    public static final int WIN = 4;
    public static final char EMPTY = ' ';
    public static final char EMPTY_DOT = '\u00b7';
    public static final char PLAYER = 'X';
    public static final char COMPUTER = 'O';
    public static char[][] map;
    public static int[] move;

    public static void main(String[] args) {
        mapInit();
        while (!checkWin(COMPUTER) && !checkWin(PLAYER) && checkEmptyField()) {
            drawField();
            mapPush(playerInput(), PLAYER);
            if (!checkWin(PLAYER) && checkEmptyField()) {
                mapPush(smartMove(), COMPUTER);
            }
        }
        drawField();
        System.out.printf("%s win!", endGamePrint());
    }

    private static void mapInit() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void drawField() {
        int[][] table = new int[SIZE][SIZE];
        System.out.printf("%6s%n", 'X');
        System.out.printf("%4s", EMPTY);
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%2d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            if (i != 0) System.out.printf("%2s%2s", EMPTY, i + 1);
            else System.out.printf("%2s%2s", 'Y', i + 1);
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%2s", map[i][j]);
            }
            System.out.println();
        }
    }

    private static void mapPush(int[] move, char motion) {
        map[move[1]][move[0]] = motion;
    }

    private static int[] playerInput() {
        Scanner input = new Scanner(System.in);
        int x = -1, y = -1;
        do {
            System.out.println("Enter move's coordinates in format: X Y");
            if (input.hasNextInt()) {
                y = input.nextInt() - 1;
            } else {
                System.out.println("Check your number X");
                input.next();
            }
            if (input.hasNextInt()) {
                x = input.nextInt() - 1;
            } else {
                System.out.println("Check your number Y");
                input.next();
            }
        } while (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1 || map[x][y] != EMPTY_DOT);
//        input.close();
        return move = new int[]{y, x};
    }

    private static int[] computerInput() {
        Random rand = new Random();
        do {
            move = new int[]{rand.nextInt(SIZE), rand.nextInt(SIZE)};
        } while (map[move[1]][move[0]] != EMPTY_DOT);
        return move;
    }

    private static boolean checkWin(char check) {
        int count = 0;
        for (int i = 0; i <= SIZE - WIN; i++) {
            for (int j = 0; j <= SIZE - WIN; j++) {
                for (int k = i; k < WIN + i; k++) {
                    for (int l = j; l < WIN + j; l++) {
                        if (map[k][l] == check) count++;  // Horizontal check
                    }
                    if (count == WIN) return true;
                    count = 0;
                    for (int l = j; l < WIN + j; l++) {
                        if (map[l][k] == check) count++;  // Vertical check
                    }
                    if (count == WIN) return true;
                    count = 0;
                    for (int l = i, m = j; l < WIN + i; l++, m++) {
                        if (map[l][m] == check) count++;  // Diagonal \ check
                    }
                    if (count == WIN) return true;
                    count = 0;
                    for (int l = SIZE - 1 - i, m = j; m < WIN + j; l--, m++) {
                        if (map[l][m] == check) count++;  // Diagonal / check
                    }
                    if (count == WIN) return true;
                    count = 0;
                }
            }
        }
        return false;
    }

    private static int[] smartMove() {  // За такое больно бъют джуниоров по рукам? :)
        int count = 0, block = WIN / 2;
        for (int i = 0; i <= SIZE - block; i++) {
            for (int j = 0; j <= SIZE - block; j++) {
                for (int k = i; k < block + i; k++) {
                    for (int l = j; l < block + j; l++) {
                        if (map[k][l] == PLAYER) count++;  // Horizontal check
                        if (count == block && l + 1 < SIZE && l - block >= 0) {
                            if (map[k][l + 1] == EMPTY_DOT) {
                                return new int[]{l + 1, k};
                            } else if (map[k][l - block] == EMPTY_DOT) {
                                return new int[]{l - block, k};
                            }
                        }
                    }
                    count = 0;
                    for (int l = j; l < block + j; l++) {
                        if (map[l][k] == PLAYER) count++;  // Vertical check
                        if (count == block && l + 1 < SIZE && l - block >= 0) {
                            if (map[l + 1][k] == EMPTY_DOT) {
                                return new int[]{k, l + 1};
                            } else if (map[l - block][k] == EMPTY_DOT) {
                                return new int[]{k, l - block};
                            }
                        }
                    }
                    count = 0;
                    for (int l = i, m = j; l < block + i; l++, m++) {
                        if (map[l][m] == PLAYER) count++;  // Diagonal \ check
                        if (count == block && l + 1 < SIZE && l - block >= 0 && m + 1 < SIZE && m - block >= 0) {
                            if (map[l + 1][m + 1] == EMPTY_DOT) {
                                return new int[]{m + 1, l + 1};
                            } else if (map[l - block][m - block] == EMPTY_DOT) {
                                return new int[]{m - block, l - block};
                            }
                        }
                    }
                    count = 0;
                    for (int l = SIZE - 1 - i, m = j; m < block + j; l--, m++) {
                        if (map[l][m] == PLAYER) count++;  // Diagonal / check
                        if (count == block && l + block < SIZE && m + 1 < SIZE && m - block >= 0) {
                            if (map[l - 1][m + 1] == EMPTY_DOT) {
                                return new int[]{m + 1, l - 1};
                            } else if (map[l + block][m - block] == EMPTY_DOT) {
                                return new int[]{m - block, l + block};
                            }
                        }
                    }
                    count = 0;
                }
            }
        }
        return computerInput();
    }

    private static boolean checkEmptyField() {
        for (char[] mapDeep : map) {
            for (int item : mapDeep) {
                if (item == EMPTY_DOT) return true;
            }
        }
        return false;
    }

    private static String endGamePrint() {
        if (checkWin(PLAYER)) return "You";
        else if (checkWin(COMPUTER)) return "Computer";
        else return "Nobody";
    }
}
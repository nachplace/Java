package ru.geekbrains;


import java.util.Random;
import java.util.Scanner;

public class XoGame3 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_O = 'O';
    public static final char DOT_X = 'X';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void number() {
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        number();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkDot(int x, int y) {
        if (x >= SIZE || x < 0 || y >= SIZE || y < 0) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanStep() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!checkDot(x, y));
        map[x][y] = DOT_X;
    }

    public static void compStep() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!checkDot(x, y));
        System.out.println("Компьютер сделал шаг " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j < SIZE - 1) {
                    if (map[i][j] == map[i][j + 1] && map[i][j] == symb) {
                        count++;
                        if (count == 2) {
                            return true;
                        }
                    }

                }
                if (i < SIZE - 1) {
                    if (map[i][j] == map[i + 1][j] && map[i][j] == symb) {
                        count1++;
                        if (count1 == 2) {
                            return true;
                        }
                    }

                }
                if (j < SIZE - 1 && i < SIZE - 1) {
                    if (i == j && map[i][j] == map[i + 1][j + 1] && map[i][j] == symb) {
                        count2++;
                        if (count2 == 2) {
                            return true;
                        }
                    }

                }
                if (i + j == SIZE - 1 && i < SIZE - 1) {
                    if (map[i][j] == map[i + 1][j - 1] && map[i][j] == symb) {
                        count3++;
                        if (count3 == 2) {
                            return true;
                        }
                    }

                }
            }
        }

        return false;
    }

    public static boolean fullMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {

            humanStep();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }

            compStep();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}

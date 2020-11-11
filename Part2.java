package ru.geekbrains;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
        System.out.println(part6(new int[]{4, 5, 6, 2, 5, 7}));
        int x = 2;
        int y = -3;
        int[] r = {6, 6, 2, 8, 65, 4};
        part7(r, x);
        part7(r, y);
    }

    public static void part1() {
        System.out.println("Задание первое. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0");
        int[] binMass = {0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0};
        String str = "";
        String innStr = "";
        for (int i = 0; i < binMass.length; i++) {
            str = str + binMass[i] + " ";
            if (binMass[i] == 1) {
                binMass[i] = 0;
            } else {
                binMass[i] = 1;
            }
            innStr = innStr + binMass[i] + " ";
        }
        System.out.print("Массив до замены: ");
        System.out.println(str);
        System.out.print("Массив с заменой: ");
        System.out.println(innStr);
        System.out.println();
    }

    public static void part2() {
        System.out.println("Задание второе. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21");
        String str = "";
        int[] mass = new int[8];
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                mass[i] = 0;
            } else {
                mass[i] = mass[i - 1] + 3;
            }
            str = str + mass[i] + " ";
        }
        System.out.print("Заполненный массив: ");
        System.out.println(str);
        System.out.println();
    }

    public static void part3() {
        System.out.println("Задание третье. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
        }
        System.out.print("Массив после изменения: ");
        System.out.println(Arrays.toString(mass));
        System.out.println();
    }

    public static void part4() {
        System.out.println("Задание четвертое. Создать квадратный двумерный целочисленный массив и с помощью цикла(-ов) заполнить его диагональные элементы единицами");
        System.out.println("Готовый массив с единицами по диагоналям: ");
        int[][] mass = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                } else if (i + j == 3) {
                    mass[i][j] = 1;
                } else {
                    mass[i][j] = (int) (Math.random() * 8) + 2;
                }
                System.out.print(mass[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void part5() {
        System.out.println("Задание пятое. Задать одномерный массив и найти в нем минимальный и максимальный элементы");
        int[] mass = {2, 8, 45, -3, 85, 22, 24, 1, 0, 6};
        System.out.println(Arrays.toString(mass));
        int max = mass[0];
        int min = mass[mass.length - 1];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.print("Максимальный элемент: ");
        System.out.println(max);
        System.out.print("Минимальный элемент элемент: ");
        System.out.println(min);
        System.out.println();
    }


    public static boolean part6(int[] x) {
        System.out.println("Задание шестое. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны");
        System.out.print("Есть в массиве место, где сумма левой и правой части равны?: ");
        if (x.length == 0) {
            System.out.println("Ошибка, пустой массив");
        }
        int rightSum, leftSum;
        for (int i = 1; i < x.length - 1; i++) {
            rightSum = 0;
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += x[j];
            }
            for (int j = i; j < x.length; j++) {
                rightSum += x[j];
            }
            if (rightSum == leftSum) {
                return true;
            }
        }
        return false;
    }

    public static void part7(int[] x, int n) {
        System.out.println();
        System.out.println("Задание седьмое. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.");
        String str0 = "";
        for (int i = 0; i < x.length; i++) {
            str0 += x[i] + " ";
        }
        System.out.println("Выведем начальный массив: ");
        System.out.println(str0);
        String str1 = "";
        String str2 = "";
        String str = "";

        if (n >= 0) {
            for (int i = 0; i < x.length; i++) {
                if (i < x.length - n) {
                    str2 += x[i] + " ";
                } else {

                    str1 += x[i] + " ";
                }
                str = str1 + str2;
            }
            System.out.println("Выведем массив со смещением вправо:");

            System.out.println(str);
        }
        if (n < 0) {
            for (int i = 0; i < x.length; i++) {
                if (i < (-n)) {
                    str2 += x[i] + " ";
                } else {
                    str1 += x[i] + " ";
                }
                str = str1 + str2;
            }
            System.out.println("Выведем массив со смещением влево:");
            System.out.println(str);
        }
    }
}


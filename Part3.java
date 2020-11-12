package ru.geekbrains;

import java.util.Scanner;

public class Part3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Хотите сыграть в игру? 1 - да, 0 - нет");
        int yes = scanner.nextInt();

            if (yes == 1) {
                level(yes);
            } else if (yes == 0){
                System.out.println("Очень жаль, ждем вас снова. До свидания!");
                scanner.close();
            } else {
                System.out.println("Ошибка! Нужно было ввести 1 или 0! Теперь придется перезапустить игру");
            }

    }

     private static void level(int x) {

        System.out.println("Ваша задача угадать число");
        System.out.println("Всего у вас 3 попытки");
        int range = 9;
        System.out.println("Угадайте число от 0 до " + range);
        int number = (int) (Math.random() * range);
        int attempt = 1;
        for (int i = 1; i < 4; i++) {
            attempt = i;
            System.out.println("Это " + attempt + " попытка!");
            int input_number = scanner.nextInt();
            if(attempt < 3){
                if (input_number == number) {
                    System.out.println("Вы угадали число");
                    System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет");
                    int yes = scanner.nextInt();
                    if (yes == 1) {
                        level(yes);
                    } else if (yes == 0){
                        System.out.println("Очень жаль, ждем вас снова. До свидания!");
                    } else {
                        System.out.println("Ошибка! Нужно было ввести 1 или 0! Теперь придется перезапустить игру");
                    }

                } else if (input_number > number) {

                    System.out.println("Загаданное число меньше");

                } else {

                    System.out.println("Загаданное число больше");
                }
            } else {
                System.out.println("Больше нет попыток, вы проиграли");
                System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет");
                int yes = scanner.nextInt();
                if (yes == 1) {
                    level(yes);
                } else if (yes == 0){
                    System.out.println("Очень жаль, ждем вас снова. До свидания!");
                } else {
                    System.out.println("Ошибка! Нужно было ввести 1 или 0! Теперь придется перезапустить игру");
                }
            }
        }

    }
}


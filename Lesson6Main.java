package ru.geekbrains;

import java.util.Scanner;

public class Lesson6Main {


    public static Dog dog1 = new Dog("dog1 Charly");
    public static Dog dog2 = new Dog("dog2 Rex");
    public static Dog dog3 = new Dog("dog3 Bobik");
    public static Cat cat1 = new Cat("cat1 Barsic");
    public static Cat cat2 = new Cat("cat2 Murzic");
    public static Cat cat3 = new Cat("cat3 Baks");
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Сейчас мы узнаем, сможет ли животное выполнить действие!");
        System.out.println();
        start();
    }


    public static void dogRun(Dog Dog) {
        System.out.println("Вы выбрали бег! Введите расстояние для " + Dog.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Dog.getName());
        System.out.println(Dog.dogRun(x));
        System.out.println();
    }

    public static void setDogRun(Dog Dog) {
        System.out.println("Вы выбрали бег! Введите расстояние для " + Dog.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Dog.getName());
        System.out.println(Dog.setDogRun(x));
        System.out.println();
    }

    public static void dogSwim(Dog Dog) {
        System.out.println("Вы выбрали плавание! Введите расстояние для " + Dog.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Dog.getName());
        System.out.println(Dog.dogSwim(x));
        System.out.println();
    }

    public static void dogJump(Dog Dog) {
        System.out.println("Вы выбрали прыжок! Введите расстояние для " + Dog.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Dog.getName());
        System.out.println(Dog.dogJump(x));
        System.out.println();
    }

    public static void catRun(Cat Cat) {
        System.out.println("Вы выбрали бег! Введите расстояние для " + Cat.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Cat.getName());
        System.out.println(Cat.catRun(x));
        System.out.println();
    }

    public static void catSwim(Cat Cat) {
        System.out.println("Вы выбрали плавание! Введите расстояние для " + Cat.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Cat.getName());
        System.out.println(Cat.catSwim(x));
        System.out.println();
    }

    public static void catJump(Cat Cat) {
        System.out.println("Вы выбрали прыжок! Введите расстояние для " + Cat.getName() + "в метрах: ");
        int x = scanner.nextInt();
        System.out.print("Name " + Cat.getName());
        System.out.println(Cat.catJump(x));
        System.out.println();
    }

    public static boolean checkTrue(int x, int y) {
        if ((x >= 4 || x <= 0) || (y >= 4 || y <= 0)) {
            return false;
        }
        return true;
    }

    public static boolean checkTrue0(int x) {
        return x <= 2 && x >= 0;
    }

    public static void start() {
        int x, y;
        do {
            System.out.println("Какое животное хотите протестировать? Cat = 0, Dog = 1: ");
            x = scanner.nextInt();
        } while (!checkTrue0(x));
        if (x == 0) {
            do {
                System.out.println("Какую кошку будем тестировать? Введите номер для продолжения: cat1 = 1, cat2 = 2, cat3 = 3");
                x = scanner.nextInt();
                System.out.println("Что кошка будет делать? Введите номер для продолжения: run = 1, swim = 2, jump = 3: ");
                y = scanner.nextInt();
            } while (!checkTrue(x, y));
            if (x == 1) {
                if (y == 1) {
                    catRun(cat1);
                } else if (y == 2) {
                    catSwim(cat1);
                } else if (y == 3) {
                    catJump(cat1);
                }
            } else if (x == 2) {
                if (y == 1) {
                    catRun(cat2);
                } else if (y == 2) {
                    catSwim(cat2);
                } else if (y == 3) {
                    catJump(cat2);
                }
            } else if (x == 3) {
                if (y == 1) {
                    catRun(cat3);
                } else if (y == 2) {
                    catSwim(cat3);
                } else if (y == 3) {
                    catJump(cat3);
                }
            }
        } else {
            do {
                System.out.println("Какую собаку будем тестировать? Введите номер для продолжения: dog1 = 1, dog2 = 2, dog3 = 3: ");
                x = scanner.nextInt();
                System.out.println("Что собака будет делать? Введите номер для продолжения: run = 1, swim = 2, jump = 3: ");
                y = scanner.nextInt();
            } while (!checkTrue(x, y));
            if (x == 1) {
                if (y == 1) {
                    setDogRun(dog1);
                } else if (y == 2) {
                    dogSwim(dog1);
                } else if (y == 3) {
                    dogJump(dog1);
                }
            } else if (x == 2) {
                if (y == 1) {
                    dogRun(dog2);
                } else if (y == 2) {
                    dogSwim(dog2);
                } else if (y == 3) {
                    dogJump(dog2);
                }
            } else if (x == 3) {
                if (y == 1) {
                    dogRun(dog3);
                } else if (y == 2) {
                    dogSwim(dog3);
                } else if (y == 3) {
                    dogJump(dog3);
                }
            }
        }
    }
}
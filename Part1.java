package ru.geekbrains;

public class Part1 {

// Задание  1 с пустым методом main делается так
//  public static void main(String[] args) {
//
//  }
    public static void main(String[] args) {
        System.out.println("Задание второе. Посчитать результат выражения");
        System.out.print("Результат выражения равен: ");
        System.out.println(part2() + "\n");
        System.out.println("Задание третье. Инициализировать переменные простого типа");
        System.out.println("Список переменных: ");
        part3();
        System.out.println("\n");
        System.out.println("Задание четвертое. Посчитать результат суммы и сравнить, находится ли результат в пределах от 10 до 20");
        System.out.print("Результат сравнения равен: ");
        System.out.println(part4());
        System.out.println("\n");
        System.out.println("Задание пятое. вычислить, положительное число или отрицательное?");
        System.out.print("Результат вычисления равен: ");
        part5();
        System.out.println("\n");
        System.out.println("Задание шестое. Вернуть true, если число положительное, false - если отрицательное");
        System.out.print("Число положительное? ");
        System.out.println(part6() + "\n");
        System.out.println("Задание седьмое. Вывести строку 'Привет, имя'");
        System.out.print("Вывод строки: ");
        System.out.println(part7() + "\n");
        System.out.println("Задание восьмое. Вывести на экран високосный год или нет");
        System.out.print("Год ");
        part8();
    }

// здесь мы будем считать результат выражения и возвращать значение этого выражения
    public static Float part2() {
        float a = 1.11f;
        float b = 2.22f;
        float c = 3.33f;
        float d = 4.44f;
        float v = a * (b + (c / d));

        return v;
    }
// Здесь мы будем инициализировать переменные простых типов и выводить их в консоль
    public static void part3() {
        byte b = 10;
        short s = 442;
        int i = 10000;
        long l = 2000000L;
        float f = 1.43f;
        double d = 12.12;
        char c = '*';
        boolean bool = true;
        System.out.println("Переменная типа byte b = " + b);
        System.out.println("Переменная типа short s = " + s);
        System.out.println("Переменная типа int i = " + i);
        System.out.println("Переменная типа long l = " + l);
        System.out.println("Переменная типа float f = " + f);
        System.out.println("Переменная типа double d = " + d);
        System.out.println("Переменная типа char c = " + c);
        System.out.println("Переменная типа boolean bool = " + bool);


    }
// Здесь мы будем складывать 2 переменные и определять, находится ли  полученная сумма между числами от 10 до 20 включительно
    public static boolean part4() {
        int x1 = 5;
        int x2 = 8;
        int result = x1 + x2;
        if (result <= 20) {
            if (result >= 10) {
                return true;
            } else return false;
        } else return false;
    }
//Здесь мы будем выводить в консоль результат проверки, каким числом является переменная - положительным или отрицательным
    public static void part5() {
        int x = 15;
        String result;
        if (x >= 0) {
            System.out.println("Число x=" + x + " является положительным");
        } else {
            System.out.println("Число x=" + x + " является отрицательным");
        }
    }
// Здесь мы будем возвращать значения правда или ложь при определении знака переменной
    public static boolean part6() {
        int x = -13;
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }
// Здесь мы будем возвращать строку с надписью "Привет, х", где ч - переменная с именем
    public static String part7() {
        String x = "Иван";
        return ("Привет, " + x);
    }
// Здесь мы будем отпределять, является ли год високосным или нет
    public static void part8() {
        int x = 2080;
        if (x % 4 != 0){
            System.out.println(x + " - Год не является високосным");
        } else if (x % 100 == 0) {
            if (x % 400 == 0) {
                System.out.println(x + " - Это столетие,но год является високосным");
            } else {
                System.out.println(x + " - Это столетие, год не является високосным");
            }

        } else {
            System.out.println(x + " - Год високосный");
        }
    }
}


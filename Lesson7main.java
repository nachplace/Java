package ru.geekbrains;

public class Lesson7main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 20, false);
        Cat cat2 = new Cat("Murzic", 15, false);
        Cat cat3 = new Cat("Lana", 32, false);
        Cat cat4 = new Cat("Musya", 30, false);
        Cat[] cats = {cat1, cat2, cat3, cat4};

        Plate plate = new Plate(66, 80);

        for (int i = 0; i < 4; i++) {
            if (plate.getFood() >= cats[i].getAppetite()) {
                cats[i].eat(plate);
                System.out.println(!cats[i].isSatiety());
                plate.plateInfo();
            } else {
                System.out.print("Котику " + cats[i].getName() + " удалось покушать? ----> ");
                System.out.println(cats[i].isSatiety());
                System.out.println("В тарелке мало еды, котик не смог покушать и остался голодным(");
                plate.filling(plate.getFood());
                if (plate.getFood() >= cats[i].getAppetite()) {
                    plate.plateInfo();
                    cats[i].eat(plate);
                    System.out.println(!cats[i].isSatiety());
                    plate.plateInfo();
                }
            }
        }

    }

}

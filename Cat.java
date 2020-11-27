package ru.geekbrains;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Котик " + name + " кушает ...");
        plate.decreaseFood(appetite);
        System.out.print("Удалось котику покушать? ----> ");
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}

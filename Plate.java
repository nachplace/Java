package ru.geekbrains;

public class Plate {
    private int food;
    private final int capacity;

    public Plate(int food, int capacity) {
        this.food = food;
        this.capacity = capacity;
    }


    public void plateInfo() {
        System.out.print("В тарелке осталось: ");
        System.out.println(food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void filling(int n) {
        food = capacity;
        System.out.println("Хозяин положил полную миску и теперь этот котик может поесть");
    }

    public int getFood() {
        return food;
    }
}

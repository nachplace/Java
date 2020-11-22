package ru.geekbrains;

public class Cat extends Animals {

    private static int maxLengthRun = 200;
    private static int maxLengthSwim = 0;
    private static int maxHeightJump = 2;
    private static String name;

    public Cat(String name){
        Cat.name = name + " ";
    }

    public boolean catRun(int lengthRun){
        super.run();
        System.out.print(lengthRun);
        System.out.print(" m ----> ");
        return lengthRun <= maxLengthRun;
    }
    public boolean catSwim(int lengthSwim){
        super.swim();
        System.out.print(lengthSwim);
        System.out.print(" m ----> ");
        return lengthSwim <= maxLengthSwim;
    }
    public boolean catJump(int heightJump){
        super.jump();
        System.out.print(heightJump);
        System.out.print(" m ----> ");
        return heightJump <= maxHeightJump;
    }

    public int getMaxLengthRun() {
        return maxLengthRun;
    }

    public int getMaxLengthSwim() {
        return maxLengthSwim;
    }

    public float getMaxHeightJump() {
        return maxHeightJump;
    }

    public static String getName() {
        return name;
    }


    public void setMaxLengthRun(int maxLengthRun) {
        this.maxLengthRun = maxLengthRun;
    }

    public void setMaxLengthSwim(int maxLengthSwim) {
        this.maxLengthSwim = maxLengthSwim;
    }

    public void setMaxHeight(int maxHeightJump) {
        this.maxHeightJump = maxHeightJump;
    }
}

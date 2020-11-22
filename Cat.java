package ru.geekbrains;

public class Cat extends Animals {

    private static final int maxLengthRun = 200;
    private static final int maxLengthSwim = 0;
    private static final int maxHeightJump = 2;
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

    public static String getName() {
        return name;
    }

}

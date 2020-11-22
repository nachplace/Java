package ru.geekbrains;

public class Dog extends Animals{
    private static int maxLengthRun = 500;
    private static int maxLengthSwim = 10;
    private static float maxHeightJump = 0.5f;
    private static String name;

    public Dog(String name){
        Dog.name = name + " ";
    }


    public boolean dogRun(int lengthRun){
        super.run();
        System.out.print(lengthRun);
        System.out.print(" m ----> ");
        return lengthRun <= maxLengthRun;
    }
    public boolean dogSwim(int lengthSwim){
        super.swim();
        System.out.print(lengthSwim);
        System.out.print(" m ----> ");
        return lengthSwim <= maxLengthSwim;
    }
    public boolean dogJump(int heightJump){
        super.jump();
        System.out.print(heightJump);
        System.out.print(" m ----> ");
        return heightJump <= maxHeightJump;
    }

    public boolean setDogRun(int setLengthRun){
        super.run();
        System.out.print(setLengthRun);
        System.out.print(" m ----> ");
        setMaxLengthRun(600);
        return setLengthRun <= maxLengthRun;
    }

    public void setMaxLengthRun(int maxLengthRun) {
        Dog.maxLengthRun = maxLengthRun;
    }

    public static String getName() {
        return name;
    }
}

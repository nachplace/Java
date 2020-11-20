package ru.geekbrains;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public void info() {
        System.out.println("Full name: " + getFullName() + ", Posision: " + getPosition() + ", e-mail: " + getEmail() + ", Salary: " + getSalary() + ", Age: " + getAge());;
    }

}

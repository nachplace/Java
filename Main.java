package ru.geekbrains;



public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "Engineer", "iiivanov@ya.ru", 35000, 38);
        Employee employee2 = new Employee("Sidorov Sergey Sergeevich", "Security guard", "sssidorov@ya.ru", 24000, 52);
        Employee employee3 = new Employee("Petrov Petr Petrovich", "Administrator", "pppetrov@ya.ru", 34000, 42);
        Employee employee4 = new Employee("Vasilev Vasiliy Vasilevich", "Programmer", "vvvasilev@ya.ru", 85000, 28);
        Employee employee5 = new Employee("Matveev Matvey Matveevich", "Leader", "mmmatveev@ya.ru", 170000, 46);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        Employee employee;
        System.out.println("Cписок всех сотрудников: ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            employee = employees[i];
            employee.info();
        }
        System.out.println();
        System.out.println("Cписок сотрудников, возраст которых превышает 40 лет: ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            employee = employees[i];
            if (employee.getAge() > 40) {
                System.out.println("Full name: " + employee.getFullName() + ", Posision: " + employee.getPosition() + ", e-mail: " + employee.getEmail() + ", Salary: " + employee.getSalary() + ", Age: " + employee.getAge());
            }
        }
    }
}

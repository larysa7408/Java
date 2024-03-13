package homework.homework_02.homework_17;

/*
Задача 0

Написать класс Сотрудник (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info()выводящей информации о работнике.
 */
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void info(){
    System.out.println("Имя: "+name);
    System.out.println("Возраст: "+age);
    System.out.println("Зарплата: " + salary);
}

}

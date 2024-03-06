package homework_17.homework17;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #17 ext
 *
 * @author Larysa Petrova
 * @version 23-Feb-24
 */
/*
Задача 1.
Создать класс Employee(сотрудник) с полями:
ФИО, должность, адрес электронной почты, телефон, зарплата, возраст.
Конструктор должен заполнить эти поля. Создать массив из 5-10 сотрудников.
Вывести информацию о сотрудниках старше 40 лет, используя цикл для без счётчика.
 */
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position,
                    String email, String phone,
                    double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

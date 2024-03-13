package homework.homework_02.homework_15;

/*
Задача 0

Посмотрите вокруг себя. Напишите три класса, описывающие какие-то явления вокруг Вас.
Не забудьте использовать абстракцию.
Например, напишите студенту, преподавателю и, допустим, врачу.
Вы можете выбрать свои материалы для описания.

 */
public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    void everyday() {
        System.out.println("Я каждый день посещаю лекции");
    }

    void everyday1() {
        System.out.println("Я принимаю пациентов ");
    }

    void everyday2() {
        System.out.println("Я провожу уроки детям в школе");
    }


}

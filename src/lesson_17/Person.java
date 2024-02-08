package lesson_17;

public class Person {
    //Cоздаем класс и даем имя  Person
    String name;
    int age;
    String hobby;

    public Person(String name, int age, String hobby) {
        // Создаем конструктор с таким же именем
        this.name = name;
        this.age = age;
        this.hobby = hobby;

    }

    public String toString() {
        // Метод возвращающий строку о Информации которую  говорит о себе person
        return "Person" + name + "; age: " + age + "; hobby: " + hobby;
    }


}

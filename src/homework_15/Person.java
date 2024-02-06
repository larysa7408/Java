package homework_15;

/*
Задача 0

Посмотрите вокруг себя. Напишите три класса, описывающие какие-то явления вокруг Вас.
Не забудьте использовать абстракцию.
Например, напишите студенту, преподавателю и, допустим, врачу.
Вы можете выбрать свои материалы для описания.
Папа мама ребенок
возраст професия хобби
 */
public class Person {
    String name = ("Валера");
    int age=18;
    String profession=("Инженер");

    public void PersonDoctor (){
        String name1=("Максим");
        int age2=35;
        String profession1=("Стоматолог");

        System.out.println("Привет! Меня зовут "+ name1);
        System.out.println("Мне "+ age2+ " лет");
        System.out.println("По профессии " + profession1);

    }

    public void PersonTeacher(){
        String name2=("Олег");
        int age2=32;
        String profession2=("Учитель начальных классов");

        System.out.println("Привет! Меня зовут "+ name2);
        System.out.println("Мне "+ age2 + " лет");
        System.out.println("По профессии " + profession2);



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

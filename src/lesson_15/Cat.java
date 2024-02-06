package lesson_15;

/*
У кота есть
имя
цвет
возраст
Кот умеет мяукать спать бугать
 */
public class Cat {
    String name;//=null
    String color;//=null
    int age; //=0

    public Cat() { // вид конструктора по умолчанию
        //имя конструктора как имя класса
        //конструктор автомат при создании обьекта
        System.out.println("Конструктор 1");
    }

    //Перегруженный конструктор
    public Cat(String catName) {
        name = catName;
        System.out.println("Конструктор 2");
    }

    void sleep() {
        System.out.println("Я сплю");
    }

    void seyMeow() {
        System.out.println("Meow!");
    }

    void run() {
        System.out.println("Run");
    }

    public void whoAmI() {
        System.out.println("Я котик" + name + "мой возраст:" + age + "цвет:" + color);
    }





}



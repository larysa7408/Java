package lesson.lesson_09;

public class Methods {
    public static void main(String[] args) {

        // Метод - набор инструкций (операторов).
        // У каждого метода есть имя
        // Чтобы выполнить этот набор инструкций, мы обращаемся к методу по его имени

        // Выводила в консоль 5 раз слово "Hello"


        sayHello();
        System.out.println("=========");
        sayHello();
        System.out.println("=========");
        sayHello();

        myMethod();


    } // End method main


    public static void sayHello() {
        System.out.println("Hello");
        System.out.println("Friday");
    }

    public static void myMethod() {
        System.out.println("My method work");
    }
}


package lesson.lesson_02.lesson_04;

public class StringExample {
    public static void main(String[] args) {
        String name = "Сигизмунд"; // объявление и инициализация переменной типа String

        String name2 = new String("Hello"); // создание новой строки с помощью конструктора класса

        //длина строки
        System.out.println(name.length()); // получить длину нашей строки
        int length = name.length(); // поговорим позже, когда  будем говорить о методах
        System.out.println(length);

        //привести все символы в строке к верхнему регистру
        System.out.println(name.toUpperCase());
        System.out.println(name);

        //привести все символы в нижний регистр
        System.out.println(name.toLowerCase());
        System.out.println("name: " + name);
    }
}

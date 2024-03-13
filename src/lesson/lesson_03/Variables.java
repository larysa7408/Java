package lesson.lesson_03;

public class Variables {
    public static void main(String[] args) {

        //        Ctrl + D
        //        Alt + Shift + стрелка вверх / вниз

        int myFirstVariable; // Обьявление (декларация) переменной типа int


        myFirstVariable = 1; // Первое присвоение значение называется иниализацией. Присвоение значение переменной.

        int mySecondVariable = 25; // Обьявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50; //присвоение нового значения переменной

        System.out.println("mySecondVariable: " + mySecondVariable);

        byte byteVar = 125; // Обьявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        short shortVar; // инициализация переменной типа short
        shortVar = 31000; // инициализация переменной

        long longVariable = 2_100_000_000_000_000L; // знак не влияет на значение переменной.Исключительно для лучшего визуального понимания числа
        System.out.println("longVariable: " + longVariable);
        //L в конце числа - сказать компилятору что это число в формате long

        double doubleVar = 10.5421;
        System.out.println("doubleVar=" + doubleVar);

        float floatVar = 11.65F; //Число в формате float
    }
}



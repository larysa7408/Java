package homework.homework_02.homework_04;
/*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхнем регистре.
 Для каждой буквы имени создайте переменную типа char, инициализированную букву в сохраненном регистре.
 Затем преобразуйте каждую букву в верхний регистр с помощью арифметических операций и выведите результат.
 */
public class Task1 {
    public static void main(String[] args) {

        char ch1 = 'l';
        char ch2 = 'a';
        char ch3 = 'r';
        char ch4 = 'i';
        char ch5 = 's';
        char ch6 = 'a';


        System.out.println("мое имя:" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);

        System.out.println("До:" + ch1);
        //ch1 = (char) (ch1 - 32);
        ch1 -= 32; // ch1=ch1-32;
        System.out.println("После:" + ch1);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;
        ch6 -= 32;


    }
}

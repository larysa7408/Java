package homework_05;
/* Задача 1
     Создайте переменную с типом String, в которой будет хранится Ваше имя.
     Сколько букв в вашем имени? Выведите значение на экран
     Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
     Выведите на экран десятичный код первого и последнего символа вашего имени
     */
public class Task1 {
    public static void main(String[] args) {
        String name = "larysa"; //

        int nameLength = name.length();

        System.out.println("Букв в имени: " + nameLength);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.println((int) firstChar);
        System.out.println("Last char: " + (int) lastChar);

    }
}

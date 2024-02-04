package homework_14;
/*
Задача 0

Напишите метод перевода всех маленьких букв латинского алфавита в строку в верхнем регистре.

toUpperCase() использовать низзя.
 */

public class Task0 {
    public static String convertToUpperCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 'a' && c <= 'z') {
                charArray[i] = (char) (c - 'a' + 'A');

            }
        }
        return new String(charArray);

    }

    public static void main(String[] args) {
        String input = "java developer!";
        String result = convertToUpperCase(input);
        System.out.println(result);
    }

}

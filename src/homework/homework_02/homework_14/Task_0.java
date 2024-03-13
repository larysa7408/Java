package homework.homework_02.homework_14;

public class Task_0 {
    public static void main(String[] args) {
        String stringTest = "aAbdfgfr34354GH -. ! adDs";
        System.out.println(stringTest);
        System.out.println(stringToUpperCase(stringTest));

    }


    public static String stringToUpperCase(String string) {
        /*
        1. Проверки. Все помнить о проверках входящих аргументов
        2. Перебрать строку, если встречается латинский символ в нижнем регистре - поменять на верхний
         */

        if (string == null) return null;


        /*
        1. Преобразую строку в массив char
        2. Перебрать символы. Если нужно - поменять на соответсвующий символ в верхнем рег
        3. Сформировать из массива char строку и вернуть из метода
         */


        /*
        1. Преобразую строку в массив char
        2. Перебирать символы и формировать результирующую строку
         */

        char[] chars = string.toCharArray(); //Преобразую строку в массив char
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            // Option 1
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32); // Перебрать символы. Если нужно - поменять на соответсвующий символ в верхнем рег
            }
        }
//        return String.valueOf(chars); // Сформировать из массива char строку и вернуть из метода
//        return new String(chars); // Сформировать из массива char строку и вернуть из метода

        for (int i = 0; i < string.length(); i++) {
            // Option 2
            char current = string.charAt(i);

            if (current >= 97 && current <= 122) {
                result += String.valueOf((char) (current - 32)); // если чар от a до z - к результирующей строке приклеиваем соответсвующий символ в верхнем рег
            } else {
                result += String.valueOf(current); // какой-то другой символ - приклеиваем его без изменений
            }
        }

        return result;
    }


}

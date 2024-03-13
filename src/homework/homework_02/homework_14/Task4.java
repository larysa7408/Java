package homework.homework_02.homework_14;
/* Задача 4

Напишите метод, принимающий код и возвращающий новый код,
состоящий из 2-го и 3-го символов в строках преобразования,
преобразованных в верхний регистр. Распечатать полученный результат в методе main

"Hello" -> "EL"
"He" -> "E"
"H" -> ???

 */
public class Task4 {
    public static void main(String[] args) {

        String string =  "P";

        String str = substringToUpperCase(string);
        System.out.println(str);

//        str.equals("!!!")
//        if (str.isEmpty())
//        if (str.length() == 0);


    }


    public static String substringToUpperCase(String string) {

        if (string == null) return ""; // null

        String result = "";

        if (string.length() > 1) {
            char char2 = string.charAt(1);
            result += char2;
        }


        if (string.length() > 2) {
            char char3 = string.charAt(2);
            result += char3;
        }


//        result = result.isEmpty() ? "???" : result;

        return result.toUpperCase(); // null или пустая строка в случае, если не удалось найти символы

    }

}

package homework_05;
/* Задача 3
       Даны строки разной длины (длина - четное число)
    "string"
    "code"
    "Practice"
    Необходимо распечатать два средних символа строки.
    Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
    для "Practice" результат "ct".
     */
public class Task3 {
    public static void main(String[] args) {
        String var1 = "string";
        String var2 = "code";
        String var3 = "Practice";

        int middleIndex = var1.length() / 2;
        //System.out.println(var2.charAt(middleIndex));

        String substring = var1.substring(middleIndex - 1, middleIndex + 1);
        System.out.println("substring:"+ substring);
        System.out.println(" " + var1.charAt(middleIndex -1)+ var1.charAt(middleIndex));

        String subcode = var2.substring(middleIndex +1, middleIndex+1);
        System.out.println("subcode: " + subcode);
        System.out.println("" + var2.charAt(middleIndex-1)+ var2.charAt(middleIndex));

    }
}

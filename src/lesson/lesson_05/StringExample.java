package lesson.lesson_05;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "One";
        String str2 = "";
        String str3 = "hello";
        String str4 = "string4";

        // Различные варианты конкатенации
        //1.

        String concatStr = str1 + str2 + str3; //конкатенация -  склеивание строк
        System.out.println(concatStr);
        concatStr = str1 + " " + str2 + " " + "String";
        System.out.println(concatStr);

        //2. метод concat

        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);
        concatStr2 = "!";
        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toLowerCase();
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        //str1.concat(str2 + str3 + str4);// комбинирование способов конкатенации
        // -> (str1+str2).concat(str3)->(str1+str2+str3).concat(str4)
        System.out.println("concatStr:" + concatStr);

        //3.  метод join ( статический)

        String concatStrJoin = String.join("ABC", str1, str3, str4);
        System.out.println("concatStrJoin:" + concatStrJoin);
        concatStrJoin = String.join("-", str1, str3, str4);
        System.out.println("concatStrJoin:" + concatStrJoin);
        concatStrJoin = String.join("", str1, str3, str4);
        System.out.println("concatStrJoin:" + concatStrJoin);

        int int1 = 1;
        int int2 = 2;
        double db1 = 20.5;
        System.out.println("Сумма: " + (int1 + int2));
        System.out.println("Сумма: " + (db1 + int1 + int2));
        int age = 18;
        System.out.println("My age: " + age);


        String digits = "0123456789";

        int len = digits.length();
        System.out.println("Длина строки:" + len);
        //Взятие символа по его индексу (порядковому номеру)
        char firstChar = digits.charAt(0);
        digits = "dfbgdsfsfhG";
        digits = "0123456789";
        System.out.println("firstChar: " + firstChar);
        //последний индекс в нашей строке всегда имеет индекс (leght -1)
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);
        System.out.println(digits.charAt(digits.length() - 1 - 3));


        //System.out.println(digits.charAt(50 / -1)); Ошибка.аварийное завершение программы при обращении к несуществующему индексу
        System.out.println("End of program");

        //выделение подстроки из строки
        String subString = digits.substring(5);//выделяется подстрока с 5-го индекса до конца строки
        System.out.println("subString:" + subString);
        System.out.println(digits); //digits остается не измененной
        subString = digits.substring(5, 8); //[5...8) -- до 8го индекса, 8-й индекс не включается (не берется в подстроку)
        System.out.println("subString 5-8:" + subString);

        digits = "012345-01-6789-ghfhfgdhfgdfhgd101";
        // ищет индекс начала первого вхождения подстроки в строке
        int index = digits.indexOf('4');
        System.out.println("index:" + index);
        index = digits.indexOf("79");
        System.out.println("index:" + index);
        index = digits.indexOf("1");
        System.out.println("lastIndexOf1:" + index);
        System.out.println(digits.indexOf("fg"));
        System.out.println(digits.lastIndexOf("456735"));
        System.out.println(digits.length());

        //boolean isContains = digits.contains("01");


        System.out.println("================\n");

        String target = "abcabeabd";
        //Замена Заменяем подстроку на другую
        String output = target.replace("ab", "AB");
        System.out.println("output:" + output);

        output = target.replaceFirst("ab", "AB");
        System.out.println("output:" + output);
        output = target.replaceAll("ab", "AB");
        System.out.println("output" + output);


    }
}

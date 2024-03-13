package lesson.lesson_02.lesson_06;

public class StringComparison {
    public static void main(String[] args) {

        // String pool // Пул строк
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("JAVA");

        System.out.println("str1 : " + str1);
        System.out.println("str3 :" + str3);

        System.out.println(str1 == str2); //Сравнение ссылки на обьекты (значения переменных) А в переменных хранятся адреса памяти
        System.out.println(str1 == str3);

        System.out.println("str1.equals(str2) ->" +str1.equals(str2)); //сравнивает по значениям обьекта
        System.out.println("str1.equals(str3) ->" +str1.equals(str3)); //сравнивает по значениям обьекта
        System.out.println("str1.equals(str4) ->" +str1.equals(str4)); //сравнивает по значениям обьекта

        //Сравнивание с игнорированием регистра букв
        System.out.println("str1.equals(str4) ->" +str1.equalsIgnoreCase(str4));






    }
}

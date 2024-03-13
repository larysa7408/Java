package lesson.lesson_02.lesson_21;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder класс для работы с последовательностью символов
        //В отличии от String обьекты StringBuilder
        //

        StringBuilder stringBuilder = new StringBuilder();
        //append - добавляет строковое представление любого типа данных (строка число символ) к текущему обьекту

        stringBuilder.append("Hello").append(",").append("World!");

        //toString возвращающий строку представления
        String result = stringBuilder.toString();
        System.out.println(stringBuilder.toString());

        //insert
        stringBuilder.insert(3, "Java");
        System.out.println(stringBuilder.toString());

        //delete

        stringBuilder.delete(3, 6);
        System.out.println(stringBuilder.toString());
        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder.toString());

        //reverse()

        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());

        //lenght
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        stringBuilder.length();
        System.out.println(stringBuilder.length());

        //setLenght
        stringBuilder.setLength(17);
        System.out.println(stringBuilder.toString());


        //
        StringBuffer stringBuffer = new StringBuffer();

    }
}

package lesson.lesson_43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Lesson43 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        String str = null;
        int[] ints = {1, 2, 3};
        System.out.println("a= " + a + ", b = " + b);
//        System.out.println(ints[3]);
//        System.out.println(str.charAt(0));
//        System.out.println(getADivB(a, b));

//        try {
//            printTextFile("text.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        int idx = 1;
//        try {
//            ints[idx]=5;
//            System.out.println(ints[idx]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("Finally block.");
//        }


        if(str == null){
            throw new MyRuntimeException("Str is null.");
        }

        try {
            Stream<String> text = Files.lines(Path.of("text.txt"));
            text.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Everything OK");
    }

    static void printTextFile(String fileName) throws IOException {
        Stream<String> text = Files.lines(Path.of(fileName));
        text.forEach(System.out::println);
    }

    static Integer add(Integer a, Integer b) {
        return a + b;
    }

    static int getADivB(int a, int b) {
        return division(a, b);
    }

    static int division(int a, int b) {
        //перехват исключения
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            //TODO
        }
        return 0;
    }
}


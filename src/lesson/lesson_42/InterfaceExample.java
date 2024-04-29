package lesson.lesson_42;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfaceExample {
    public static void main(String[] args) {
        //Первый функциональный интерфейс Consumer <T> выполняет операцию над обьектом типа Т,Не возвращает никакого результата
        //Абстрактный Метод  void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        };

        Consumer<String> printConsumer = t -> System.out.println(t + "!!!");
        printConsumer.accept("Hello World");

        Consumer<String> consumer1 = string -> System.out.println("1. " + string.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");
        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        // Второй Predicate <T> = простая функция которая принимает обьект типа Т и возвращает булевое значение
        // Этот интерфейс особенно полезен для проверки соответствия элемента неким условиям (фильтрации)
        //boolean test( T t ) основной метод
        //or
        //and
        //negate() - инверсия

        Predicate<String> testPredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isNotEmpty = string -> !string.isEmpty();
        boolean result = isNotEmpty.test("Hello , World");
        System.out.println(result);

        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11, 45));
        List<Integer> res1 = geListByPredicate(list, integer -> integer < 0);
        System.out.println(res1);

        List<Integer> res2 = geListByPredicate(list, integer -> integer % 2 == 0);
        System.out.println(res2);

        Predicate<String> isContainsJava = string -> string.contains("Java");

        Predicate<String> combinePredicate = isNotEmpty.or(isContainsJava);
        Predicate<String> combinePredicate2 = isContainsJava.negate();

        System.out.println(combinePredicate.test("Java"));

        int i = 1;
        if (i >= 0 || i < 25) ;

        // Третий Finction <T,R> принимает входной тип Т и возвращает результат типа R
        //Конвертация из одного типа в другой тип
        // интерфейс совершает какое то действие
        // R apply(T t);
        Function<String,Integer>integerFunction=new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return null;
            }
        };

        Function<String,Integer>function=string -> string.length();
        int lenght = function.apply("Hello World!");
        System.out.println("lenght"+lenght);

        Function<String,String>toUpperCase=String::toUpperCase;
        Function<String, String>concatenate = string -> string+"!!!";
        Function<String,String>combinedFunc=toUpperCase.andThen(concatenate);

        String result1 = combinedFunc.apply("Hallo");
        System.out.println(result1);


    }

    public static List<Integer> geListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : integers) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
}

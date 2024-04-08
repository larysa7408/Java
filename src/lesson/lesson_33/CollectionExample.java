package lesson.lesson_33;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(); // реализация ArrayList
        integers.add(25);
        integers.add(5);
        integers.add(3);
        integers.add(-4);
        System.out.println(integers);
        integers.remove(Integer.valueOf(3));
        System.out.println(integers);

        Deque<String> strings = new LinkedList<>(); // реализация LinkedList
        strings.push("Java");
        strings.push("love");
        strings.push("I");
        strings.push("===");
        System.out.println(strings);
        System.out.println(strings.pop());
        System.out.println(strings);

//        for (Integer item : integers){
//            System.out.println(item);
//        }

        //Iterator объект, который перебирает элементы списка или массива
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }
        System.out.println("========");

        RubberArrayCollection<Integer> integerList = new RubberArrayCollection<>();
        integerList.add(7);
        integerList.add(12);
        integerList.add(1);
        System.out.println(integerList);
//        for (Integer item : integerList){
//            System.out.println();
//        }
        Iterator<Integer> itr = integerList.iterator();
        while (itr.hasNext()) {
            Integer item = itr.next();
            System.out.println(item);
        }
    }
}

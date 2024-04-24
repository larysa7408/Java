package lesson.lesson_34;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //методы интерфейса Collection
        //Все эти методы гарантированно есть во всех коллекциях (кроме Map)

        //Возвращает boolean add(E e)-> добавлять элемент в коллекцию
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("список до вставки " + list);

        list.add(2, 100);
        System.out.println("список после вставки " + list);

        //int size()-> кол-во элементов в коллекции
        System.out.println("list.size ->" + list.size());

        //boolean remove (Object) удаляет элемент из коллекции по значению
        //[T]ype remove(int index)

        list.remove(Integer.valueOf(100));
        System.out.println(list);

    }
}

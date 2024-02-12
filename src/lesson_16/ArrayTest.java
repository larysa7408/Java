package lesson_16;

public class ArrayTest {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(10, 15, -6, 41, -16, 7, 99, 0, 15);// воспользовались методом public int get(int index)
        // который принимает неограниченное количество интов
        System.out.println(ra.toString());
        System.out.println("size: " + ra.size());// выявить сколько элементов в массиве
        System.out.println(ra.get(3));
        System.out.println(ra.get(9));

        ra.array = new int[2];
        System.out.println(ra.toString());

    }
}

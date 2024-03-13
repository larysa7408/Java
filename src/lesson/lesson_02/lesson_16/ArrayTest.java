package lesson.lesson_02.lesson_16;

public class ArrayTest {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(10, 15, -6, 41, -16, 7, 99, 0, 15);// воспользовались методом public int get(int index)
        // который принимает неограниченное количество интов
        System.out.println(ra.toString());
        System.out.println("size: " + ra.size());// выявить сколько элементов в массиве
        System.out.println(ra.get(3));
        System.out.println(ra.get(9));

        // ra.array = new int[2]; private
        //  ra.cursor = 1000;
        ra.add(1);
        System.out.println(ra.toString());

        int[] ints = {10, 56, -53, 0, 1, 77, 43};
        RubberArray rubberArray = new RubberArray(ints);
        System.out.println("arrayArray from array: "+ rubberArray.toString());

        System.out.println(rubberArray.indexOf(-53));
        System.out.println(rubberArray.indexOf(10000));

        System.out.println("remove: " + rubberArray.remove(2));
        System.out.println(rubberArray.toString());


        rubberArray.getClass();

        rubberArray.add(100);
        System.out.println(rubberArray.toString());

        rubberArray.removeByValue(100);
        rubberArray.removeByValue(10);
        rubberArray.add(55, 55, 55, 18, 55);
        System.out.println(rubberArray.toString());

        System.out.println(rubberArray.removeByValue(1000));



    }


}

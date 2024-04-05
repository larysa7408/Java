package homework.homework_33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #33
 *
 * @author Larysa Petrova
 * @version 4-Apr-24
 */
public class HW33_Task2 {
    //Fill them with 5_000 identical random values from 0 to 1_000.
    private static final int CAPACITY = 5_000;
    private static final int BOUND = 1_000;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        //Create two lists: ArrayList and LinkedList.
        List<Integer> listA = new ArrayList<>(CAPACITY);
        List<Integer> listL = new LinkedList<>();

        for (int i = 0; i < CAPACITY; i++) {
            int randomValue = RANDOM.nextInt(BOUND);
            listA.add(randomValue);
            listL.add(randomValue);
        }

        System.out.println("=====ArrayList======");

        long totalDuration = 0;
        long duration1 = getAllValuesByIndex(listA);
        totalDuration += duration1;

        System.out.println("getAllValuesByIndex(listA) -> " + duration1);

        long duration2 = insertValuesByIndex(listA);
        totalDuration += duration2;

        System.out.println("insertValuesByIndex(listA) -> " + duration2);

        long duration3 = deleteByIndex(listA);
        totalDuration += duration3;

        System.out.println("deleteByIndex(listA) -> " + duration3);

        long duration4 = deleteByValues(listA);
        totalDuration += duration4;

        System.out.println("deleteByValues(listA) -> " + duration4);

        System.out.println("Total time ArrayList: " + totalDuration);


        System.out.println("=====LinkedList======");

        totalDuration = 0;
        duration1 = getAllValuesByIndex(listL);
        totalDuration += duration1;

        System.out.println("getAllValuesByIndex(listL) -> " + duration1);

        duration2 = insertValuesByIndex(listL);
        totalDuration += duration2;

        System.out.println("insertValuesByIndex(listL) -> " + duration2);

        duration3 = deleteByIndex(listL);
        totalDuration += duration3;

        System.out.println("deleteByIndex(listL) -> " + duration3);

        duration4 = deleteByValues(listL);
        totalDuration += duration4;

        System.out.println("deleteByValues(listL) -> " + duration4);

        System.out.println("Total time LinkedList: " + totalDuration);
    }

    public static long getAllValuesByIndex(List<Integer> list) {
        // In the first method, getting all the results of the list elements by its index.
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long insertValuesByIndex(List<Integer> list) {
        //Second method - inserting 2_000 new results at a random index (index range from 0 to list size)
        int amountValues = 2000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amountValues; i++) {
            list.add(RANDOM.nextInt(list.size()), RANDOM.nextInt(BOUND));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long deleteByIndex(List<Integer> list) {
        //The third method is to remove 1_000 elements at a random index. (index range from 0 to collection size)
        int amount = 1000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            list.remove(RANDOM.nextInt(list.size()));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long deleteByValues(List<Integer> list) {
        //Delete 1_000 elements by mistake (range of random results from 0 to 10_000)
        int amount = 1000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            list.remove(Integer.valueOf(RANDOM.nextInt(10_000)));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }
}

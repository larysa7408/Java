package homework.homework_33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #33
 *
 * @author Larysa Petrova
 * @version 4-Apr-24
 */

//Task 1.
// Write a method that adds (in parameters) two lists,
// implementing the List interface.
// The method should return a list of dimensions,
// present in the top collections.
public class HW33_Task1 {
    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>(List.of(1, 3, 3, 5, 7, 9, 10, 11));
        List<Integer> integers2 = new LinkedList<>(List.of(0, 3, 7, 7, 6, 12, 15, 0));

        System.out.println("intersection (integers1, integers2) -> " + intersection(integers1, integers2));
        System.out.println("intersection (integers2, integers1) -> " + intersection(integers2, integers1));
    }

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.retainAll(list2); // пересечение
        return result;
    }
}

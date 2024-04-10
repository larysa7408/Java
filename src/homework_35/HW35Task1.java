package homework_35;

import java.util.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #35
 *
 * @author Larysa Petrova
 * @version 10-Apr-24
 */

public class HW35Task1 {
    public static void main(String[] args) {
        String text = "i love java i love spring i love books i love walking i love writing java code ";
        String[] words = text.split(" ");

        List<String> wordsList = new ArrayList<>(List.of(words));
        System.out.println(wordsList);

        Set<String> stringSet = new HashSet<>(List.of(words));
        System.out.println(stringSet);
    }
}

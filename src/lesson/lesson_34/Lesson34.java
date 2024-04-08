package lesson.lesson_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(5, 3, 6, 2, 4, 1));
        Collections.sort(ints);
        System.out.println(ints);

        List<Person> persons = new ArrayList<>(List.of(
                new Person("John", 35),
                new Person("Luke", 21),
                new Person("Luke", 25),
                new Person("Mark", 26),
                new Person("Alex", 19)));
        Collections.sort(persons);
        System.out.println(persons);

        // AgeComparator ageComparator = new AgeComparator();
        //Comparator<Person> ageComparator = (o1, o2) -> (Integer.compare(o1.getAge(), o2.getAge()));


        Comparator<Person> nameAgeComparator = (o1, o2) -> {
            int nameCompare = o1.getName().compareTo(o2.getName());
            if (nameCompare == 0) {
                return (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() == o2.getAge()) ? 0 : 1);
            }
            return nameCompare;
        };

        Collections.sort(persons, (o1, o2) -> (Integer.compare(o1.getAge(), o2.getAge())));
        System.out.println(persons);
    }
}

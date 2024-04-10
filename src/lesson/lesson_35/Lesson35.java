package lesson.lesson_35;

import lesson.lesson_34.Person;

import java.util.*;

public class Lesson35 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Hello", "I", "Love", "Java"));
        stringList.add("too");
        stringList.add("Java");
        System.out.println(stringList);

        Set<String> stringSet = new HashSet<>(List.of("Hello", "I", "Love", "Java"));
        System.out.println(stringSet.add("too"));
        System.out.println(stringSet.add("Java"));
        System.out.println(stringSet);

        Set<String> strLinkedSet = new LinkedHashSet<>(List.of("Hello", "I", "Love", "Java"));
        System.out.println(strLinkedSet.add("too"));
        System.out.println(strLinkedSet.add("Java"));
        System.out.println(strLinkedSet);

        Person p1 = new Person("Mike", 35);
        Person p2 = new Person("Mike", 35);
        System.out.println(p1.equals(p2));

        System.out.println("=============HashMap===============");

        Map<Integer, Person> stringMap = new HashMap<>();
        stringMap.put(125, new Person("Luke", 28));
        System.out.println(stringMap.get(125));

        System.out.println("=============HashTable===============");

        HashTable<String, Person> strMap = new HashTable<>();
        strMap.put("A12D", new Person("Luke", 28));
        strMap.put("R16", new Person("Mark", 24));
        System.out.println(strMap);
        System.out.println(strMap.get("A12D"));
        System.out.println(strMap.get("15"));
    }
}

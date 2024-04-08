package homework.homework_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #34
 *
 * @author Larysa Petrova
 * @version 7-Apr-24
 */

public class Company {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(6, 4, 5, 3, 1, 2, 7));
        Collections.sort(ints);
        System.out.println(ints);

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Kirill", 27, "kirill@exzample.com", "+490536857834", 1800, "Manager"),
                new Employee("Vlad", 25, "vlad@exzample.com", "+490533576835", 1800, "Manager"),
                new Employee("Nikita", 33, "nikita@exzample.com", "+4905326789939", 2400, "IT"),
                new Employee("Valeriya", 24, "valeriya@exzample.com", "+490533702677", 2200, "Designer"),
                new Employee("Marina", 37, "marina@exzample.com", "+4905373126954", 3000, "Administrator"),
                new Employee("Olga", 43, "olga@exzample.com", "+4905313468023", 2800, "Accountant"),
                new Employee("Dmitriy", 45, "dmitriy@exzample.com", "+4905325653890", 4000, "Director")
        ));

        Comparator<Employee> nameComparatorAsc = Comparator.comparing(Employee::getName);
        Collections.sort(employees, nameComparatorAsc);

        Comparator<Employee> nameComparaterDesc = Comparator.comparing(Employee::getName).reversed();
        Collections.sort(employees, nameComparaterDesc);

        Comparator<Employee> ageComporatorAsc = Comparator.comparing(Employee::getAge);
        Collections.sort(employees, ageComporatorAsc);

        Comparator<Employee> ageComparaterDesk = Comparator.comparing(Employee::getAge).reversed();
        Collections.sort(employees, ageComparaterDesk);

        System.out.println("Sorted Employees");
        employees.forEach(System.out::println);

        System.out.println("=========================");

        Comparator<Employee> nameAgeComparator = (o1, o2) -> {
            int nameCompare = o1.getName().compareTo(o2.getName());
            if (nameCompare == 0) {
                return (Integer.compare(o1.getAge(), o2.getAge()));
            }
            return nameCompare;
        };

        Collections.sort(employees, nameAgeComparator);
        System.out.println(employees);
    }
}

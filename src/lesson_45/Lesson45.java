package lesson_45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Locale;

public class Lesson45 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateNow);
        System.out.println(timeNow);
        System.out.println(dateTimeNow);


        LocalDate okudzava = LocalDate.of(1924, 5, 9);
        LocalDate theSame = LocalDate.of(1924, 5, 9);
        System.out.println(okudzava);
        System.out.println(okudzava.equals(theSame));
        System.out.println(timeNow.plusHours(3));
        System.out.println(dateNow.plusWeeks(1));
        System.out.println(dateNow.plusWeeks(1));
        System.out.println(dateNow.minusYears(1));
        System.out.println(dateNow.plusYears(1));

        System.out.println(dateNow.getYear()- okudzava.getYear()); //выводит возраст

        Period period=Period.between(okudzava,dateNow);
        System.out.println(period.getYears());
    }
}

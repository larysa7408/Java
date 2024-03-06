package lesson_22.lesson22;

public class Lesson22 {
    public static void main(String[] args) {
        Horse horse = new Horse("Tunder");
        System.out.println(horse);
        horse.run();

        Pegas pegas=new Pegas("Pegas");
        System.out.println(pegas);
        pegas.run();
        pegas.walk();
        pegas.fly();

        System.out.println("=======================");

    }
}

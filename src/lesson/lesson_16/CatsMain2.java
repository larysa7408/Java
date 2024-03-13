package lesson.lesson_16;

import lesson.lesson_15.Cat;

public class CatsMain2 {
    public static void main(String[] args) {
        Cat catEmpty = new Cat();
        catEmpty.whoAmI();

        System.out.println(" =================== \n");

        Cat cat = new Cat("Max");
        cat.whoAmI();

        Cat cat1 = new Cat("Bear", "black");

        cat1.whoAmI();

        System.out.println("===============================\n");

        Cat cat2 = new Cat("Freddy", "white", 5);
        cat2.whoAmI();




    }
}

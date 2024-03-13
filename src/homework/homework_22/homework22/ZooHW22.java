package homework.homework_22.homework22;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #18
 *
 * @author Larysa Petrova
 * @version 6-Mar-24
 */
/*
Задача 1. Создать классы, моделирующие животных,
в иерархии наследования типа Animal<- Cat<- Tiger.
Показать работу с модификатором protected, с конструктором предков,
использованием super и переопределением методов.
 */
public class ZooHW22 {
    public static void main(String[] args) {
        Cat cat = new Cat("Miki", 6);
        cat.meow();
        cat.eat();
        cat.sleep();

        Tiger tiger = new Tiger("Leon", 14);
        tiger.roar();
        tiger.eat();
        tiger.sleep();
    }
}

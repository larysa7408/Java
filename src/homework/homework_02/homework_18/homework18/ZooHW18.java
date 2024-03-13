package homework.homework_02.homework_18.homework18;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #18
 *
 * @author Larysa Petrova
 * @version 26-Feb-24
 */
public class ZooHW18 {
    public static void main(String[] args) {

        System.out.println(Animal.ANIMALS);

        Animal animal = new Animal("Lion", 5);
        Animal animal1 = new Animal("Tiger", 8);
        animal.sayHello();
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(Animal.getQuantity());
    }
}

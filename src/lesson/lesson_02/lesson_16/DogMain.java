package lesson.lesson_02.lesson_16;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Boss" , 7);
        System.out.println(dog.whoAmI());
        dog.run();
        dog.run();
        System.out.println(dog.whoAmI());
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        System.out.println(dog.whoAmI());

        System.out.println("================");
        System.out.println(dog.whoAmI());

    }
}

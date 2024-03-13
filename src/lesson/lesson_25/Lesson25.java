package lesson.lesson_25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.voice());

//        Animal cat = new Cat();
//        System.out.println(cat.voice());

//        Animal dog = new Dog();
//        System.out.println(dog.voice());

        Animal[] animals = {new Cat(), new Dog(), new Hen()};
        for (Animal a : animals) {
            System.out.println(a.voice());
        }
    }
}

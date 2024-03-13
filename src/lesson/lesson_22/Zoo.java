package lesson.lesson_22;

public class Zoo {
    public static void main(String[] args) {



        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Hamster hamster=new Hamster();
        hamster.voice();

        ///переопределение методов это процесс в кот подкласс ребенок

     Dog dog = new Dog();
     dog.voice();

        System.out.println(animal);
        System.out.println(hamster);

      String test = "Test" +animal+ " " + hamster;
        System.out.println(test);

    }
}

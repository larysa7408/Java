package lesson_22;

public class Casting {
    //
    public static void main(String[] args) {
        Animal animal = new Hamster(); //
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        Cat cat = new Cat();
        cat.eat();

        System.out.println("=========SayHello=======");

        sayHello(animal);
        sayHello(cat);

        System.out.println("=========SayHello=======");

        Object catObj = new Cat();


        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) { //
                System.out.println(animals[i] + " может быть downcasting к Cat");
                Cat catTest = (Cat) animals[i];
                catTest.eat();
            } else {
                System.out.println(animals[i] + "НЕ может быть downcasting к Cat");
            }
            if (animals[i] instanceof Dog) {/// Проверка как отобразится собака
                System.out.println(animals[i] + " casting to Dog");
                Dog dog = (Dog) animals[i];
                dog.voice();
            } else {
                System.out.println(animals[i] + "НЕ может быть downcasting к Dog");
            }


            System.out.println(animals[i]);
            animals[i].voice();

            System.out.println("========");

        }
        System.out.println("==========DownCasting============");
        Cat cat1 = (Cat) animal2;
        cat1.voice();
        cat1.eat();

        Animal animalSuper = new SuperCat();

        if (animalSuper instanceof Cat) {
            Cat cat2 = (Cat) animalSuper;
            cat2.eat();
        }
        if (animalSuper instanceof SuperCat) {
            SuperCat superCat = (SuperCat) animalSuper;
            superCat.superVoice();
        }
    }

    public static void sayHello(Animal animal) {
        animal.voice();
    }


}

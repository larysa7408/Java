package lesson_17;

public class MainCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Test", "Name", 10, 5);

        cat.sayMeow();

        String catName = cat.getName(); // с помощью геттера получили значение поля name
        int catAge = cat.getAge();

        System.out.println(catName + " : " + catAge);

        cat.setAge(-15);

        System.out.println("getAge: " + cat.getAge());

        cat.setName("Ball");
        System.out.println("cat.getName(): " + cat.getName());



    }

}

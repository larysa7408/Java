package lesson.lesson_15;

public class lesson_15 {
    public static void main(String[] args) {

        Cat1 cat1 = new Cat1("Murzik"," white", 3,5);
        cat1.voice();
        System.out.println(cat1.name+","+ cat1.color+ "," + cat1.age);

        Cat1 cat2 = new Cat1("Barsik"," black", 5,7);
        cat1.voice();
        System.out.println(cat2.name+","+ cat2.color+ "," + cat2.age);
        cat2.eat(7);
        System.out.println(cat2.satiated());


    }
}

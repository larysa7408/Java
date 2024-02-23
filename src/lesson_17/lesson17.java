package lesson_17;

public class lesson17 {
    public static void main(String[] args) {
        Cat17 cat17 = new Cat17("Murzik","white", 3);
        System.out.println("Name: " + cat17.getName() + " color : " +cat17.color+ " age " + cat17.age);
        cat17.voice();

    }
}

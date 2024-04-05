package homework.homework_32;

public class BoxUse {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println(appleBox);
        System.out.println("Box weight: " + appleBox.getWeight());
        System.out.println("==================================");
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(orangeBox);
        System.out.println("Box weight: " + orangeBox.getWeight());

        System.out.println("==================================");

        //compare test
        System.out.println("Compare: " + appleBox.compareTo(orangeBox));
        System.out.println("Compare: " + orangeBox.compareTo(appleBox));
        System.out.println("Compare: " + orangeBox.compareTo(orangeBox));

        System.out.println("==================================");

        //moveTo test
        Box<Apple> newAppleBox = new Box<>();
        appleBox.moveTo(newAppleBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("newAppleBox: " + newAppleBox);
    }
}

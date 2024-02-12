package homework_18;

public class JumpingDog1 { public static void main(String[] args) {

    Dog1 dog = new Dog1("Jumper", 50);

    dog.info();


    System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(30));
    System.out.println("dog.takeBarrier(70): " + dog.takeBarrier(70));
    System.out.println("dog.takeBarrier(120): " + dog.takeBarrier(120));

    System.out.println(" \n ============================= \n");

    Dog1 dog1 = new Dog1("Bim", 44); // 54, 64, 74, 84 == 88
    System.out.println(dog1.takeBarrier(85));



}
}

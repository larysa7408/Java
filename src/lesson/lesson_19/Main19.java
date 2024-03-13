package lesson.lesson_19;

public class Main19 {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(15);
        FinalDemo finalDemo1 = new FinalDemo(25);

        finalDemo.printArray();
        finalDemo.setNewValue();
       String s;

        System.out.println(FinalDemo.PI);
        //FinalDemo.PI = 55; Значение константы неизменяемо
        finalDemo.setNewSize(15);
        FinalDemo.INTS[0]=150;// Вполне себе допустимая операция
        FinalDemo.INTS[0]=200;// Вполне себе допустимая операция

        System.out.println(Math.E);
    }
}

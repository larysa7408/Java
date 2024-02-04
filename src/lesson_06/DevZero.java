package lesson_06;

public class DevZero {
    public static void main(String[] args) {
        //int result = 100/0; //Исключение (ошибка) //by Zero;
        //System.out.println(result);

        double result = 100.0 / 0;
        double result1 = 1000.0 / 0;

        System.out.println(result);
        System.out.println(result == result1);

        double result3 = result * result1;
        System.out.println(result3);
    }
}

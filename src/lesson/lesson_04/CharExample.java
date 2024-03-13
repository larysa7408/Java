package lesson.lesson_04;

public class CharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменная будет хранить в себе буквy А латинского алфавита
        char a1 = 65; // Переменная будет хранить в себе буквy А латинского алфавита
        char a2 = 0x0041; // Число в 16-системе счисления. Переменная будет хранить в себе буквy А латинского алфавита
        a2 = 0x41;
        char a3 = '\u0041'; // Число в 16-системе счисления. Переменная будет хранить в себе буквy А латинского алфавита


        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        /*
        48..57 -> 10-коды цифр от 0 до 9
        65...90 -> Большие буквы латинского алфавита
        97...122 -> маленькие буквы латинского алфавита
         */


        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        digit0++;
        digit0 += 4;
        System.out.println("digit0: " + digit0);

        char symbolZ = 90;
        System.out.println("symbolZ: " + --symbolZ);

        char smallA = 97;
        System.out.println("smallA: " + smallA);

        smallA = (char) (smallA + 10);
        System.out.println("smallA: " + smallA);

        char ch = 15874; // int в диапазоне от 0 до 65535 кастируются в тип char не явно (т.е. мы не должны явно указывать приведение)
        System.out.println(ch);

        //Переполнение типа данных

        // byte -128..127

        byte bt = 127;
        System.out.println("bt: " + bt);
        bt += 10; // -128 + 9 -> -119 Переполнение типа данных
        System.out.println("bt: " + bt);

        bt = -128;
        bt--;
        System.out.println("bt: " + bt);

        short sh = 32767;
        sh++; // Переполнение типа данных
        System.out.println("sh: " + sh);

        char jap = '\u1f60';
        System.out.println(jap);


    }
}

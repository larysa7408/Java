package homework.homework_06;
/* Задача 3
      со звездочкой Построчно сократить логическое выражение
      (соблюдение приоритетности операций)
      */
public class Task3 {
    public static void main(String[] args) {

        boolean p = true;
        boolean t = false;
        int f = 45;
        int k = 70;

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true || false ^ true && !true);
        System.out.println(true || false ^ true && false);
        System.out.println(true || true && false);
        System.out.println(true || false);
        System.out.println(true);

    }
}

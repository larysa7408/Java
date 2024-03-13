package homework.homework_03;
/*
int x = 3
Чему будет равно значение х после выполнения операции x += x++ ?
Проверьте свое предположение на практике.
 */
public class Task5 {
    public static void main(String[] args) {
        int x = 3;

        // так писать НЕ нужно!!!
        x += x++; // x = x + x++; -> x = 3 + 3; x =3 > 4;  x = 6

        System.out.println(x);

        int y = 5;

        y = y++ + y++; // 5 + (y=6) + 6; (y=7) -> y = 11;
        System.out.println("y: " + y);



        int a = 5;

        x = x + 1;
        System.out.println("x: " + x);
//        x++; // x = x + 1; Инкремент

        a = x++; // a = x; x = x + 1;
        a = x++ + 5; // такой код тоже достаточно редок

        // x++ -> пост-инкремент -> сначала берется текущее значение х, которое участвует в дальнейших вычислениях
        // ++x // пре-инкремент -> сначала значения х увеличивается на 1, только потом новое значение участвует в дальнейших вычислениях
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        a = x++;
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        // декременты, пост и пре
        x--; // x = x - 1;

        --x;

        int var1 = 1;

        x = x + 5;
        x += 5; // x = x + 5;
        x += (a + 6 / var1); // x = x + (a + 6 / var1);

        x -= 5; // x = x - (выражение)
        x *= 5;
        x /= 5; // x = x / 5;

        x++;
        x--;



    }
}

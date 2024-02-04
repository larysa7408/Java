package homework_09;
/* Задание 1

За каждый месяц начисления банка на сумму вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму и количество месяцев.
 Банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 Для расчета суммы с учетом процента воспользуйтесь циклом for.
Пусть последний вклад будет типом float.

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,00

 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int percentPerMonth = 7;
        float sumDeposit;
        int months;

        System.out.println("Сколько денег Вы готовы доверить нашему банку?:");
        sumDeposit=scanner.nextFloat();

        System.out.println("Накакой срок (в месяцах)?");
        months=scanner.nextInt();

        for(int i=1; i<=months; i++){
            sumDeposit+=sumDeposit*percentPerMonth/100; // каждый месяц сумма будет увеличиться на percentPerMonth процентов
        }

        System.out.printf("Через %d месяцев мы может быть вернем вам %.2f", months, sumDeposit);



    }
}

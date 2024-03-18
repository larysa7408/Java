package homework.homework_27.ps1;

/*
Задача 1.
Платежные системы. Создать интерфейс PaymentSystem
с методами transferMoney, withdrawMoney и checkBalance.
Реализуйте классы BankAccount и ElectronicWallet,
которые реализуют данный интерфейс. Убедитесь,
что каждый класс правильно выполняет каждую операцию.
 */
public interface PaymentSystem {
    void transferMoney(double amount);

    void withdrawMoney(double drawMoney);

    double checkBalance();
}

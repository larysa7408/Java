package homework.homework_27.ps1;

public class BankAccount implements PaymentSystem {
    private String title;
    private double balance;

    public BankAccount(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount > balance) return;
        System.out.println("Bank " + title + ". Translation" + amount);
        balance -= amount;

    }

    @Override
    public void withdrawMoney(double drawMoney) {
        if (drawMoney > balance) return;
        ;
        System.out.println("Bank " + title + ". Withdrawal from account");
        balance -= drawMoney;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}

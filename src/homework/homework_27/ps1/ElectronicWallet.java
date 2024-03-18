package homework.homework_27.ps1;

public class ElectronicWallet implements PaymentSystem {
    private String title;
    private double balance;

    public ElectronicWallet(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount > balance) return;
        System.out.println("ElectronicWallet " + title + ". Translation" + amount);
        balance -= amount;
    }

    @Override
    public void withdrawMoney(double drawMoney) {
        if (drawMoney > balance) return;
        ;
        System.out.println("ElectronicWallet " + title + ". Withdrawal from account");
        balance -= drawMoney;

    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}

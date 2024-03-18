package homework.homework_27.ps1;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #27
 *
 * @author Larysa Petrova
 * @version 18-Mar-24
 */
public class BankApple {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Privat24", 100000);
        ElectronicWallet electronicWallet = new ElectronicWallet("Wallet", 50000);

        System.out.println(bankAccount);
        bankAccount.withdrawMoney(50000);
        System.out.println(bankAccount);
        bankAccount.withdrawMoney(500);

        electronicWallet.transferMoney(1500);
        System.out.println(electronicWallet);

        bankAccount.checkBalance();
        System.out.println(bankAccount);
    }
}

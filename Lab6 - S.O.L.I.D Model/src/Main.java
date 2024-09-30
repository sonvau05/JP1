import Entity.CurrentAccount;
import Entity.SavingAccount;

public class Main {
    public static void main(String[] args) {
        double ibal = 1000.00;
        SavingAccount savingsAccount = new SavingAccount("SA001", ibal);
        System.out.println("Savings A/c: Initial Balance: $" + ibal);
        double damt = 500.00;
        savingsAccount.deposit(damt);
        double wamt = 250.00;
        savingsAccount.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
        System.out.println("\nCurrent A/c: Initial Balance: $" + ibal);
        currentAccount.deposit(1000.00);
        currentAccount.withdraw(3000.00);
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        currentAccount.withdraw(wamt);
    }
}


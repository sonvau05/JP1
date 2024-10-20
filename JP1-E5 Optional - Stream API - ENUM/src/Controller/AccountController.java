package Controller;

import Entity.Account;
import Entity.Invoice;
import java.util.ArrayList;
import java.util.List;

public class AccountController {
    public List<Account> getSufficientBalance(List<Account> accounts, List<Invoice> invoices) {
        List<Account> sufficientAccounts = new ArrayList<>();
        for (Account account : accounts) {
            for (Invoice invoice : invoices) {
                if (account.getCustomer().equals(invoice.getCustomer()) && account.getBalance() >= invoice.getAmountAfterDiscount()) {
                    sufficientAccounts.add(account);
                }
            }
        }
        return sufficientAccounts;
    }

    public List<Account> getInsufficientBalance(List<Account> accounts, List<Invoice> invoices) {
        List<Account> insufficientAccounts = new ArrayList<>();
        for (Account account : accounts) {
            for (Invoice invoice : invoices) {
                if (account.getCustomer().equals(invoice.getCustomer()) && account.getBalance() < invoice.getAmountAfterDiscount()) {
                    insufficientAccounts.add(account);
                }
            }
        }
        return insufficientAccounts;
    }
}

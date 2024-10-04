package Service;

import Entity.Account;
import Entity.Gender;
import Global.Global;

import java.util.Comparator;
import java.util.List;

public class AccountService {
    private List<Account> accounts;

    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account getAccountByCustomerCode(String code) {
        return accounts.stream()
                .filter(a -> a.getCustomer().getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public List<Account> getAccountByCustomerName(String keyword) {
        return accounts.stream()
                .filter(a -> Global.ignoreCase(keyword, a.getCustomer().getName()))
                .toList();
    }

    public List<Account> getAccountsByMaleWithBalanceGreaterThan(double balance) {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.M && a.getBalance() > balance)
                .toList();
    }

    public long countFemaleWithBalanceGreaterThan(double balance) {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.F && a.getBalance() > balance)
                .count();
    }

    public Account getAccountWithMaxBalanceForFemale() {
        return accounts.stream()
                .filter(a -> a.getCustomer().getGender() == Gender.F)
                .max(Comparator.comparingDouble(Account::getBalance))
                .orElse(null);
    }
}


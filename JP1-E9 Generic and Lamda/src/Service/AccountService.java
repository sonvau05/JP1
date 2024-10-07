package Service;

import Entity.Account;
import IGeneric.IGenaric;

import java.util.Comparator;
import java.util.List;

public class AccountService implements IGenaric<Account> {

    @Override
    public void update(Account account) {
    }

    @Override
    public void sort(List<Account> accounts) {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    @Override
    public Account findById(List<Account> accounts, int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account findByName(List<Account> accounts, String name) {
        return accounts.stream()
                .filter(account -> account.getCustomer().getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}






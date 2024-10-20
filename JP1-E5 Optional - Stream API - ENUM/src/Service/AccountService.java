package Service;

import Entity.Account;
import java.util.List;

public class AccountService {
    public List<Account> getAllAccounts(List<Account> accounts) {
        return accounts;
    }

    public Account getAccountById(List<Account> accounts, int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

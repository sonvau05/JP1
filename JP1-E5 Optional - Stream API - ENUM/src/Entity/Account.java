package Entity;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this;
    }

    public Account withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("Amount withdrawn exceeds the current balance!");
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}


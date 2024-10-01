package Entity;

public class Account {
    private String id;
    Customer customer;
    private double balance;

    public Account(String id, double balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}

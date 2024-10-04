package Entity;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String accountNumber;
    private double balance;
    private LocalDateTime createdAt;
    private Customer customer;

    public Account() {;}

    public Account(int id, Customer customer, LocalDateTime createdAt, double balance, String accountNumber) {
        this.id = id;
        this.customer = customer;
        this.createdAt = createdAt;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", createdAt=" + createdAt +
                ", customer=" + customer +
                '}';
    }
}



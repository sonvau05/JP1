package Entity;

import java.time.LocalDateTime;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    private LocalDateTime datetime;

    public Invoice(int id, Customer customer, double amount, LocalDateTime datetime) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.datetime = datetime;
    }

    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public double getAmount() { return amount; }
    public LocalDateTime getDateTime() { return datetime; }
    public void setDateTime(LocalDateTime datetime) { this.datetime = datetime; }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }
}


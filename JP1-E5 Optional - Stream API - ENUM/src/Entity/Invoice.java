package Entity;

import java.time.LocalDateTime;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    private LocalDateTime date;
    private double discountedAmount;

    public Invoice(int id, Customer customer, double amount, LocalDateTime date) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.date = date;
        this.discountedAmount = amount - (amount * customer.getDiscount() / 100);
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public double getAmountAfterDiscount() {
        return discountedAmount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void applyAdditionalDiscount(double additionalDiscount) {
        discountedAmount -= discountedAmount * additionalDiscount / 100;
    }

    @Override
    public String toString() {
        return String.format("Invoice[ID=%d, Customer=%s, Amount=%.2f, Date=%s]", id, customer.getName(), amount, date);
    }
}

package Service;

import Entity.Invoice;
import IGeneric.IGenaric;

import java.util.Comparator;
import java.util.List;

public class InvoiceService implements IGenaric<Invoice> {

    @Override
    public void update(Invoice invoice) {
    }

    @Override
    public void sort(List<Invoice> invoices) {
        invoices.sort(Comparator.comparing(Invoice::getAmount));
    }

    @Override
    public Invoice findById(List<Invoice> invoices, int id) {
        return invoices.stream()
                .filter(invoice -> invoice.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Invoice findByName(List<Invoice> invoices, String name) {
        return null;
    }
}






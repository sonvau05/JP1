package Service;

import Entity.Invoice;
import java.util.List;

public class InvoiceService {
    public List<Invoice> getAllInvoices(List<Invoice> invoices) {
        return invoices;
    }

    public Invoice getInvoiceById(List<Invoice> invoices, int id) {
        return invoices.stream()
                .filter(invoice -> invoice.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public double getAmountAfterDiscount(List<Invoice> invoices, int invoiceId) {
        Invoice invoice = getInvoiceById(invoices, invoiceId);
        return invoice != null ? invoice.getAmountAfterDiscount() : 0;
    }
}

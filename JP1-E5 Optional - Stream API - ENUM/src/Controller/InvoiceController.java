package Controller;

import Entity.Invoice;
import Entity.Customer;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class InvoiceController {
    public List<Invoice> applyDiscountForWomen(List<Invoice> invoices) {
        List<Invoice> discountedInvoices = new ArrayList<>();
        for (Invoice invoice : invoices) {
            Customer customer = invoice.getCustomer();
            if (customer.getGender() == Entity.Gender.F && invoice.getDate().getMonth() == Month.AUGUST) {
                invoice.applyAdditionalDiscount(10);
                discountedInvoices.add(invoice);
            }
        }
        return discountedInvoices;
    }
}


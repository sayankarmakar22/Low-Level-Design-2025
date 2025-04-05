package SRP.GoodCode;

public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("saving the invoice worth of " + invoice.amount);
    }
}

package SRP.BadCode;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.amount = 100;
        invoice.printInvoice();
        invoice.saveInvoice();
        invoice.calculateTotal();
    }
}

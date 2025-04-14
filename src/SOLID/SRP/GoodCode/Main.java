package SOLID.SRP.GoodCode;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        InvoicePrint invoicePrint = new InvoicePrint();
        InvoiceRepository invoiceRepository = new InvoiceRepository();
        SendNotification sendInvoiceNotification = new SendNotification();
        invoice.amount = 1235;
        invoice.phn_no = 987654321;

        invoice.getInvoice();

        invoicePrint.print(invoice);

        invoiceRepository.save(invoice);

        sendInvoiceNotification.notify(invoice);


    }
}

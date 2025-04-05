package SRP.BadCode;



public class Invoice {

    public int amount;

    public void printInvoice(){
        System.out.println("printing the invoice");
    }
    public void saveInvoice(){
        System.out.println("saving the invoice in the database");
    }
    public void calculateTotal(){
        System.out.println("total = " + amount);

    }

}

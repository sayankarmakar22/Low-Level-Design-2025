package SOLID.ISP;

public class SimplerPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("printing the document");
    }
}

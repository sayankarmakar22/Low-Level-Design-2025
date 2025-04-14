package SOLID.ISP;

public class MultiPurposePrinter implements Printer,Scanner,Copier{
    @Override
    public void copy() {
        System.out.println("Copy MultiPurposePrinter");
    }

    @Override
    public void print() {
        System.out.println("Print MultiPurposePrinter");
    }

    @Override
    public void scanner() {
        System.out.println("Scanner MultiPurposePrinter");
    }
}

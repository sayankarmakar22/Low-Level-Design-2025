package ISP;

public class Main {
    public static void main(String[] args) {
        SimplerPrinter printer = new SimplerPrinter();
        printer.print();

        MultiPurposePrinter printer2 = new MultiPurposePrinter();
        printer2.print();
        printer2.copy();
        printer2.scanner();
    }
}

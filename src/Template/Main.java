package Template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making tea..............");
        Beverage tea = new Tea();
        tea.prepare();
        System.out.println();
        System.out.println("Making coffee..............\n");
        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}

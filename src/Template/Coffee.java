package Template;

public class Coffee extends Beverage{
    @Override
    void brew() {
        System.out.println("brewing coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("add coffee condiments");
    }
}

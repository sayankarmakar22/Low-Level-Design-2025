package Template;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("brewing tea ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding condiments for tea ...");
    }
}

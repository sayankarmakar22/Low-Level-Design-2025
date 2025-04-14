package Decorator;

public class ExtraCheese extends BasePizza{
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    int cost() {
        return this.basePizza.cost() + 50;
    }
}

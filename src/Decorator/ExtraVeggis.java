package Decorator;

public class ExtraVeggis extends PizzaToppings{
    private BasePizza basePizza;

    public ExtraVeggis(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    int cost() {
        return this.basePizza.cost() + 70;
    }
}

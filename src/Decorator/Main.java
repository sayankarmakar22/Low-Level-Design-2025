package Decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new VegDelightPizza();
        System.out.println("prize of veg delight pizza : " + pizza.cost());
        System.out.println("added extra cheese ");
        pizza = new ExtraCheese(pizza);
        System.out.println("prize of veg delight pizza after adding extra cheese: " + pizza.cost());

        System.out.println("added extra veggis ");
        pizza = new ExtraVeggis(pizza);
        System.out.println("prize of veg delight pizza after adding extra veggis: " + pizza.cost());
    }
}

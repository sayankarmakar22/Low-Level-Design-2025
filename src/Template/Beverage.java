package Template;

public abstract class Beverage {
    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling Water...");
    }
    private void pourInCup(){
        System.out.println("Pouring into Cup...");
    }
}

package AbstractFactory;

public class Main {
    public static void main(String args[]){
        SelectionCarsFactory factory = new SelectionCarsFactory();

        PremiumCars landRover = factory.createPremiumCars();
        BasicCars nexon = factory.createBasicCars();

        System.out.println(landRover);
        System.out.println(nexon);

    }
}

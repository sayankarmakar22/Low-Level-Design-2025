package AbstractFactory;

public class SelectionCarsFactory implements TataCarFactory{
    @Override
    public PremiumCars createPremiumCars() {
        return new LandRover();
    }

    @Override
    public BasicCars createBasicCars() {
        return new Nexon();
    }
}

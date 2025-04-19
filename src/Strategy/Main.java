package Strategy;

import Strategy.Strategy.NormalDrive;
import Strategy.Strategy.SportsDrive;

public class Main {
    public static void main(String[] args) {
        Vehicle sports = new SportsVehicle(new NormalDrive());
        sports.execute();
        Vehicle goods = new GoodsVehicle(new SportsDrive());
        goods.execute();
        Vehicle passenger = new PassengersVehicle(new NormalDrive());
        passenger.execute();
    }
}

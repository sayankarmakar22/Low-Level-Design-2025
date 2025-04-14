package Factory;

public class Main {
    public static void main(String[] args) {
        TataNexon tataEv = TataFactory.getTataNexonCars("EV","premium","alloy wheels");
        System.out.println(tataEv);
        tataEv.power("Charging Socket");

        TataNexon tataPetrol = TataFactory.getTataNexonCars("Petrol/Diesel","premium","alloy wheels");
        System.out.println(tataPetrol);
        tataPetrol.power("petrol");

        TataNexon tataCng = TataFactory.getTataNexonCars("cng","premium","alloy wheels");
        System.out.println(tataCng);
        tataCng.power("cng");


    }
}

package Factory;

public class TataFactory {
    private TataFactory(){}

    public static TataNexon getTataNexonCars(String core, String seatType, String wheels){
        switch(core){
            case "EV":
                return new TataNexonEv(core, seatType, wheels);
            case "Petrol/Diesel":
                return new TataNexonPetrolDiesel(core, seatType, wheels);
            case "cng":
                return new TataNexonCNG(core, seatType, wheels);
            default:
                throw new IllegalArgumentException("Invalid Tata Nexon");
        }
    }
}

package Factory;

public class TataNexonPetrolDiesel extends TataNexon{
    public TataNexonPetrolDiesel(String core, String seatType, String wheels) {
        super(core, seatType, wheels);
    }

    @Override
    public void power(String power) {
        System.out.println("Your tata nexon has powered by petrol or diesel");
    }
}

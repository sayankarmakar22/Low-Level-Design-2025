package Factory;

public class TataNexonCNG extends TataNexon{

    public TataNexonCNG(String core, String seatType, String wheels) {
        super(core, seatType, wheels);
    }

    @Override
    public void power(String power) {
        System.out.println("your tata nexon has powered by cng");
    }
}

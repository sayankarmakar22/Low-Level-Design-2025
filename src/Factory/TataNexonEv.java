package Factory;

public class TataNexonEv extends TataNexon{

    public TataNexonEv(String core, String seatType, String wheels) {
        super(core, seatType, wheels);
    }

    @Override
    public void power(String power) {
        System.out.println("your tata nexon has powered by electric");
    }
}

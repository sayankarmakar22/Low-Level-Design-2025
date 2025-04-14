package Factory;

public abstract class TataNexon {
    private String core;
    private String seatType;
    private String wheels;

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public TataNexon(String core, String seatType, String wheels) {
        this.core = core;
        this.seatType = seatType;
        this.wheels = wheels;
    }
    public abstract void power(String power);
}

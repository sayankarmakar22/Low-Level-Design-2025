package Adapter;

public class HospitalCopyOfInsurance {
    private String h_name;
    private String h_add;
    private String p_name;
    private double cost;

    public HospitalCopyOfInsurance(String h_name, String h_add, String p_name, double cost) {
        this.h_name = h_name;
        this.h_add = h_add;
        this.p_name = p_name;
        this.cost = cost;
    }

    public String getH_name() {
        return h_name;
    }

    public String getH_add() {
        return h_add;
    }

    public String getP_name() {
        return p_name;
    }

    public double getCost() {
        return cost;
    }
}

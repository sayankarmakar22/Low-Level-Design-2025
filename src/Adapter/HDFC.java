package Adapter;

public class HDFC implements InsuranceRules{
    private String hospital_name;
    private String hospital_add;
    private String patient_name;
    private double total_cost;

    public HDFC(String hospital_name, String hospital_add, String patient_name, double total_cost) {
        this.hospital_name = hospital_name;
        this.hospital_add = hospital_add;
        this.patient_name = patient_name;
        this.total_cost = total_cost;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public String getHospital_add() {
        return hospital_add;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public double getTotal_cost() {
        return total_cost;
    }

    @Override
    public void claim() {
        System.out.println("your claim has been approved");
    }

    @Override
    public void reject() {
        System.out.println("your claim has rejected due to insufficient information");
    }
}

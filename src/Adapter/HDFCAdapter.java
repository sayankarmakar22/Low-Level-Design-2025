package Adapter;

public class HDFCAdapter {
    private HDFC hdfc;
    private HospitalCopyOfInsurance hospitalCopyOfInsurance;

    public HDFCAdapter(HospitalCopyOfInsurance hospitalCopyOfInsurance){
        this.hospitalCopyOfInsurance = hospitalCopyOfInsurance;
    }

    public HDFC doMapWithHDFC(){
        hdfc = new HDFC(
                hospitalCopyOfInsurance.getH_name(),
                hospitalCopyOfInsurance.getH_add(),
                hospitalCopyOfInsurance.getP_name(),
                hospitalCopyOfInsurance.getCost());
        System.out.println("mapped successfully");
        return hdfc;
    }
}

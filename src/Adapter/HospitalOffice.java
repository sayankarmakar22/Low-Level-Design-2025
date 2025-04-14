package Adapter;

public class HospitalOffice {
    public static HDFC convertToProperForm(HospitalCopyOfInsurance hospitalCopyOfInsurance){
        HDFCAdapter hdfcAdapter = new HDFCAdapter(hospitalCopyOfInsurance);
        HDFC mapWithHDFC = hdfcAdapter.doMapWithHDFC();
        return mapWithHDFC;

    }
}

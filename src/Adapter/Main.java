package Adapter;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HospitalCopyOfInsurance patient1 = new HospitalCopyOfInsurance("ruby","kolkata","ram",5000);
        HDFC properForm = HospitalOffice.convertToProperForm(patient1);
        System.out.println("patient name : " + properForm.getPatient_name());
    }
}

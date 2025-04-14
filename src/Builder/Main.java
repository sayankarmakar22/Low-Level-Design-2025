package Builder;

public class Main {
    public static void main(String[] args) {
        Employee sayan = new Employee.EmployeeBuilder()
                .setId(1)
                .setName("sayan karmakar")
                .setAge(24)
                .setSalary(25000)
                .setDept("HR")
                .setDependent(3)
                .build();
        sayan.showEmpDetails();
    }
}

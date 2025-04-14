package Builder;

public class Employee {
    private final int id;
    private final String name;
    private final int age;
    private final int salary;
    private final int dependent;
    private final String dept;

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getDependent() {
        return dependent;
    }
    private Employee(EmployeeBuilder employeeBuilder){
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.salary = employeeBuilder.salary;
        this.dependent = employeeBuilder.dependent;
        this.dept = employeeBuilder.dept;
    }
    public void showEmpDetails(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Dept: " + this.dept);
        System.out.println("Dependent: " + this.dependent);
    }

    public static class EmployeeBuilder {
        private int id;
        private String name;
        private int age;
        private int salary;
        private int dependent;
        private String dept;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setDependent(int dependent) {
            this.dependent = dependent;
            return this;
        }
        public EmployeeBuilder setDept(String dept) {
            this.dept = dept;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }
}


public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private String designation;
    private String email;
    private double basicsalary;
    private int overtimehours;

    public Employee(int employeeId, String name, String department,
            String designation, String email, double basicsalary, int overtimehours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.basicsalary = basicsalary;
        this.overtimehours = overtimehours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public double getbasicsalary() {
        return basicsalary;
    }

    public int getovertimehours() {
        return overtimehours;
    }

    public void displayEmployee() {
        System.out.println("------------------------------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Email       : " + email);
        System.out.println("Basic salary : " + basicsalary);
        System.out.println("OvertimeHours : " + overtimehours);
    }

    public boolean belongsToDepartment(String department) {
        return this.department.equalsIgnoreCase(department);
    }

    
public double calculateHra() {
    return basicsalary * 0.20;
}


public double calculateDa() {
    return basicsalary * 0.10;
}


public double calculateOvertimePay() {
    return overtimehours * 250;
}


public double calculateGrossSalary() {
    return basicsalary + calculateHra() + calculateDa() + calculateOvertimePay();
}


public double calculateTax() {

    double grossSalary = calculateGrossSalary();

    if (grossSalary > 50000) {
        return grossSalary * 0.05;
    } else {
        return grossSalary * 0.02;
    }
}


public double calculateNetSalary() {
    return calculateGrossSalary() - calculateTax();
}


public void displaySalarySlip() {

    System.out.println("\n................................");
    System.out.println("        EMPLOYEE SALARY SLIP");
    System.out.println("..................................");
    System.out.println("Employee ID     : " + employeeId);
    System.out.println("Employee Name   : " + name);
    System.out.println("----------------------------------");
    System.out.println("Basic Salary    : " + basicsalary);
    System.out.println("HRA (20%)       : " + calculateHra());
    System.out.println("DA (10%)        : " + calculateDa());
    System.out.println("Overtime Pay    : " + calculateOvertimePay());
    System.out.println("----------------------------------");
    System.out.println("Gross Salary    : " + calculateGrossSalary());
    System.out.println("Tax             : " + calculateTax());
    System.out.println("Net Salary      : " + calculateNetSalary());
    System.out.println("...................................");
}

}

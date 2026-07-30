public class SalaryCalculator {

    public double calculateHra(Employee emp) {
        return emp.getbasicsalary() * 0.20;
    }

    public double calculateDa(Employee emp) {
        return emp.getbasicsalary() * 0.10;
    }

    public double calculateOvertimePay(Employee emp) {
        return emp.getovertimehours() * 250;
    }

    public double calculateGrossSalary(Employee emp) {
        return emp.getbasicsalary()
                + calculateHra(emp)
                + calculateDa(emp)
                + calculateOvertimePay(emp);
    }

    public double calculateTax(Employee emp) {
        double gross = calculateGrossSalary(emp);

        if (gross > 50000)
            return gross * 0.05;
        else
            return gross * 0.02;
    }

    public double calculateNetSalary(Employee emp) {
        return calculateGrossSalary(emp) - calculateTax(emp);
    }

    public void displaySalarySlip(Employee emp) {

        System.out.println(".....................................");
        System.out.println("    Employee Salary calculation ");
        System.out.println(".....................................");
        System.out.println("Employee ID : " + emp.getEmployeeId());
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Basic Salary : " + emp.getbasicsalary());
        System.out.println("HRA : " + calculateHra(emp));
        System.out.println("DA : " + calculateDa(emp));
        System.out.println("Overtime : " + calculateOvertimePay(emp));
        System.out.println("Gross Salary : " + calculateGrossSalary(emp));
        System.out.println("Tax : " + calculateTax(emp));
        System.out.println("Net Salary : " + calculateNetSalary(emp));
    }
}


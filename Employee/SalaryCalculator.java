public class SalaryCalculator {

    public double calculateHra(Employee emp) {
        if (emp == null) return 0.0;
        return emp.getBasicSalary() * 0.20;
    }

    public double calculateDa(Employee emp) {
        if (emp == null) return 0.0;
        return emp.getBasicSalary() * 0.10;
    }

    public double calculateOvertimePay(Employee emp) {
        if (emp == null) return 0.0;
        return emp.getOvertimeHours() * 250;
    }

    public double calculateGrossSalary(Employee emp) {
        if (emp == null) return 0.0;
        return emp.getBasicSalary() + calculateHra(emp) + calculateDa(emp) + calculateOvertimePay(emp);
    }

    public double calculateTax(Employee emp) {
        if (emp == null) return 0.0;
        double gross = calculateGrossSalary(emp);

        if (gross > 50000) {
            return gross * 0.05;
        } else {
            return gross * 0.02;
        }
    }

    public double calculateNetSalary(Employee emp) {
        if (emp == null) return 0.0;
        return calculateGrossSalary(emp) - calculateTax(emp);
    }

    public void displaySalarySlip(Employee emp) {
        if (emp == null) {
            System.out.println("Employee data not available.");
            return;
        }

        System.out.println("\n.....................................");
        System.out.println("     EMPLOYEE SALARY CALCULATION     ");
        System.out.println(".....................................");
        System.out.println("Employee ID   : " + emp.getEmployeeId());
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Basic Salary  : " + emp.getBasicSalary());
        System.out.println("HRA           : " + calculateHra(emp));
        System.out.println("DA            : " + calculateDa(emp));
        System.out.println("Overtime Pay  : " + calculateOvertimePay(emp));
        System.out.println("-------------------------------------");
        System.out.println("Gross Salary  : " + calculateGrossSalary(emp));
        System.out.println("Tax           : " + calculateTax(emp));
        System.out.println("Net Salary    : " + calculateNetSalary(emp));
        System.out.println("=====================================");
    }
}
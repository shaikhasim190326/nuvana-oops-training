
import java.util.ArrayList;

public class EmployeeDirectory {

    private ArrayList<Employee> employees = new ArrayList<>();
    private double basicsalary;

    public void addEmployee(Employee employee) {

        if (!Validation.isUniqueEmployeeId(employees, employee.getEmployeeId())) {
            System.out.println("Duplicate Employee ID : " + employee.getEmployeeId());
            return;
        }

        if (!Validation.isEmailUnique(employees, employee.getEmail())) {
            System.out.println("Invalid Email : " + employee.getEmail());
            return;
        }

        employees.add(employee);
    }

    public void displayAllEmployees() {

        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    public void displayDepartmentWise(String department) {

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.belongsToDepartment(department)) {

                emp.displayEmployee();
                found = true;
            }

        }

        if (!found) {
            System.out.println("No Employee Found");
        }

    }

    public void searchById(int id) {

        for (Employee emp : employees) {

            if (emp.getEmployeeId() == id) {

                emp.displayEmployee();
                return;
            }

        }

        System.out.println("Employee Not Found");
    }

    public void searchByPartialName(String name) {

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.getName().toLowerCase().contains(name.toLowerCase())) {

                emp.displayEmployee();
                found = true;
            }
        }

        
        if (!found) {
            System.out.println("Employee Not Found");
        }

    }

    public Employee searchEmployeeObject(int id) {

    for (Employee emp : employees) {

        if (emp.getEmployeeId() == id) {
            return emp;
        }

    }

    return null;
}

    public double calculateHRA() {
        return basicsalary * 0.20;

    }

    public double calculateDA() {
        return basicsalary * 0.10;
    }

    public double calculateOverTime() {
        return basicsalary * 250;
    }

    public double calculateGrossSalary() {
        return basicsalary + calculateHRA() + calculateDA() + calculateOverTime();
    }

    public double calculateTax() {
        double gross = calculateGrossSalary();

        if (gross > 50000) {
            return gross * 0.05;
        } else {
            return gross * 0.02;
        }
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateTax();
    }

    public void Displaysalaryslip() {

    }
}





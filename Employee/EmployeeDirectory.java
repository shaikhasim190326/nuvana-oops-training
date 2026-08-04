import java.util.ArrayList;

public class EmployeeDirectory {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (!Validation.isUniqueEmployeeId(employees, employee.getEmployeeId())) {
            System.out.println("Error: Duplicate Employee ID -> " + employee.getEmployeeId());
            return;
        }

        if (!Validation.isEmailValidAndUnique(employees, employee.getEmail())) {
            System.out.println("Error: Invalid or Duplicate Email -> " + employee.getEmail());
            return;
        }

        employees.add(employee);
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in directory.");
            return;
        }
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
            System.out.println("No Employee Found in department: " + department);
        }
    }

    public void searchById(int id) {
        Employee emp = searchEmployeeObject(id);
        if (emp != null) {
            emp.displayEmployee();
        } else {
            System.out.println("Employee Not Found");
        }
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
            System.out.println("Employee Not Found with name matching: " + name);
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
}
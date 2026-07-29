
public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private String designation;
    private String email;

    public Employee(int employeeId, String name, String department,
            String designation, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.email = email;
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

    public void displayEmployee() {
        System.out.println("------------------------------");
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Email       : " + email);
    }

    public boolean belongsToDepartment(String department) {
        return this.department.equalsIgnoreCase(department);
    }
}

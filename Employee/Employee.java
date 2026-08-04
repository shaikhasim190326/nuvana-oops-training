public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private String designation;
    private String email;
    private double basicSalary;
    private int overtimeHours;
    private double currentSalary;
    private int qualityScore;
    private int attendanceScore;
    private int teamworkScore;

    
    public Employee(int employeeId, String name, String department, String designation, 
                    String email, double basicSalary, int overtimeHours, 
                    double currentSalary, int qualityScore, int attendanceScore, int teamworkScore) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
        this.currentSalary = currentSalary;
        this.qualityScore = qualityScore;
        this.attendanceScore = attendanceScore;
        this.teamworkScore = teamworkScore;
    }

    // --- Getters ---
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public int getQualityScore() {
        return qualityScore;
    }

    public int getAttendanceScore() {
        return attendanceScore;
    }

    public int getTeamworkScore() {
        return teamworkScore;
    }

    // --- Required Methods ---
    public void displayEmployee() {
        System.out.println("------------------------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Designation   : " + designation);
        System.out.println("Email         : " + email);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
    }

    public boolean belongsToDepartment(String department) {
        return this.department != null && this.department.equalsIgnoreCase(department);
    }
}
package Asim.Inheritance;

public class Employee {

    int id;
    String name;
    String basicSalary;

    public Employee(int id, String name, String basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;

    }

        void displayDetails() {
            
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
    }

}
package Asim.Worker;

public class EmployeeService {

    public void ShowDetails(Employee em) {

        System.out.println("Employee ID: " + em.getempId());

        System.out.println("Employee Name: " + em.getempName());

        System.out.println("Employee Mob Number: " + em.getMob());

        System.out.println("Employee Sallery: " + em.getSallery());

    }

}

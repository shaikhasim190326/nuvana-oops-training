package Asim.Worker;

import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        System.out.print("Enter Employee Id : ");

        int empId = sc.nextInt();

        em.setEmpid(empId);

        sc.nextLine();

        System.out.print("Enter Empolyee  Name:  ");

        String empname = sc.nextLine();

        em.setempName(empname);


        System.out.print("Enter Mob Number: ");

        long mob =sc.nextLong();

        em.setMob(mob);

        sc.nextLine();


        System.out.print("Enter Sallery: ");

        double  sallery = sc.nextDouble();

        em.setSallery(sallery);

        System.out.println();
        System.out.println("-=*=*EMPLOYEE DETAILS*=*=-\n");


        EmployeeService  service=new EmployeeService();

        service.ShowDetails(em);









    }

}

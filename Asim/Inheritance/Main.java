package Asim.Inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Basic Salary: ");
        String basicSalary = scanner.nextLine();

        System.out.print("Enter Manager ID: ");
        int managerId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Manager Name: ");
        String managerName = scanner.nextLine();

        System.out.print("Enter Manager Basic Salary: ");
        String managerBasicSalary = scanner.nextLine();

        System.out.print("Enter Team Size for Manager: ");
        int teamSize = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Developer ID: ");
        int developerId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Developer Name: ");
        String developerName = scanner.nextLine();
        System.out.print("Enter Developer Basic Salary: ");
        String developerBasicSalary = scanner.nextLine();

        System.out.print("Enter Programming Language for Developer: ");
        String programmingLanguage = scanner.nextLine();

        System.out.print("Enter Tester ID: ");
        int testerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Tester Name: ");
        String testerName = scanner.nextLine();

        System.out.print("Enter Tester Basic Salary: ");
        String testerBasicSalary = scanner.nextLine();

        System.out.print("Enter Testing Tool for Tester: ");
        String testingTool = scanner.nextLine();


        Employee employee = new Employee(id, name, basicSalary);
        Manager manager = new Manager(managerId, managerName, managerBasicSalary, teamSize);
        Developer developer = new Developer(developerId, developerName, developerBasicSalary, programmingLanguage);
        Tester tester = new Tester(testerId, testerName, testerBasicSalary, testingTool);

        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        System.out.println("\nManager Details:");
        manager.displayDetails();
        manager.conductMeeting();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        developer.developApplication();

        System.out.println("\nTester Details:");
        tester.displayDetails();
        tester.testApplication();

        scanner.close();

    }

}

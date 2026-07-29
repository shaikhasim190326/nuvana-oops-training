import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(101, "Shabaz", "IT", "Java Developer", "shabaz@gmail.com"));
        directory.addEmployee(new Employee(102, "Ali", "HR", "HR Executive", "ali@gmail.com"));
        directory.addEmployee(new Employee(103, "Arkam", "IT", "Software Engineer", "arkam@gmail.com"));
        directory.addEmployee(new Employee(104, "Raheem", "IT", "Java Developer", "raheem@gmail.com"));
        directory.addEmployee(new Employee(105, "Aman", "HR", "Recruiter", "aman@gmail.com"));

        int choice;

        do {

            System.out.println("\n========== Employee Directory ==========");
            System.out.println("1. Display All Employees");
            System.out.println("2. Display Department Wise");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Search Employee By Name");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    directory.displayAllEmployees();
                    break;

                case 2:
                    System.out.print("Enter Department : ");
                    String dept = sc.nextLine();
                    directory.displayDepartmentWise(dept);
                    break;

                case 3:
                    System.out.print("Enter Employee ID : ");
                    int id = sc.nextInt();
                    directory.searchById(id);
                    break;

                case 4:
                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();
                    directory.searchByPartialName(name);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}
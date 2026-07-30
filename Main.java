
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDirectory directory = new EmployeeDirectory();
        SalaryCalculator calculator = new SalaryCalculator();
        
        directory.addEmployee(new Employee(101, "Shabaz","IT","Java developer","shabaz@gmail.com", 50000.6,4));
        directory.addEmployee(new Employee(102, "Ali","IT","HR exclusive","ali@gmail.com", 64000.6,5));
        directory.addEmployee(new Employee(103, "Arkam","IT","HR exclusive","arkam@gmail.com", 30000.6,8));
        directory.addEmployee(new Employee(104, "Raheem","IT","Java developer","raheem@gmail.com", 45000.6,3));
        directory.addEmployee(new Employee(105, "Asfan","IT","Java developer","asfan@gmail.com", 40000.6,2));

        int choice;

        do {

            System.out.println("\n========== Employee Directory ==========");
            System.out.println("1. Display All Employees");
            System.out.println("2. Display Department Wise");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Search Employee By Name");
            System.out.println("5. Display salary slip ");
            System.out.println("6. Exit");
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
                    System.out.print("Enter Employee ID : ");
                    int salaryId = sc.nextInt();

                Employee emp = directory.searchEmployeeObject(salaryId);

                if (emp != null) {
                calculator.displaySalarySlip(emp);
                } else {
                System.out.println("Employee Not Found");
                }

                    case 6:
                    System.out.println("   Thank You  ");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}

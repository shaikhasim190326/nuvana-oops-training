import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDirectory directory = new EmployeeDirectory();
        SalaryCalculator calculator = new SalaryCalculator();
        EmployeePerformance performance = new EmployeePerformance();

        directory.addEmployee(new Employee(101, "Shabaz", "IT", "Java Developer", "shabaz@gmail.com", 50000.0, 4, 50000.0, 85, 90, 88));
        directory.addEmployee(new Employee(102, "Ali", "HR", "HR Executive", "ali@gmail.com", 64000.0, 5, 64000.0, 75, 80, 70));
        directory.addEmployee(new Employee(103, "Arkam", "HR", "HR Executive", "arkam@gmail.com", 30000.0, 8, 30000.0, 60, 65, 55));
        directory.addEmployee(new Employee(104, "Raheem", "IT", "Java Developer", "raheem@gmail.com", 45000.0, 3, 45000.0, 95, 95, 90));
        directory.addEmployee(new Employee(105, "Asfan", "Finance", "Accountant", "asfan@gmail.com", 40000.0, 2, 40000.0, 50, 60, 40));

        int choice;

        do {
            System.out.println("\n========== Employee Directory ==========");
            System.out.println("1. Display All Employees");
            System.out.println("2. Display Department Wise");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Search Employee By Name");
            System.out.println("5. Display Salary Slip");
            System.out.println("6. Display Performance Report");
            System.out.println("7. Exit");
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

                    Employee empSalary = directory.searchEmployeeObject(salaryId);
                    if (empSalary != null) {
                        calculator.displaySalarySlip(empSalary);
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 6:
                    System.out.print("Enter Employee ID : ");
                    int perfId = sc.nextInt();

                    Employee empPerf = directory.searchEmployeeObject(perfId);
                    if (empPerf != null) {
                        performance.displayPerformance(empPerf);
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 7:
                    System.out.println("   Thank You!   ");
                    break;

                default:
                    System.out.println("Invalid Choice! Please enter between 1-7.");
            }

        } while (choice != 7);

        sc.close();
    }
}
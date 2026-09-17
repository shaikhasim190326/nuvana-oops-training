package Asim.EmployeesDetails;

import java.util.Scanner;

public class EmployeesMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeesRepository er =
                new EmployeesRepository();

        while (true) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("     EMPLOYEE MANAGEMENT");
            System.out.println("==============================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // =========================
                // ADD EMPLOYEE
                // =========================

                case 1:

                    System.out.println();
                    System.out.println("Enter Employee Details");

                    System.out.print(
                            "Enter Employee Name: "
                    );

                    String name =
                            sc.nextLine();

                    System.out.print(
                            "Enter Employee Department: "
                    );

                    String department =
                            sc.nextLine();

                    System.out.print(
                            "Enter Employee Salary: "
                    );

                    String salary =
                            sc.nextLine();

                    Employees employee =
                            new Employees(
                                    name,
                                    department,
                                    salary
                            );

                    er.saveEmployee(employee);

                    System.out.println(
                            "Employee added successfully."
                    );

                    break;

                // =========================
                // VIEW EMPLOYEES
                // =========================

                case 2:

                    er.displayAllEmployees();

                    break;

                // =========================
                // UPDATE EMPLOYEE
                // =========================

                case 3:

                    System.out.print(
                            "\nEnter Employee ID to update: "
                    );

                    int updateId =
                            sc.nextInt();

                    sc.nextLine();

                    Employees existingEmployee =
                            er.getEmployeeById(updateId);

                    if (existingEmployee == null) {

                        System.out.println(
                                "Employee ID not found."
                        );

                    } else {

                        System.out.println(
                                "\nCurrent Employee Details:"
                        );

                        System.out.println(
                                "Name: "
                                + existingEmployee.getName()
                        );

                        System.out.println(
                                "Department: "
                                + existingEmployee.getDepartment()
                        );

                        System.out.println(
                                "Salary: "
                                + existingEmployee.getSalary()
                        );

                        System.out.println(
                                "\nEnter New Details:"
                        );

                        System.out.print(
                                "Enter New Name: "
                        );

                        String newName =
                                sc.nextLine();

                        System.out.print(
                                "Enter New Department: "
                        );

                        String newDepartment =
                                sc.nextLine();

                        System.out.print(
                                "Enter New Salary: "
                        );

                        String newSalary =
                                sc.nextLine();

                        Employees updatedEmployee =
                                new Employees(
                                        newName,
                                        newDepartment,
                                        newSalary
                                );

                        er.updateEmployee(
                                updateId,
                                updatedEmployee
                        );
                    }

                    break;

                // =========================
                // DELETE EMPLOYEE
                // =========================

                case 4:

                    System.out.print(
                            "\nEnter Employee ID to delete: "
                    );

                    int deleteId =
                            sc.nextInt();

                    sc.nextLine();

                    Employees employeeToDelete =
                            er.getEmployeeById(deleteId);

                    if (employeeToDelete == null) {

                        System.out.println(
                                "Employee ID not found."
                        );

                    } else {

                        System.out.println(
                                "\nEmployee Found:"
                        );

                        System.out.println(
                                "Name: "
                                + employeeToDelete.getName()
                        );

                        System.out.println(
                                "Department: "
                                + employeeToDelete.getDepartment()
                        );

                        System.out.println(
                                "Salary: "
                                + employeeToDelete.getSalary()
                        );

                        System.out.print(
                                "\nAre you sure you want to delete? (yes/no): "
                        );

                        String confirm =
                                sc.nextLine();

                        if (confirm.equalsIgnoreCase("yes")) {

                            er.deleteEmployee(deleteId);

                        } else {

                            System.out.println(
                                    "Delete cancelled."
                            );
                        }
                    }

                    break;

                // =========================
                // EXIT
                // =========================

                case 5:

                    System.out.println(
                            "Program exited."
                    );

                    sc.close();

                    return;

                default:

                    System.out.println(
                            "Invalid choice. Please enter 1-5."
                    );
            }
        }
    }
}
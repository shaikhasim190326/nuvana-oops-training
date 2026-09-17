package Asim.EmployeesDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class EmployeesRepository {

    private static final String connectionString =
            "jdbc:sqlite:employees.db";

    // Create Table
    public EmployeesRepository() {

        String query =
                "CREATE TABLE IF NOT EXISTS employees (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT, " +
                "department TEXT, " +
                "Salary REAL" +
                ")";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             Statement statement =
                     conn.createStatement()) {

            statement.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("======================");
        System.out.println("Employees saved in database");
        System.out.println("======================");
    }

    // Save Multiple Employees
    public void saveEmployees(List<Employees> employees) {

        for (Employees employee : employees) {
            saveEmployee(employee);
        }
    }

    // Save One Employee
    public void saveEmployee(Employees employee) {

        String query =
                "INSERT INTO employees (name, department, Salary) " +
                "VALUES (?, ?, ?)";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             PreparedStatement statement =
                     conn.prepareStatement(query)) {

            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDepartment());
            statement.setString(3, employee.getSalary());

            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get All Employees
    public List<Employees> getAllEmployees() {

        List<Employees> employees = new ArrayList<>();

        String query =
                "SELECT * FROM employees ORDER BY ID";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             Statement statement =
                     conn.createStatement();
             ResultSet resultSet =
                     statement.executeQuery(query)) {

            while (resultSet.next()) {

                String name =
                        resultSet.getString("name");

                String department =
                        resultSet.getString("department");

                String salary =
                        resultSet.getString("Salary");

                Employees employee =
                        new Employees(
                                name,
                                department,
                                salary
                        );

                employees.add(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }

    // Get Employee By Database ID
    public Employees getEmployeeById(int id) {

        String query =
                "SELECT * FROM employees WHERE ID = ?";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             PreparedStatement statement =
                     conn.prepareStatement(query)) {

            statement.setInt(1, id);

            ResultSet resultSet =
                    statement.executeQuery();

            if (resultSet.next()) {

                String name =
                        resultSet.getString("name");

                String department =
                        resultSet.getString("department");

                String salary =
                        resultSet.getString("Salary");

                return new Employees(
                        name,
                        department,
                        salary
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // Update Employee
    public void updateEmployee(int id, Employees employee) {

        String query =
                "UPDATE employees " +
                "SET name = ?, department = ?, Salary = ? " +
                "WHERE ID = ?";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             PreparedStatement statement =
                     conn.prepareStatement(query)) {

            statement.setString(1, employee.getName());
            statement.setString(2, employee.getDepartment());
            statement.setString(3, employee.getSalary());
            statement.setInt(4, id);

            int rows =
                    statement.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Employee updated successfully."
                );

            } else {

                System.out.println(
                        "Employee ID not found."
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        String deleteQuery =
                "DELETE FROM employees WHERE ID = ?";

        try (Connection conn =
                     DriverManager.getConnection(connectionString)) {

            conn.setAutoCommit(false);

            try {

                // Step 1: Delete selected employee
                try (PreparedStatement statement =
                             conn.prepareStatement(deleteQuery)) {

                    statement.setInt(1, id);

                    int rows =
                            statement.executeUpdate();

                    if (rows == 0) {

                        System.out.println(
                                "Employee ID not found."
                        );

                        conn.rollback();
                        return;
                    }
                }

                /*
                 * Step 2:
                 * Temporary negative IDs.
                 *
                 * Isse primary key conflict nahi hoga.
                 */
                String temporaryQuery =
                        "UPDATE employees SET ID = -ID";

                try (Statement statement =
                             conn.createStatement()) {

                    statement.executeUpdate(temporaryQuery);
                }

                /*
                 * Step 3:
                 * Employees ko 1,2,3,4...
                 * me dobara number karna.
                 */
                String selectQuery =
                        "SELECT ID FROM employees ORDER BY ID DESC";

                try (Statement statement =
                             conn.createStatement();
                     ResultSet resultSet =
                             statement.executeQuery(selectQuery)) {

                    int newId = 1;

                    while (resultSet.next()) {

                        int oldId =
                                resultSet.getInt("ID");

                        String updateQuery =
                                "UPDATE employees " +
                                "SET ID = ? WHERE ID = ?";

                        try (PreparedStatement updateStatement =
                                     conn.prepareStatement(updateQuery)) {

                            updateStatement.setInt(1, newId);
                            updateStatement.setInt(2, oldId);

                            updateStatement.executeUpdate();
                        }

                        newId++;
                    }
                }

                conn.commit();

                System.out.println(
                        "Employee deleted successfully."
                );

                System.out.println(
                        "Employee IDs updated successfully."
                );

            } catch (Exception e) {

                conn.rollback();
                throw e;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display All Employees
    public void displayAllEmployees() {

        String query =
                "SELECT * FROM employees ORDER BY ID";

        try (Connection conn =
                     DriverManager.getConnection(connectionString);
             Statement statement =
                     conn.createStatement();
             ResultSet resultSet =
                     statement.executeQuery(query)) {

            boolean found = false;

            System.out.println(
                    "\n******** ALL EMPLOYEES ********"
            );

            while (resultSet.next()) {

                found = true;

                int id =
                        resultSet.getInt("ID");

                String name =
                        resultSet.getString("name");

                String department =
                        resultSet.getString("department");

                String salary =
                        resultSet.getString("Salary");

                System.out.println("------------------------------");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Department: " + department);
                System.out.println("Salary: " + salary);
            }

            if (!found) {
                System.out.println("No employees found.");
            }

            System.out.println("------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
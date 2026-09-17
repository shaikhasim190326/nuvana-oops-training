

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class StudentRepositry {

    private static String connectionString = "jdbc:sqlite:studentdb.db";

    public StudentRepositry() {
        String query = "CREATE TABLE IF NOT EXISTS students (" +
                "name TEXT," +
                "rollNumber TEXT," +
                "course TEXT," +
                "year INTEGER," +
                "city TEXT" +
                ")"; 
        try (Connection conn = DriverManager.getConnection(connectionString)) {
            conn.createStatement().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();        
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        String query = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(connectionString)) {
            ResultSet resultSet = conn.createStatement().executeQuery(query);

            for (int i = 0; resultSet.next(); i++) {
                String name = resultSet.getString("name");
                String rollNumber = resultSet.getString("rollNumber");
                String course = resultSet.getString("course");
                int year = resultSet.getInt("year");
                String city = resultSet.getString("city");
                Student student = new Student(name, rollNumber, course, year, city);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public void saveStudent(Student s) {
        String query = "INSERT INTO students (name, rollNumber, course, year, city) VALUES ('" +
                s.getName() + "', '" +
                s.getRollNumber() + "', '" +
                s.getCourse() + "', " +
                s.getYear() + ", '" +
                s.getCity() + "')";

        try (Connection conn = DriverManager.getConnection(connectionString)) {
            conn.createStatement().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Student is saved in database");
    }

    public void deleteStudent(Student s) {
        System.out.println("Student is deleted from database");
    }

    public void updateStudent(Student s) {
        System.out.println("Student is updated in database");

    }


     void displayStudentDetails(Student student) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Year: " + student.getYear());
            System.out.println("City: " + student.getCity());
        }    
}

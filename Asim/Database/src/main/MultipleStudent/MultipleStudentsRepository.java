package MultipleStudent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class MultipleStudentsRepository {

    private static String connectionString = "jdbc:sqlite:multiple_students.db";

    static {
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

    public void saveStudent(MultipleStudents s) {
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

    // Multiple Students ke liye sirf ye method add kiya hai
    public void saveStudents(List<MultipleStudents> students) {

        for (MultipleStudents s : students) {
            saveStudent(s);
        }

        System.out.println("Multiple students are saved in database");
    }

    public void deleteStudent(MultipleStudents s) {
        System.out.println("Student is deleted from database");
    }

    public void updateStudent(MultipleStudents s) {
        System.out.println("Student is updated in database");
    }

    void displayStudentDetails(MultipleStudents student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Year: " + student.getYear());
        System.out.println("City: " + student.getCity());
    }

    public List<MultipleStudents> getAllStudents() {

        List<MultipleStudents> students = new ArrayList<>();

        String query = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(connectionString)) {
            ResultSet resultSet = conn.createStatement().executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String rollNumber = resultSet.getString("rollNumber");
                String course = resultSet.getString("course");
                int year = resultSet.getInt("year");
                String city = resultSet.getString("city");
                MultipleStudents student = new MultipleStudents(name, rollNumber, course, year, city);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}
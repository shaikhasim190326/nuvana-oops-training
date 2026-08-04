import java.util.ArrayList;

public class Validation {

   
    public static boolean isUniqueEmployeeId(ArrayList<Employee> employees, int id) {
        if (employees == null) return true;

        for (Employee emp : employees) {
            if (emp.getEmployeeId() == id) {
                return false; 
            }
        }
        return true;
    }

    public static boolean isEmailValidAndUnique(ArrayList<Employee> employees, String email) {
        if (email == null || !email.contains("@")) {
            return false; 
        }

        for (Employee emp : employees) {
            if (emp.getEmail() != null && emp.getEmail().equalsIgnoreCase(email.trim())) {
                return false; 
            }
        }
        return true;
    }
}
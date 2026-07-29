import java.util.ArrayList;

public class Validation {

    public static boolean isUniqueEmployeeId(ArrayList<Employee> employees, int id) {

        for (Employee emp : employees) {
            if (emp.getEmployeeId() == id) {
                return false;
            }
        }

        return true;
    }

    
    public static boolean isEmailUnique( ArrayList<Employee> employees, String email) {

    for (Employee emp : employees) {

        if ( emp.getEmail() == email) {
            return false;  
        }

    }

    return true;  
}

}
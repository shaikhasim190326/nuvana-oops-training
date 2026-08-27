package Asim.Student;

public class StudentService {
    
    public void displayStudentDetails(Student student) {

        System.out.println("\n");

        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Year: " + student.getYear());
        System.out.println("City: " + student.getCity());
    }
}

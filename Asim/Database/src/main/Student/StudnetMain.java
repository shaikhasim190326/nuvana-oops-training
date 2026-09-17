
import java.util.Scanner;
import java.util.List;
public class StudnetMain {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();    

        System.out.println("Enter Student Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.println("Enter Student Course: ");
        String course = sc.nextLine();

        System.out.println("Enter Student Year: ");
        int year = sc.nextInt();

        System.out.println("Enter Student City: ");
        sc.nextLine(); 
        String city = sc.nextLine();


        Student s = new Student(name, rollNumber, course, year, city);
        StudentRepositry sr = new StudentRepositry();
        sr.saveStudent(s);

        List<Student> students = sr.getAllStudents();

        System.out.println("All Students:");
        for (Student student : students) {
            sr.displayStudentDetails(student);
        }
       
        sc.close();


    }





}

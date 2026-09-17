package MultipleStudent;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MultipleStudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int number = sc.nextInt();
        sc.nextLine();

        List<MultipleStudents> students = new ArrayList<>();

        for (int i = 1; i <= number; i++) {

            System.out.println("\nEnter details of Student " + i);

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

            MultipleStudents s = new MultipleStudents(name, rollNumber, course, year, city);

            students.add(s);
        }

        MultipleStudentsRepository sr = new MultipleStudentsRepository();

        sr.saveStudents(students);

        List<MultipleStudents> allStudents = sr.getAllStudents();

        System.out.println("\nAll Students:");

        for (MultipleStudents student : allStudents) {
            sr.displayStudentDetails(student);
        }

        sc.close();
    }
}
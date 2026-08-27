package Asim.StudentRealWorldd;
import java.util.Scanner;
public class StudentMain {
    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentRealWorld student = new StudentRealWorld();

        System.out.print("Enter Student ID: ");
        student.setId(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Student Name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter Total Lectures: ");
        student.setTotallectures(scanner.nextLine());

        System.out.print("Enter Attended Lectures: ");
        student.setAttendedLectures(scanner.nextLine());

        System.out.print("Is Medical Leave Approved? (true/false): ");
        student.setMedicalLeaveApproved(scanner.nextBoolean());

        StudentService studentService = new StudentService();
        studentService.displayAttendenceReport(student);
        studentService.calculateAttendancePercentage(student);
        studentService.isExamEligible(student);

        scanner.close();
    }



}

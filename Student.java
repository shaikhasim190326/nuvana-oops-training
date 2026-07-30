import java.util.Scanner;

public class Student {

    int rollNumber;
    String name;
    String course;
    int year;
    String city;

    int english;
    int maths;
    int urdu;
    int marathi;
    int science;

    public void readDetails(Scanner sc) {

        System.out.print("Enter Roll Number : ");
        rollNumber = sc.nextInt();
        sc.nextLine();

        if (rollNumber <= 0) {
            System.out.println("Roll Number must be positive");
            return;
        }

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }

        System.out.print("Enter Course : ");
        course = sc.nextLine();

        if (course.isEmpty()) {
            System.out.println("Course cannot be empty");
            return;
        }

        System.out.print("Enter Year : ");
        year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter City : ");
        city = sc.nextLine();

        System.out.print("English Marks : ");
        english = sc.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.print("Maths Marks : ");
        maths = sc.nextInt();
        if (maths < 0 || maths > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.print("Urdu Marks : ");
        urdu = sc.nextInt();
        if (urdu < 0 || urdu > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.print("Marathi Marks : ");
        marathi = sc.nextInt();
        if (marathi < 0 || marathi > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        System.out.print("Science Marks : ");
        science = sc.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid Marks");
            return;
        }
    }
}

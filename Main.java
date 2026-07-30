import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        StudentServices service = new StudentServices();

        for (int i = 1; i <= 5; i++) {

            Student s = new Student();

            System.out.println("\nEnter Details of Student " + i);

            s.readDetails(sc);

            students.add(s);
        }

        int classTotal = 0;
        Student topper = students.get(0);

        int highEnglish = 0;
        int highMaths = 0;
        int highUrdu = 0;
        int highMarathi = 0;
        int highScience = 0;

        System.out.println("\n===== RESULTS =====");

        for (Student s : students) {

            service.displayResult(s);

            classTotal += service.calculateTotal(s);

            if (service.calculateTotal(s) > service.calculateTotal(topper))
                topper = s;

            if (s.english > highEnglish)
                highEnglish = s.english;

            if (s.maths > highMaths)
                highMaths = s.maths;

            if (s.urdu > highUrdu)
                highUrdu = s.urdu;

            if (s.marathi > highMarathi)
                highMarathi = s.marathi;

            if (s.science > highScience)
                highScience = s.science;
        }

        System.out.println("\nClass Average : " + (classTotal / (students.size() * 5.0)));

        System.out.println("Topper : " + topper.name);

        System.out.println("\nSubject Wise Highest Marks");
        System.out.println("English : " + highEnglish);
        System.out.println("Maths : " + highMaths);
        System.out.println("Urdu : " + highUrdu);
        System.out.println("Marathi : " + highMarathi);
        System.out.println("Science : " + highScience);

        sc.close();
    }
}
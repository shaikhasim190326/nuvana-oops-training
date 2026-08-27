package Asim.Student;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        StudentService service = new StudentService();

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many students you want to enter: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            Student student = new Student();

            System.out.println("Enter Details of Student" + i);

            System.out.println();

            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            student.setRollNumber(rollNumber);

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            student.setName(name);

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();
            student.setCourse(course);

            System.out.print("Enter Year: ");
            int year = scanner.nextInt();
            student.setYear(year);

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            student.setCity(city);

            System.out.print("Enter English Marks: ");
            double englishMarks = scanner.nextDouble();
            student.setEnglish(englishMarks);

            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid marks entered for English. Please enter marks between 0 and 100.");
                i--;
                continue;
            }
            System.out.print("Enter Maths Marks: ");
            double mathMarks = scanner.nextDouble();
            student.setMath(mathMarks);

            if (mathMarks < 0 || mathMarks > 100) {
                System.out.println("Invalid marks entered for Maths. Please enter marks between 0 and 100.");
                i--;
                continue;
            }

            System.out.print("Enter Science Marks: ");
            double scienceMarks = scanner.nextDouble();
            student.setScience(scienceMarks);

            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid marks entered for Science. Please enter marks between 0 and 100.");
                i--;

            }

            double totalMarks = englishMarks + mathMarks + scienceMarks;
            student.setTotal(totalMarks);

            double percentage = (totalMarks / 300) * 100;
            student.setPercentage(percentage);

            if(englishMarks < 35 || mathMarks < 35 || scienceMarks < 35) {
                student.setGrade("FAIL");
            } else

            if (percentage >= 80) {
                student.setGrade("A");
            } else if (percentage >= 60) {
                student.setGrade("B");
            } else if (percentage >= 35 && percentage < 60) {
                student.setGrade("C");
            } else {
                student.setGrade("FAIL");

            }
            students.add(student);

        }

        System.out.println("------------*-All Student DetailS-*-----------");

        for (Student student1 : students) {
            StudentService studentService = new StudentService();
            studentService.displayStudentDetails(student1);

            System.out.println("Total Marks:  "  + student1.getTotal());
            System.out.println("Percentage:   "  + student1.getPercentage());
            System.out.println("Grade:  "  + student1.getGrade());

            if(student1.getEnglish() < 35 || student1.getMath() < 35 || student1.getScience() < 35) {
                System.out.println("srudent " +student1.getName() + "  has faild");
                System.out.println("Reasion:");
                if(student1.getEnglish() < 35) {
                    System.out.println("You have failed in English");
                }
                if(student1.getMath() < 35) {
                    System.out.println("You have failed in Math");
                }
                if(student1.getScience() < 35) {
                    System.out.println("You have F ailed in Science");
                }
            }

            if(student1.getGrade().equals("FAIL")) {
                
            } 
            int percentage = (int) student1.getPercentage();
            String name = student1.getName();
            if (student1.getEnglish() < 35 || student1.getMath() < 35 || student1.getScience() < 35) {
                System.out.println("Result: FAIL");
            } else {
                System.out.println("Result: PASS");
            }

        }

    }
}

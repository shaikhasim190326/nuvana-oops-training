public class EmployeePerformance {

    public double calculateAverageScore(Employee emp) {
        if (emp == null) return 0.0;
        return (emp.getQualityScore() + emp.getAttendanceScore() + emp.getTeamworkScore()) / 3.0;
    }

    public String getRating(Employee emp) {
        if (emp == null) return "N/A";

        double average = calculateAverageScore(emp);

        if (average >= 85) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 55) {
            return "C";
        } else {
            return "Improvement Plan";
        }
    }

    public double calculateIncrement(Employee emp) {
        if (emp == null) return 0.0;

        double salary = emp.getCurrentSalary();
        String rating = getRating(emp);

        if (rating.equals("A")) {
            return salary * 0.12;
        } else if (rating.equals("B")) {
            return salary * 0.08;
        } else if (rating.equals("C")) {
            return salary * 0.04;
        } else {
            return 0;
        }
    }

    public void displayPerformance(Employee emp) {
        if (emp == null) {
            System.out.println("Employee data not available.");
            return;
        }

        double average = calculateAverageScore(emp);
        String rating = getRating(emp);
        double increment = calculateIncrement(emp);
        double revisedSalary = emp.getCurrentSalary() + increment;

        System.out.println("\n.....................................");
        System.out.println("     PERFORMANCE APPRAISAL REPORT     ");
        System.out.println(".....................................");
        System.out.println("Employee ID      : " + emp.getEmployeeId());
        System.out.println("Employee Name    : " + emp.getName());
        System.out.println("-------------------------------------");
        System.out.println("Current Salary   : " + emp.getCurrentSalary());
        System.out.println("Quality Score    : " + emp.getQualityScore());
        System.out.println("Attendance Score : " + emp.getAttendanceScore());
        System.out.println("Teamwork Score   : " + emp.getTeamworkScore());
        System.out.println("-------------------------------------");
        System.out.printf("Average Score    : %.2f\n", average);
        System.out.println("Rating           : " + rating);
        System.out.println("Increment        : " + increment);
        System.out.println("Revised Salary   : " + revisedSalary);

        if (rating.equals("Improvement Plan")) {
            System.out.println("Remark           : Improvement Plan Required");
        }

        System.out.println("=====================================");
    }
}
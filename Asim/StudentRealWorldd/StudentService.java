package Asim.StudentRealWorldd;

public class StudentService {

    public void calculateAttendancePercentage(StudentRealWorld student) {
        int totalLectures = Integer.parseInt(student.getTotallectures());
        int attendedLectures = Integer.parseInt(student.getAttendedLectures());

        double attendancePercentage = ((double) attendedLectures / totalLectures) * 100;
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
    }
    public void isExamEligible(StudentRealWorld student) {
        int totalLectures = Integer.parseInt(student.getTotallectures());
        int attendedLectures = Integer.parseInt(student.getAttendedLectures());
        boolean medicalLeaveApproved = student.getMedicalLeaveApproved();

        double attendancePercentage = ((double) attendedLectures / totalLectures) * 100;

        if (attendancePercentage >= 75 || (attendancePercentage >= 65 && medicalLeaveApproved)) {
            System.out.println("The student is eligible for the exam.");
        } else {
            System.out.println("The student is not eligible for the exam.");
        }
    }
    public void displayAttendenceReport(StudentRealWorld student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Total Lectures: " + student.getTotallectures());
        System.out.println("Attended Lectures: " + student.getAttendedLectures());
        System.out.println("Medical Leave Approved: " + student.getMedicalLeaveApproved());
    }





}





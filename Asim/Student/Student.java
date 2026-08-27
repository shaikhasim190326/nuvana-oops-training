package Asim.Student;

public class Student {

    private int rollNumber;
    private String name;
    private String course;
    private int year;
    private String city;

    private double english;
    private double math;
    private double science;
    private double total;
    private double percentage;
    private String grade;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getEnglish() {
        return english;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getMath() {
        return math;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getScience() {
        return science;
    }

    public void setTotal(double totalMarks) {
        this.total = totalMarks;
    }

    public double getTotal() {
        return total;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

}
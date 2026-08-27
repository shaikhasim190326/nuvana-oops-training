package Asim.StudentRealWorldd;

public class StudentRealWorld {


   private int id;
    private String name;
    private String totallectures;
    private String attendedLectures;
    private boolean medicalLeaveApproved;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setTotallectures(String totallectures) {
        this.totallectures = totallectures;
    }
    public String getTotallectures() {
        return totallectures;
    }
    public void setAttendedLectures(String attendedLectures) {
        this.attendedLectures = attendedLectures;
    }
    public String getAttendedLectures() {
        return attendedLectures;
    }
    public void setMedicalLeaveApproved(boolean medicalLeaveApproved) {
        this.medicalLeaveApproved = medicalLeaveApproved;
    }
    public boolean getMedicalLeaveApproved() {
        return medicalLeaveApproved;
    }


    
}

public class StudentServices {

    public void displayProfile(Student s) {

        System.out.println("-------------------------");
        System.out.println("Roll Number : " + s.rollNumber);
        System.out.println("Name        : " + s.name);
        System.out.println("Course      : " + s.course);
        System.out.println("Year        : " + s.year);
        System.out.println("City        : " + s.city);
    }

    public int calculateTotal(Student s) {

        return s.english + s.maths + s.urdu + s.marathi + s.science;
    }

    public double calculatePercentage(Student s) {

        return calculateTotal(s) / 5.0;
    }

    public String getGrade(Student s) {

        double per = calculatePercentage(s);

        if (per >= 75)
            return "A";
        else if (per >= 60)
            return "B";
        else if (per >= 35)
            return "C";
        else
            return "F";
    }

    public boolean isPassed(Student s) {

        return s.english >= 35 &&
               s.maths >= 35 &&
               s.urdu >= 35 &&
               s.marathi >= 35 &&
               s.science >= 35;
    }

    public void displayResult(Student s) {

        displayProfile(s);

        System.out.println("Total : " + calculateTotal(s));
        System.out.println("Percentage : " + calculatePercentage(s));
        System.out.println("Grade : " + getGrade(s));

        if (isPassed(s))
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");

        System.out.println("-------------------------");
    }


      public double  calculateAttendncePersentage(Student s){
      int persent = s.getAttendLectures()+ s.getMedicalLeaveAproved();
      double persentage = (persent*100.0) / s.getTotalLecture();
      System.out.println("persentage "+ persentage  );
       return persentage;


      }
           

    

      public boolean isExamEligible(Student s){
        double attendnce = calculateAttendncePersentage(s);
          
        if(attendnce>=75){
            return true;
        }else{
         
         return false;



         }
      }
      
       public Student displayAttendanceReport(Student s){
        
         System.out.println(" ------- Attendance    Report  ------");
         System.out.println(" Total Lectures:"+ s.getTotalLecture());
          System.out.println(" Attend Lecture: "+s.getAttendLectures());
         System.out.println("Medical Leave: "+ s.getMedicalLeaveAproved() );
         
        System.out.println("Attendence: "+ calculateAttendncePersentage(s));

       if(isExamEligible(s)){
         
        System.out.println(" Exam status:        is Eligibale      ");

       }else{

        System.out.println("Exam status:      not Eligibale    ");

       }

       return s;

    }
    

}

    
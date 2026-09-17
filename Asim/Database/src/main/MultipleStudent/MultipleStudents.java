package MultipleStudent;
public class MultipleStudents {
    
        private String name;
        private String rollNumber;
        private String course;
        private int year;
        private String city;
        
        public MultipleStudents(String name, String rollNumber, String course, int year, String city) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.course = course;
            this.year = year;
            this.city = city;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRollNumber(){
            return rollNumber;
        }
        public void setRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
        }
        public String getCourse() {
            return course;
        }
        public void setCourse(String course) {
            this.course = course;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
}



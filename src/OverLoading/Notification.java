package OverLoading;

public class Notification {
    // Data

    String type;
    String destination;
    String title;
    String message;
    String time;
    boolean highpriority;

    // Constructor

    public Notification(String type,String destination, String title,String message,String time,boolean highpriority){

        this.type= type;
        this.destination= destination;
        this.title= title;
        this.message= message;
        this.time= time;
        this.highpriority= highpriority;

        }
    
        // Method to Display 1 Notification

        public void displayNotification(){
            System.out.println("Notification Type :" + type);
            System.out.println("destination:"       + destination);
            System.out.println("title:"             + title);
            System.out.println("message:"         + message);
            System.out.println("time:"          + time);
            System.out.println("highpriority:" + highpriority);

            }
}

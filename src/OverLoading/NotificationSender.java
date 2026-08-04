package OverLoading;
import java.time.LocalDateTime;

public class NotificationSender {
    
     // Array to Store Notifications

    Notification history[] = new Notification[100];
    int count = 0;


// Method 1 - SMS Notification
    public void sendNotification(String mobile, String message) {

        // Validation

        if (mobile.length() != 10) {
            System.out.println("Invalid Mobile Number!");
            return;
        }

        for (int i = 0; i < mobile.length(); i++) {
            if (!Character.isDigit(mobile.charAt(i))) {
                System.out.println("Invalid Mobile Number!");
                return;
            }
        }

         String time = LocalDateTime.now().toString();

        Notification n = new Notification(
                "SMS",
                mobile,
                "N/A",
                message,
                time,
                false);

        history[count] = n;
        count++;

        System.out.println("\nSMS Notification Sent Successfully");
        n.displayNotification();
    }

     // Method 2 - Email Notification
    public void sendNotification(String email, String subject, String message) {

        // Validation
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid Email Address!");
            return;
        }

        String time = LocalDateTime.now().toString();

        Notification n = new Notification(
                "Email",
                email,
                subject,
                message,
                time,
                false);

        history[count] = n;
        count++;

        System.out.println("\nEmail Notification Sent Successfully");
         n.displayNotification();
    }

     // Method 3 - App Notification
    public void sendNotification(int userId, String title, String message, boolean highPriority) {

        // Validation
        if (userId <= 0) {
            System.out.println("Invalid User ID!");
            return;
        }

        String time = LocalDateTime.now().toString();

        Notification n = new Notification(
                "App Notification",
                String.valueOf(userId),
                title,
                message,
                time,
                highPriority);

        history[count] = n;
        count++;
          System.out.println("\nApp Notification Sent Successfully");
        n.displayNotification();
    }

     // Display Notification History
    public void displayHistory() {

        if (count == 0) {
            System.out.println("No Notifications Found.");
            return;
        }

        System.out.println("\n----- Notification History -----");

        for (int i = 0; i < count; i++) {
            history[i].displayNotification();
        }
    }
}


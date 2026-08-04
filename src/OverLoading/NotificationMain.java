package OverLoading;


import java.util.Scanner;

public class NotificationMain {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
NotificationSender obj = new NotificationSender();

int choice;

do {

System.out.println("\n===== Notification Sender =====");
System.out.println("1. Send SMS");
System.out.println("2. Send Email");
System.out.println("3. Send App Notification");
System.out.println("4. Display Notification History");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");

choice = sc.nextInt();
sc.nextLine();

switch (choice) {

case 1:

System.out.print("Enter Mobile Number: ");
String mobile = sc.nextLine();

System.out.print("Enter Message: ");
String smsMessage = sc.nextLine();

obj.sendNotification(mobile, smsMessage);
break;

case 2:

System.out.print("Enter Email Address: ");
String email = sc.nextLine();

System.out.print("Enter Subject: ");
String subject = sc.nextLine();

System.out.print("Enter Message: ");
String emailMessage = sc.nextLine();

obj.sendNotification(email, subject, emailMessage);
break;

case 3:

System.out.print("Enter User ID: ");
int userId = sc.nextInt();
sc.nextLine();

System.out.print("Enter Title: ");
String title = sc.nextLine();

System.out.print("Enter Message: ");
String appMessage = sc.nextLine();

System.out.print("Is it High Priority? (true/false): ");
boolean priority = sc.nextBoolean();

obj.sendNotification(userId, title, appMessage, priority);
break;

case 4:

obj.displayHistory();
break;

case 5:

System.out.println("Thank You!");
break;

default:

System.out.println("Invalid Choice!");
    }

} while (choice != 5);

sc.close();
    }
}

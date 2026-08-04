package Inheritance;
import java.util.Scanner;

public class Main {
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter partner ID:");
int partnerId=sc.nextInt();
 sc.nextLine();
System.out.println("Enter name:");
String name= sc.nextLine();
System.out.println("Enter mobile number:");
String mobilenumber= sc.nextLine();
System.out.println("Enter completed orders:");
int completedorders= sc.nextInt();
System.out.println("Enter Base pay:");
double basepay=sc.nextDouble();
System.out.println("Enter Delivery type:");
System.out.println("Enter 1 Bike");
System.out.println("2 Cycle");
System.out.println("3 Car");
int choice= sc. nextInt();
sc.nextLine();
if (choice==1){
System.out.println("Enter Bike Number:");
String bikeNumber = sc.nextLine();

System.out.println("Enter Fuel Allowance:");
double fuelAllowance = sc.nextDouble();

BikeDeliveryPartner bike = new BikeDeliveryPartner
(partnerId,name,mobilenumber,completedorders,basepay,bikeNumber,
fuelAllowance);

bike.displayDetails();
System.out.println("Total Earnings: " + bike.calculateEarnings());

        } 
else if (choice == 2) {

System.out.println("Enter Zone:");
String zone = sc.nextLine();

System.out.println("Enter Health Incentive:");
double healthIncentive = sc.nextDouble();

CycleDeliveryPartner cycle = new CycleDeliveryPartner(
partnerId,name,mobilenumber,completedorders,basepay,zone,
healthIncentive);

cycle.displayDetails();
System.out.println("Total Earnings: " + cycle.calculateEarnings());

        } 
else if (choice == 3) {

System.out.println("Enter Car Number:");
String carNumber = sc.nextLine();

System.out.println("Enter Distance Allowance:");
double distanceAllowance = sc.nextDouble();

CarDeliveryPartner car = new CarDeliveryPartner
(partnerId,name,mobilenumber,completedorders,basepay,carNumber,
distanceAllowance);

car.displayDetails();
System.out.println("Total Earnings: " + car.calculateEarnings());

        }
else {

System.out.println("Invalid Choice");
        }

sc.close();
    }
}


    


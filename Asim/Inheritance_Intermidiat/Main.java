package Asim.Inheritance_Intermidiat;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehcicle> vehicles = new ArrayList<>();

        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        for (int i = 0; i < numVehicles; i++) {
            System.out.println("Enter details for vehicle " + (i + 1) + ":");
            System.out.print("Type (Bike/Car/Truck): ");
            String type = scanner.next();

            System.out.print("Registration Number: ");
            int registrationNumber = scanner.nextInt();
            System.out.print("Brand: ");
            String brand = scanner.next();
            System.out.print("Base Rate Per Day: ");
            int baseRatePerDay = scanner.nextInt();

            if (type.equalsIgnoreCase("Bike")) {
                System.out.print("Engine Capacity in kw: ");
                String engineCapacity = scanner.next();
                vehicles.add(new Bike(registrationNumber, brand, baseRatePerDay, engineCapacity));
            } else if (type.equalsIgnoreCase("Car")) {
                System.out.print("Seats: ");
                int seats = scanner.nextInt();
                System.out.print("AC Available (true/false): ");
                boolean acAvailable = scanner.nextBoolean();
                vehicles.add(new Car(registrationNumber, brand, baseRatePerDay, seats, acAvailable));
            } else if (type.equalsIgnoreCase("Truck")) {
                System.out.print("Load Capacity in Kg: ");
                String loadCapacity = scanner.next();
                vehicles.add(new Truck(registrationNumber, brand, baseRatePerDay, loadCapacity));
            } else {
                System.out.println("Invalid vehicle type. Skipping this entry.");
            }
        }

        for (Vehcicle vehicle : vehicles) {
             System.out.println("-----------------------------");
            System.out.println("\nVehicle Details:");
            vehicle.displayVehicleDetails();
            System.out.print("Enter number of rental days: ");
            int days = scanner.nextInt();
            int rentalCost = vehicle.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }

}

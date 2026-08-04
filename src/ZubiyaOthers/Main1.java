import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Car Input
        System.out.println("Enter Car Details");

        System.out.print("Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Fuel Type: ");
        String fuelType = sc.nextLine();

        System.out.print("Distance Travelled: ");
        double distance = sc.nextDouble();

        System.out.print("Fuel Consumed: ");
        double fuel = sc.nextDouble();

        Car car = new Car(vehicleNumber, brand, fuelType, distance, fuel);

        System.out.println("\nCar Details");
        car.start();
        System.out.println("Mileage = " + car.calculateMileage());
        car.stop();

        sc.close();
    }
}

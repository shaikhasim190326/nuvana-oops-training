public class Bike extends Vehicle {

    double distanceTravelled;
    double fuelConsumed;

    Bike(String vehicleNumber, String brand, String fuelType,
         double distanceTravelled, double fuelConsumed) {

        super(vehicleNumber, brand, fuelType);

        this.distanceTravelled = distanceTravelled;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    double calculateMileage() {
        return distanceTravelled / fuelConsumed;
    }
}
    


public class Car extends Vehicle {

    double distanceTravelled;
    double fuelConsumed;

    Car(String vehicleNumber, String brand, String fuelType,
        double distanceTravelled, double fuelConsumed) {

        super(vehicleNumber, brand, fuelType);

        this.distanceTravelled = distanceTravelled;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }

    @Override
    double calculateMileage() {
        return distanceTravelled / fuelConsumed;
    }
}
    


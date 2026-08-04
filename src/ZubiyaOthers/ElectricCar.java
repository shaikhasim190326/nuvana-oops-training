
    public class ElectricCar extends Vehicle {

    double distanceTravelled;
    double batteryConsumed;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                double distanceTravelled, double batteryConsumed) {

        super(vehicleNumber, brand, fuelType);

        this.distanceTravelled = distanceTravelled;
        this.batteryConsumed = batteryConsumed;
    }

    @Override
    void start() {
        System.out.println("Electric Car started silently");
    }

    @Override
    void stop() {
        System.out.println("Electric Car stopped");
    }

    @Override
    double calculateMileage() {
        return distanceTravelled / batteryConsumed;
    }
}
    


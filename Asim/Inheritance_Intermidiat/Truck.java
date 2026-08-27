package Asim.Inheritance_Intermidiat;

public class Truck extends Vehcicle {
    
    String loadCapacity;
 
    public Truck(int registrationNumber, String brand, int baseRatePerDay, String loadCapacity) {
        super(registrationNumber, brand, baseRatePerDay);
        this.loadCapacity = loadCapacity;
    }

    int calculateRentalCost(int days) {
        int cost = super.calculateRentalCost(days);
        if (Integer.parseInt(loadCapacity) > 1000) {
            cost += 1000 * days; 
        }
        return cost;
    }

    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Load Capacity: " + loadCapacity);
    }





}

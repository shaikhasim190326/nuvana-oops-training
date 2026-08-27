package Asim.Inheritance_Intermidiat;

public class Bike extends Vehcicle{

    String engineCapacity;
    


    public Bike(int registrationNumber, String brand, int baseRatePerDay, String engineCapacity) {
        super(registrationNumber, brand, baseRatePerDay);
        this.engineCapacity = engineCapacity;
    }


    int calculateRentalCost(int days) {
        int cost = super.calculateRentalCost(days);
        if (days> 5) {
            cost = cost - (cost * 10 / 100);

        }
        return cost;

    }

    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }








}

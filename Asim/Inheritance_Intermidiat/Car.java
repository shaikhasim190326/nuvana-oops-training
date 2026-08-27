package Asim.Inheritance_Intermidiat;

public class Car extends Vehcicle {


    int Seats;
    boolean acAvailable;


    public Car(int registrationNumber, String brand, int baseRatePerDay, int Seats, boolean acAvailable) {
        super(registrationNumber, brand, baseRatePerDay);
        this.Seats = Seats;
        this.acAvailable = acAvailable;
    }



    int calculateRentalCost(int days) {
        int cost = super.calculateRentalCost(days);
        if (acAvailable) {
            cost += 500 * days; 
        }
        return cost;
    }

    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Seats: " + Seats);
        System.out.println("AC Available: " + acAvailable);
    }


    










    
}

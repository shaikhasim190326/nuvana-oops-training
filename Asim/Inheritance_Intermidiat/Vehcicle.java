package Asim.Inheritance_Intermidiat;

public class Vehcicle {

int registrationNumber;
String brand;
int baseRatePerDay;

public Vehcicle(int registrationNumber, String brand, int baseRatePerDay) {
    this.registrationNumber = registrationNumber;
    this.brand = brand;
    this.baseRatePerDay = baseRatePerDay;
}


int calculateRentalCost(int days) {
    return baseRatePerDay * days;
}


void displayVehicleDetails() {
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Brand: " + brand);
    System.out.println("Base Rate Per Day: " + baseRatePerDay);
    

}
}

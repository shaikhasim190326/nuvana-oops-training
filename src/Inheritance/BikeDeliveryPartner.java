package Inheritance;

public class BikeDeliveryPartner extends DeliveryPartner {

    private String bikeNumber;
    private double fuelAllowance;

    public BikeDeliveryPartner(int partnerId, String name, String mobileNumber,
                               int completedOrders, double basePay,
                               String bikeNumber, double fuelAllowance) {

        super(partnerId, name, mobileNumber, completedOrders, basePay);
        this.bikeNumber = bikeNumber;
        this.fuelAllowance = fuelAllowance;
    }

    
    public double calculateEarnings() {
        return basePay + fuelAllowance;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bike Number : " + bikeNumber);
        System.out.println("Fuel Allowance : " + fuelAllowance);
        System.out.println("Final Earnings : " + calculateEarnings());
    }
}

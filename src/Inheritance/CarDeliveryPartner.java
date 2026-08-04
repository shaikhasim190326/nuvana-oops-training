package Inheritance;

public class CarDeliveryPartner extends DeliveryPartner {

    private String carNumber;
    private double distanceAllowance;

    public CarDeliveryPartner(int partnerId, String name, String mobileNumber,
                              int completedOrders, double basePay,
                              String carNumber, double distanceAllowance) {

        super(partnerId, name, mobileNumber, completedOrders, basePay);
        this.carNumber = carNumber;
        this.distanceAllowance = distanceAllowance;
    }

    @Override
    public double calculateEarnings() {
        return basePay + distanceAllowance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Number : " + carNumber);
        System.out.println("Distance Allowance : " + distanceAllowance);
        System.out.println("Final Earnings : " + calculateEarnings());
    }
}
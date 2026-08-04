package Inheritance;

public class CycleDeliveryPartner extends DeliveryPartner {

    private String zone;
    private double healthIncentive;

    public CycleDeliveryPartner(int partnerId, String name, String mobileNumber,
                                int completedOrders, double basePay,
                                String zone, double healthIncentive) {

        super(partnerId, name, mobileNumber, completedOrders, basePay);
        this.zone = zone;
        this.healthIncentive = healthIncentive;
    }

    @Override
    public double calculateEarnings() {
        return basePay + healthIncentive;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Zone : " + zone);
        System.out.println("Health Incentive : " + healthIncentive);
        System.out.println("Final Earnings : " + calculateEarnings());
    }
}

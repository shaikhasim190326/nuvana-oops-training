package Inheritance;

public class DeliveryPartner {

    protected int partnerId;
    protected String name;
    protected String mobileNumber;
    protected int completedOrders;
    protected double basePay;

    public DeliveryPartner(int partnerId, String name, String mobileNumber, int completedOrders, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.completedOrders = completedOrders;
        this.basePay = basePay;
    }

    public void displayDetails() {
        System.out.println("Partner ID : " + partnerId);
        System.out.println("Name : " + name);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Completed Orders : " + completedOrders);
        System.out.println("Base Pay : " + basePay);
    }

    public double calculateEarnings() {
        return basePay;
    }
}

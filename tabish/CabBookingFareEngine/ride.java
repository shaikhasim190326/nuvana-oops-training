public abstract class ride {
    private int rideId;
    private String customerName;
    private  double distancekm ;
    private  int timeInMinutes;

    public ride(int rideId, String customerName, double distancekm, int timeInMinutes) {
        if (distancekm < 0 || timeInMinutes < 0) {
            throw new IllegalArgumentException("Distance and time cannot be negative.");
        }
        this.rideId = rideId;
        this.customerName = customerName;
        this.distancekm = distancekm;
        this.timeInMinutes = timeInMinutes;
    }
    public abstract double calculateFare();

    public void displayRideDetails() {
        System.out.println("Time (minutes): " + timeInMinutes);
    }

    public void printreceipt() {
        System.out.println("----- Ride Receipt -----");
        displayRideDetails();
        System.out.println("Fare: " + calculateFare());
        System.out.println("------------------------");
    }
}
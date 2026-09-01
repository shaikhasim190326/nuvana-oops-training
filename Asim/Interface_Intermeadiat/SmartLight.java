package Asim.Interface_Intermeadiat;

public class SmartLight implements Adjustable, Connectable, Switchable {

    public void TurnOn() {

        System.out.println("Light is ON");

    }

    public void TurnOff() {

        System.out.println("Light is OFF");

    }

    public void ConnectToWifi(String network) {

        System.out.println("Light is connexted to " + network);
    }

    public void IncreaceLevel() {
        System.out.println("Light is increase now ");
    }

    public void DecreaceLevel() {
        System.out.println("Light is decrease now");
    }

}

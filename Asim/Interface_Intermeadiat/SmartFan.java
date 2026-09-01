package Asim.Interface_Intermeadiat;

public class SmartFan implements Adjustable, Switchable {

    public void TurnOn() {

        System.out.println("Fan ON");

    }

    public void TurnOff() {

        System.out.println("Fan OFF");
    }

    public void IncreaceLevel() {

        System.out.println("Fan is IncreaseLevel Now");

    }

    public void DecreaceLevel() {
        System.out.println("Fan DecreaseLevel Now");

    }

}

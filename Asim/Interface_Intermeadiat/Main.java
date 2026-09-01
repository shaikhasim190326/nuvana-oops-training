package Asim.Interface_Intermeadiat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SmartLight smartLight = new SmartLight();
        SmartDoorLock smartDoorLock =new SmartDoorLock();
        SmartFan smartFan = new SmartFan();

        System.out.println("Enter Wifi Name: ");
        String network = sc.nextLine();

        smartLight.ConnectToWifi(network);

        smartDoorLock.TurnOn();

        smartDoorLock.ConnectToWifi(network);

        smartFan.TurnOn();

        smartFan.IncreaceLevel();


    }

}

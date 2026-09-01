package Asim.Interface_Intermeadiat;

public class SmartDoorLock   implements Connectable, Switchable{


    
    public void TurnOn(){


        System.out.println("Door Lock ON");
    }
    public void TurnOff(){


        System.out.println("Door Lock OFF");
    }
 
    public void ConnectToWifi(String network){

        System.out.println("Door Lock is Connected to "+network);
    }


    
}

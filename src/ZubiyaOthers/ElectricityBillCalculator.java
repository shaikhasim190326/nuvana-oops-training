import java.util.Scanner;
public class ElectricityBillCalculator {
   

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer type:");
        System.out.println("Enter Common 1");
        System.out.println("Enter commercial 2");
        System.out.println("Enter senior citizen 3");
        int choice =sc.nextInt();
        sc.close();
        
        
        if (choice == 1){
            System.out.println("Enter units consumed");
            System.out.println("Common Customer");
            }

        else if(choice== 2){
            System.out.println("Commercial Customer");
            }
        else if( choice==3){
            System.out.println("Senior Citizen");
            }
        else{
            System.out.println("Invalid Choice");
            }
            }
            }

         
            
                
            
        



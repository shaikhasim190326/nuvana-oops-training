public class BillCalculation {
    // common customer
public double
 calculateBill(int units){
 double bill =0;
if (units<=100){
bill= units *5;
     }
 else if(units <=200){
 bill= (100*5)+((units - 100)* 7);
         }
 else{ 
bill=(100 * 5)+(100 * 7)+((units - 200)*10);
       }
return bill;
             }

     // commercial customer
 public double
calculateBill(int units,double fixedCharge){
 double bill =calculateBill(units);
return bill + fixedCharge;
            }
     // senior citizen
 public double 
 calculateBill(int units,double fixedCharge,double discountpercent){
 double bill = calculateBill(units);
 bill= bill+ fixedCharge;
 double discount= bill* discountpercent/100;
 return bill - discount;
         }
    }
                
    

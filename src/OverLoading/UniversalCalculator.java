package OverLoading;

public class UniversalCalculator {
public int add(int a, int b){
 return a+b;
     }
public int add( int a, int b, int c){
 return a + b + c;
    }

public double add(double a, double b){
 return a+b;
     }
 public double add(int a, double b){
 return a + b;
    }
 public int calculateArea(int side){
    
return side * side;
}
public int calculateArea(int length, int width){
return length * width;
                            }
 public double calculateArea(double radius){
 return 3.14 * radius * radius;
                             }

    
}

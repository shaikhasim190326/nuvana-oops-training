package OverLoading;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UniversalCalculator obj = new UniversalCalculator();

        System.out.println("Enter first integer:");
        int a = sc.nextInt();

        System.out.println("Enter second integer:");
        int b = sc.nextInt();

        System.out.println("Addition of two integers = " + obj.add(a, b));

        System.out.println();

        System.out.println("Enter first integer:");
        int x = sc.nextInt();

        System.out.println("Enter second integer:");
        int y = sc.nextInt();

        System.out.println("Enter third integer:");
        int z = sc.nextInt();

        System.out.println("Addition of three integers = " + obj.add(x, y, z));

        System.out.println();

        System.out.println("Enter first double value:");
        double d1 = sc.nextDouble();

        System.out.println("Enter second double value:");
        double d2 = sc.nextDouble();

        System.out.println("Addition of two doubles = " + obj.add(d1, d2));

        System.out.println();

        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        System.out.println("Enter a double value:");
        double d = sc.nextDouble();

        System.out.println("Addition of integer and double = " + obj.add(n, d));

        System.out.println();

        System.out.println("Enter side of square:");
        int side = sc.nextInt();

        System.out.println("Area of Square = " + obj.calculateArea(side));

        System.out.println();

        System.out.println("Enter length:");
        int length = sc.nextInt();

        System.out.println("Enter width:");
        int width = sc.nextInt();

        System.out.println("Area of Rectangle = " + obj.calculateArea(length, width));

        System.out.println();

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        System.out.println("Area of Circle = " + obj.calculateArea(radius));

        sc.close();
    }
}

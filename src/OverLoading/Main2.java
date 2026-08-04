package OverLoading;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SearchService service = new SearchService();

        int choice;

        do {

            System.out.println("\n===== Product Search Service =====");
            System.out.println("1. Search by Product Name");
            System.out.println("2. Search by Product ID");
            System.out.println("3. Search by Category and Maximum Price");
            System.out.println("4. Search by Price Range");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Product Name: ");
                String productName = sc.nextLine();

                ArrayList<Product> result = service.search(productName);

                if (result.isEmpty()) {
                    System.out.println("No products found.");
                } else {
                    for (Product p : result) {
                        System.out.println(p);
                        System.out.println("----------------------");
                    }
                }

            } else if (choice == 2) {

                System.out.print("Enter Product ID: ");
                int productId = sc.nextInt();

                Product product = service.search(productId);

                if (product == null) {
                    System.out.println("No products found.");
                } else {
                    System.out.println(product);
                }

            } else if (choice == 3) {

                sc.nextLine();

                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                System.out.print("Enter Maximum Price: ");
                double maxPrice = sc.nextDouble();

                ArrayList<Product> result = service.search(category, maxPrice);

                if (result.isEmpty()) {
                    System.out.println("No products found.");
                } else {
                    for (Product p : result) {
                        System.out.println(p);
                        System.out.println("----------------------");
                    }
                }

            } else if (choice == 4) {

                System.out.print("Enter Minimum Price: ");
                double minPrice = sc.nextDouble();

                System.out.print("Enter Maximum Price: ");
                double maxPrice = sc.nextDouble();

                ArrayList<Product> result = service.search(minPrice, maxPrice);

                if (result.isEmpty()) {
                    System.out.println("No products found.");
                } else {
                    for (Product p : result) {
                        System.out.println(p);
                        System.out.println("----------------------");
                    }
                }

            } else if (choice == 5) {

                System.out.println("Thank You!");

            } else {

                System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();
    }
}

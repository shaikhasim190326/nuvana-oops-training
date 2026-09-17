package CatagoriesDatabas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            RepositoryService repository =
                    new RepositoryService();

            
            repository.createTable();

            while (true) {

                System.out.println(
                        "\n===== PRODUCT MANAGEMENT ====="
                );

                System.out.println(
                        "1. Show Products"
                );

                System.out.println(
                        "2. Add Category"
                );

                System.out.println(
                        "3. Exit"
                );

                System.out.print(
                        "Enter your choice: "
                );


                
                if (!sc.hasNextInt()) {

                    System.out.println(
                            "Invalid Choice"
                    );

                    sc.nextLine();

                    continue;
                }


                int choice = sc.nextInt();

                sc.nextLine();


                
                if (choice == 1) {

                    repository.selectCategory();

                } else if (choice == 2) {

                    repository.addCategory();

                } else if (choice == 3) {

                    System.out.println(
                            "Program Exit..."
                    );

                    break;

                } else {

                    System.out.println(
                            "Invalid Choice"
                    );
                }
            }
        }
    }
}


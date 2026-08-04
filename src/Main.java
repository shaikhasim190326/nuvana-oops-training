public class Main {

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop", 50000);

        Product p3 = new Product(103, "Mobile", 25000, 10);

        p1.display();
        p2.display();
        p3.display();

        Product highest = p1;

        if (p2.totalInventoryValue() > highest.totalInventoryValue()) {
            highest = p2;
        }

        if (p3.totalInventoryValue() > highest.totalInventoryValue()) {
            highest = p3;
        }

        System.out.println("Product with Highest Inventory Value");
        highest.display();
    }
}

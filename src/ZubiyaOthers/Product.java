public class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    // Default Constructor
    public Product() {
        productId = 101;
        productName = "No Product";
        price = 0.0;
        quantity = 0;
    }

    // Constructor with Product Name and Price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        productId = 102;
        quantity = 1;
    }

    // Constructor with All Details
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate inventory value
    public double totalInventoryValue() {
        return price * quantity;
    }

    // Display Method
    public void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Inventory Value : " + totalInventoryValue());
        System.out.println();
    }
}
                



    


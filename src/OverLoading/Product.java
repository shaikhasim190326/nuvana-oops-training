package OverLoading;

public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

     // Constructor
    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        }

         // Getter for Product ID
    public int getProductId() {
        return productId;
    }
     // Getter for Product Name
    public String getProductName() {
        return productName;
    }
     // Getter for Category
    public String getCategory() {
        return category;
    }
      // Getter for Price
    public double getPrice() {
        return price;
    }
    // Display product details
    @Override
    public String toString() {
        return "Product ID : " + productId +
               "\nProduct Name : " + productName +
               "\nCategory : " + category +
               "\nPrice : " + price;
    }
}
    
    


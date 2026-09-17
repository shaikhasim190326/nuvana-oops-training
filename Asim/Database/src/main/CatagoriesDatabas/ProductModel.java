
package CatagoriesDatabas;

public class ProductModel {

    private int id;
    private String category;
    private String product;
    private double price;
    private int quantity;


    
    public ProductModel(String category, String product,
                        double price, int quantity) {

        this.category = category;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }


    
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}

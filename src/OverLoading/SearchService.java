package OverLoading;
import java.util.ArrayList;

public class SearchService {
    // ArrayList of products
    private ArrayList<Product> products;

    // Constructor
    public SearchService() {

        products = new ArrayList<>();
// Adding at least 10 products
products.add ( new Product(101,"Rice","Grossary",60));
products.add( new Product( 102,"Sugar","Grossary",45));
products.add(new Product (  103,"Milk","Dairy",30));
products.add(new Product (  104,"Bread","Bakery",40));
products.add(new Product (  105,"Butter","Dairy",55));
products.add(new Product (  106,"Shampoo","Personal care",250));
products.add(new Product (  107,"Soap","Personal Care",35));
products.add(new Product (  108,"Note Book","Stationary",30));
products.add(new Product (  109,"Pen","Stationary",20));
products.add(new Product (  110,"Water Bottle","Accessories",180));

}
 // Search by Product Name
    public ArrayList<Product>search(String productName) {

        ArrayList<Product> result = new ArrayList<>();

        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(productName)) {
                result.add(p);
            }
        }
         return result;
        }
        
        public Product search(int productId) {

    for (Product p : products) {
        if (p.getProductId() == productId) {
            return p;
        }
    }

    return null;
}
public ArrayList<Product> search(String category, double maxPrice) {

    ArrayList<Product> result = new ArrayList<>();

    for (Product p : products) {

        if (p.getCategory().equalsIgnoreCase(category)
                && p.getPrice() <= maxPrice) {

            result.add(p);
        }
    }

    return result;
}
public ArrayList<Product> search(double minPrice, double maxPrice) {

    ArrayList<Product> result = new ArrayList<>();

    if (minPrice > maxPrice) {
        return result;
    }

    for (Product p : products) {

        if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
            result.add(p);
        }
    }

    return result;
}
}



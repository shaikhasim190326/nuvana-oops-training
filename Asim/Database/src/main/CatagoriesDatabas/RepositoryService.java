package Asim.Database.src.CatagoriesDatabas;
import java.sql.*;
import java.util.Scanner;



interface ProductRepository {

    void showProducts();

    void addCategory();

    void addProduct(String category);
}



public class RepositoryService implements ProductRepository {

    Scanner sc = new Scanner(System.in);


    private String url =
            "jdbc:mysql://localhost:3306/product_db";

    private String username = "root";

    private String password = "root";


    

    private Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

        } catch (SQLException e) {

            System.out.println(
                    "Database Connection Error: "
                            + e.getMessage()
            );
        }

        return con;
    }


    

    public void createTable() {

        Connection con = getConnection();

        try {

            Statement st =
                    con.createStatement();


            

            String categoryTable =
                    "CREATE TABLE IF NOT EXISTS categories (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(100) UNIQUE NOT NULL)";

            st.executeUpdate(categoryTable);


            

            String productTable =
                    "CREATE TABLE IF NOT EXISTS products (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "category VARCHAR(100)," +
                    "product VARCHAR(100)," +
                    "price DOUBLE," +
                    "quantity INT)";

            st.executeUpdate(productTable);


            

            st.executeUpdate(
                    "INSERT IGNORE INTO categories(name) VALUES " +
                    "('Electronics')," +
                    "('Clothes')," +
                    "('Shoes')"
            );


           

            addDefaultProducts(con);


            System.out.println(
                    "Database Connected Successfully"
            );

            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Table Error: "
                            + e.getMessage()
            );
        }
    }



    private void addDefaultProducts(
            Connection con
    ) throws SQLException {

        String sql =
                "INSERT INTO products " +
                "(category, product, price, quantity) " +
                "SELECT ?, ?, ?, ? " +
                "WHERE NOT EXISTS " +
                "(SELECT 1 FROM products " +
                "WHERE category=? AND product=?)";


        addDefaultProduct(
                con,
                sql,
                "Electronics",
                "Laptop",
                50000,
                5
        );

        addDefaultProduct(
                con,
                sql,
                "Electronics",
                "Mobile",
                20000,
                10
        );

        addDefaultProduct(
                con,
                sql,
                "Electronics",
                "TV",
                30000,
                4
        );


        addDefaultProduct(
                con,
                sql,
                "Clothes",
                "Shirt",
                1000,
                20
        );

        addDefaultProduct(
                con,
                sql,
                "Clothes",
                "Pant",
                1500,
                15
        );

        addDefaultProduct(
                con,
                sql,
                "Clothes",
                "Jacket",
                2500,
                8
        );


        addDefaultProduct(
                con,
                sql,
                "Shoes",
                "Running Shoes",
                2500,
                10
        );

        addDefaultProduct(
                con,
                sql,
                "Shoes",
                "Formal Shoes",
                3000,
                7
        );

        addDefaultProduct(
                con,
                sql,
                "Shoes",
                "Sports Shoes",
                3500,
                6
        );
    }


    private void addDefaultProduct(
            Connection con,
            String sql,
            String category,
            String product,
            double price,
            int quantity
    ) throws SQLException {

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, category);
        ps.setString(2, product);
        ps.setDouble(3, price);
        ps.setInt(4, quantity);

        ps.setString(5, category);
        ps.setString(6, product);

        ps.executeUpdate();

        ps.close();
    }


    

    @Override
    public void showProducts() {

        Connection con = getConnection();

        try {

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM products"
                    );


            System.out.println(
                    "\n===== CATEGORIES ====="
            );


            String lastCategory = "";


            while (rs.next()) {

                String category =
                        rs.getString("category");


                if (!category.equals(lastCategory)) {

                    System.out.println(
                            "\n--- "
                                    + category
                                    + " ---"
                    );

                    lastCategory = category;
                }


                System.out.println(
                        rs.getInt("id")
                                + ". "
                                + rs.getString("product")
                                + " | Price: "
                                + rs.getDouble("price")
                                + " | Quantity: "
                                + rs.getInt("quantity")
                );
            }


            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Show Product Error: "
                            + e.getMessage()
            );
        }
    }


    

    @Override
    public void addCategory() {

        System.out.print(
                "Enter Category Name: "
        );

        String category =
                sc.nextLine();


        Connection con =
                getConnection();


        try {

            String sql =
                    "INSERT INTO categories(name) " +
                    "VALUES (?)";


            PreparedStatement ps =
                    con.prepareStatement(sql);


            ps.setString(
                    1,
                    category
            );


            ps.executeUpdate();


            System.out.println(
                    "Category Added Successfully"
            );


            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Category Error: "
                            + e.getMessage()
            );
        }
    }


    

    @Override
    public void addProduct(
            String category
    ) {

        System.out.print(
                "Enter Product Name: "
        );

        String product =
                sc.nextLine();


        System.out.print(
                "Enter Price: "
        );

        double price =
                Double.parseDouble(
                        sc.nextLine()
                );


        System.out.print(
                "Enter Quantity: "
        );

        int quantity =
                Integer.parseInt(
                        sc.nextLine()
                );


        Connection con =
                getConnection();


        try {

            String sql =
                    "INSERT INTO products " +
                    "(category, product, price, quantity) " +
                    "VALUES (?, ?, ?, ?)";


            PreparedStatement ps =
                    con.prepareStatement(sql);


            ps.setString(
                    1,
                    category
            );

            ps.setString(
                    2,
                    product
            );

            ps.setDouble(
                    3,
                    price
            );

            ps.setInt(
                    4,
                    quantity
            );


            ps.executeUpdate();


            System.out.println(
                    "Product Added Successfully"
            );


            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Product Error: "
                            + e.getMessage()
            );
        }
    }


    

    public void selectCategory() {

        Connection con =
                getConnection();


        try {

            Statement st =
                    con.createStatement();


            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM categories"
                    );


            System.out.println(
                    "\n===== CATEGORIES ====="
            );


            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + ". "
                                + rs.getString("name")
                );
            }


            System.out.print(
                    "Enter Category ID: "
            );


            int id =
                    Integer.parseInt(
                            sc.nextLine()
                    );


            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT name FROM categories " +
                            "WHERE id=?"
                    );


            ps.setInt(1, id);


            ResultSet result =
                    ps.executeQuery();


            if (result.next()) {

                String category =
                        result.getString("name");


                System.out.println(
                        "\n===== "
                                + category.toUpperCase()
                                + " ====="
                );


                System.out.println(
                        "1. Show Products"
                );

                System.out.println(
                        "2. Add Product"
                );

                System.out.println(
                        "3. Back"
                );


                System.out.print(
                        "Enter choice: "
                );


                int choice =
                        Integer.parseInt(
                                sc.nextLine()
                        );


                if (choice == 1) {

                    showCategoryProducts(
                            category
                    );

                } else if (choice == 2) {

                    addProduct(category);

                } else if (choice == 3) {

                    return;

                } else {

                    System.out.println(
                            "Invalid Choice"
                    );
                }

            } else {

                System.out.println(
                        "Category Not Found"
                );
            }


            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Category Error: "
                            + e.getMessage()
            );
        }
    }



    private void showCategoryProducts(
            String category
    ) {

        Connection con =
                getConnection();


        try {

            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT * FROM products " +
                            "WHERE category=?"
                    );


            ps.setString(
                    1,
                    category
            );


            ResultSet rs =
                    ps.executeQuery();


            System.out.println(
                    "\n===== "
                            + category.toUpperCase()
                            + " PRODUCTS ====="
            );


            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + ". "
                                + rs.getString("product")
                                + " | Price: "
                                + rs.getDouble("price")
                                + " | Quantity: "
                                + rs.getInt("quantity")
                );
            }


            con.close();

        } catch (SQLException e) {

            System.out.println(
                    "Error: "
                            + e.getMessage()
            );
        }
    }
}
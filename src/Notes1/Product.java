package Notes1;
public class Product {
    // Constructor - Runs every time we create a new object and instantiate it in the main
    // Product() {
    //     System.out.println("Product Created");
    // }

    // GLOBAL variables - Different from the parameters in constructor
    String name;
    float price;

    // 'this' refers to the class itself
    // Constructor - Makes instantiation easier/faster
    Product(String name, float price) { // Parameters here are LOCAL variables
        this.name = name;  // Assigns parameters to global variables
        this.price = price;

        System.out.println(name + " Created");
    }
}
//zadanie 5 i 6
package restOfPackages;

public class Product {
    private String name;
    private double price;
    private static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 3;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        if (numberOfProducts >= MAX_PRODUCTS){
            throw new IllegalStateException("Osiagnieto maksymalna liczbe produktow.");
        }
        numberOfProducts++;
    }

    public static int getNumberOfProducts(){
        return numberOfProducts;
    }
}

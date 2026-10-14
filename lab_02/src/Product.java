public class Product {

    String name;
    double price;

    public Product(String name, double price) { //nie powinno byc void to jest konstruktor
        this.name = name; //brak this.
        this.price = price; //brak this.
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}
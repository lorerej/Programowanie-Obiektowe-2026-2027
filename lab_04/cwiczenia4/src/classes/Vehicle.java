package classes;

public class Vehicle {

    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showInformation(){
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
    }
}

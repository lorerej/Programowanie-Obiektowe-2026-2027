package classes;

public class Device {
    private String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void showInformation(){
        System.out.println("Manufacturer: " + manufacturer);
    }
}

import java.sql.SQLOutput;

public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car() {
        this("unknown", "unknown", 0000, 0);
    }

    public Car(String model, String brand) {
        this(model, brand, 0000, 0);
    }

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }

    public void drive(double distance){
        if (distance > 0) mileage += distance;
    }

    public void showInformation(){
        System.out.printf("Marka: %s, model: %s, rok_produkcji: %d, przebieg: %.2f \n", brand, model, productionYear, mileage);
    }
}

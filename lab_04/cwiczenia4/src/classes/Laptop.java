package classes;

public class Laptop extends Computer{
    private int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("batteryCapacityWh: " + batteryCapacityWh);
    }
}

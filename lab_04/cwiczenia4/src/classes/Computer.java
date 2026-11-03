package classes;

public class Computer extends Device{
    private int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Ram in gb: " + ramGb);
    }
}

//zadanie 9
package restOfPackages;

public class InitializationDemo {
    private static int counter = 0;
    private String text;

    static {
        System.out.println("Zainicjalizowano statycznie obiekt");
    }

    {
        System.out.println("Zainicjalizowano instancyjnie obiekt");
    }

    public InitializationDemo(String text) {
        System.out.println("Uzyto konstruktora");
        counter++;
        this.text = text;
    }

    public static int getCounter() {
        return counter;
    }
}

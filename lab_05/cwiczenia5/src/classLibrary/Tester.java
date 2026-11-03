package classLibrary;

public class Tester extends Employee{
    public Tester(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 1000.00;
    }
}

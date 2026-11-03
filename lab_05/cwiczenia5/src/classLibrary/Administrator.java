package classLibrary;

public class Administrator extends Employee{
    public Administrator(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 5000.00;
    }
}

package classLibrary;

public class Developer extends Employee{
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 2000.00;
    }
}

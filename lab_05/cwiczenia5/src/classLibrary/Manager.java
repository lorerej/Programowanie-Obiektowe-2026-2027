package classLibrary;

public class Manager extends Employee{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 3000.00;
    }
}

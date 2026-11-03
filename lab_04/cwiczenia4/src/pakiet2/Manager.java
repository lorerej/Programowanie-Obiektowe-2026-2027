package pakiet2;

public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, String position, String department) {
        super(firstName, lastName, position);
        this.department = department;
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("dział zarządzany przez kierownika: " + department);
    }
}

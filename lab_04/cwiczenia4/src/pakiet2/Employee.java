package pakiet2;

import classes.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void displayData(){
        System.out.println("Imie: " + getFirstName());
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pozycja: " + position);
    }

    public void showInformation(){
        System.out.println("Imie: " + getFirstName());
        System.out.println("Nazwisko: " + lastName);
    }
}
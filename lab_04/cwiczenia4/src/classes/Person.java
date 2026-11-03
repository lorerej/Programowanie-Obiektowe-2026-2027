package classes;
/*
public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
 */

//zadanie 11
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void showInformation() {
        System.out.println(
                "Person: " + this.name
        );
    }
}


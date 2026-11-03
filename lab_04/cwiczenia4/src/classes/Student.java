package classes;
//zadanie 11
public class Student extends Person {

    private int albumNumber;

    //brak super() i String name w konstruktorze
    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }
    //brak @Override

    @Override
    public void showInformation() {
        //brak super() w zwiazku z poprzednim brakiem @Override
        super.showInformation();
        System.out.println(
                "Numer albumu: " + albumNumber
        );
    }
}

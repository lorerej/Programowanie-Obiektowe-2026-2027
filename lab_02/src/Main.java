import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        //Zadanie 1
        Dog dog1 = new Dog("Snickers", "Owczarek Niemiecki", 6);
        Dog dog2 = new Dog("Franek", "Owczarek Niemiecki", 7);

        dog1.bark();
        dog1.showInformation();
        dog2.bark();
        dog2.showInformation();

        //Zadanie 2
        Point point1 = new Point(2, 0);
        Point point2 = new Point(2, -2);
        Point point3 = new Point(7, -5);
        point1.distance(point2);
        point2.distance(point3);

        //Zadanie 3
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "J.K.Rowling");
        Book book3 = new Book("Harry Potter 2", "J.K.Rowling", 2000);

        //Zadanie 4
        Car car1 = new Car("Opel", "Astra", 2008, 700135);
        Car car2 = new Car("Volkswagen", "Sharan");

        car1.showInformation();
        car2.showInformation();
        car1.drive(10.52);
        car2.drive(987122);
        car1.showInformation();
        car2.showInformation();

        Car original = new Car("Mitsubishi", "Asx", 2001, 150000);
        Car copy = new Car(original);

        original.showInformation();
        copy.showInformation();
        original.drive(20);
        original.showInformation();
        copy.showInformation();
        //Zadanie 5
        //Drugi obiekt nie zostal zmieniony poniewaz konstruktor uruchamia sie tylko raz dla kazdego obiektu

        //Zadanie 6 i 7
        Person first = new Person("Anna");
        //Person second = first;
        Person second = new Person(first);
        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();

        //Postały 1 obiekt klasy Person, 2 referencje, ponieważ jest to referencja a niżeli sam obiekt
        //Roznica jest taka, ze  w pierwszym przyadku mamy doczynienia z referencja a druga z kopi obiektu, gdzie utwarzany jest nowy obiekt na podstawie drugiego

        //Zadanie 8
        Counter counter1 = new Counter(2);
        Counter counter2 = new Counter(6);

        counter1.printCounter();
        counter2.printCounter();
        counter1.increaseOther(counter2);
        counter1.printCounter();
        counter2.printCounter();
        counter2.increaseOther(counter2);
        counter1.printCounter();
        counter2.printCounter();
        counter2.increaseOther(counter1);
        counter1.printCounter();
        counter2.printCounter();

        //poniewaz obiekty sa przekazywane jako referencja
        //Zadanie 9
        Car car = null;
        //wyskoczy error?
        if (car != null) car.showInformation();
        //Zadanie 10
        Box a = new Box(10); // a = 10
        Box b = a; // a i b to to samo(referencja) a i b = 10
        Box c = new Box(a.value); // c = 10

        b.value = 20; // a i b = 20
        c.value = 30; // c = 30

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b); // true
        System.out.println(a == c); // false

        //Schemat wyglada tak: a i b są referencją do obiektu nr 1. c jest referencją do obiektu nr.2

        //Zadanie 11
        Product product =
                new Product("Monitor", 1200);

        product.show();

        //nie kompilowal sie poniewaz zamiast konstruktora byla metoda
        //this odnosi sie do referencji dla biezacego obiektu

        //Zadanie 12 - Uproszczona struktura mojej klasy biblioteka z pierwszych ćw lab, bez logiki sprawdzania poprawnosci danych, nulli itd

        Biblioteka biblioteka1 = new Biblioteka();
        Ksiazka ksiazka1 = new Ksiazka("Harry Potter", "J.K. Rowling", 122132414, 2004);
        Ksiazka ksiazka2 = new Ksiazka("Wladca Pierscieni", "Tolkien", 123456, 1954);
        Czytelnik czytelnik1 = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik czytelnik2 = new Czytelnik("Adam", "Malysz", 2);

        biblioteka1.dodajCzytelnika(czytelnik1);
        biblioteka1.dodajCzytelnika(czytelnik2);
        biblioteka1.dodajKsiazke(ksiazka1);
        biblioteka1.dodajKsiazke(ksiazka2);

        ksiazka1.pokazDaneKsiazki();
        czytelnik1.pokazDaneCzytelnika();

        Wypozyczenie wypozyczenie1 = new Wypozyczenie("12.10.2026", "14.10.2026", ksiazka2, czytelnik2);

        wypozyczenie1.pokazSzczegoly();

        //Zadanie dodatkowe
        Rectangle rectangle1 = new Rectangle(4);
        Rectangle rectangle2 = rectangle1;
        Rectangle rectangle3 = new Rectangle(rectangle2);

        rectangle1.scale(2.5);

        System.out.println("Prostokat 1: Pole - " + rectangle1.area() + ", Obwod - " + rectangle1.perimeter()); //Referencja do 1 obiektu ktoremu zmieniamy skalowanie na 2.5, w zwiazku z czym zmieni sie jego pole i obwod
        System.out.println("Prostokat 2: Pole - " + rectangle2.area() + ", Obwod - " + rectangle2.perimeter()); //Referencja do tego samego obiektu co 1, w zwiazku z czym kazda zmiana tamtego obiektu bedzie widoczna rowniez tutaj
        System.out.println("Prostokat 3: Pole - " + rectangle3.area() + ", Obwod - " + rectangle3.perimeter()); //Nowy obiekt na podstawie kopii pierwszego obiektu tzn wysokosc i szerokosc pozostaje taka sama
    }
}
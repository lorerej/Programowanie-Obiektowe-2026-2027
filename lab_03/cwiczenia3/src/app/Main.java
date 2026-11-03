//zadanie 1
import animals.Cat;
import animals.Dog;
//Zadanie 2
import restOfPackages.*;
//Zadanie 4
//zadanie 5


void main(String[] args) {
    //zadanie 1
    Dog dog = new Dog("Pies", 7);
    Cat cat = new Cat("Kot", 5);
    dog.makeSound();
    cat.makeSound();

    //zadanie 4
    int[] wynikiEgzaminu = new int[]{2, 1 , 5 , 3, 5, 4};
    ExamResults examResults = new ExamResults(wynikiEgzaminu);
    int[] result = examResults.getPoints();
    wynikiEgzaminu[0] = 5;
    result[0] = 1;
    for(int grade:result){
        System.out.print(grade + " ");
    }
    //odpowiedz 1 i 2: zmiana oryginalnej i otrzymanej z getPoints() tablicy wplywa na obiekt
    //po zastosowaniu kopi defensywnej jedynie zmiana w obiekcie otrzymanym przez getPoints() wplywa na zmiane

    //zadanie 5
    Product product = new Product("Cebula", 2.34);
    System.out.println("\nLiczba produktow: " + Product.getNumberOfProducts());
    Product product2 = new Product("Kartofel", 1.14);
    System.out.println("Liczba produktow: " + Product.getNumberOfProducts());
    Product product3 = new Product("Marchew", 1.74);
    System.out.println("Liczba produktow: " + Product.getNumberOfProducts());
    //Product product4 = new Product("Jablko", 1.74); //Dodanie tego produktu wywola IllegalStateException() z powodu uzyskania maksymalej liczby produktow
    //Odpowiedzi: powinno byc static poniewaz obiekt nie powinien miec do tego dostepu, powinno byc final poniewaz nie moze podlegac ta wartosc zmianie, nie powinno byc final poniewaz chcemy aby wartosc sie zmienila

    //Zadanie 7
    StaticCalculator.add(2, 3);
    System.out.println("Liczba kalkulacji: " + StaticCalculator.getNumberOfOperations());
    StaticCalculator.subtract(2, 3);
    System.out.println("Liczba kalkulacji: " + StaticCalculator.getNumberOfOperations());
    StaticCalculator.multiply(2, 3);
    System.out.println("Liczba kalkulacji: " + StaticCalculator.getNumberOfOperations());

    //Zadanie 8
    StaticCalculator.add(2, 3, 5);
    StaticCalculator.add(2.5, 2.1);
    StaticCalculator.add(1, 2);

    //zadanie 9
    InitializationDemo initializationDemo1 = new InitializationDemo("test 1");
    InitializationDemo initializationDemo2 = new InitializationDemo("test 2");
    System.out.println(InitializationDemo.getCounter());

    //statycznie, instancyjnie, konstruktor, instancyjnie, konstruktor

    //zadanie 10
    /*
    1. studentName w klasie Student, - instancyjny, da kazdego obiektu powinna byc inna nazwa
    2. numberOfStudents w klasie Student, - statyczny, liczba zmienia sie dla klasy a nie dla obiektu
    3. PI w klasie matematycznej, - statyczny, liczba nie powinna ulegac zmianie, w dodatku powinna miec final
    4. balance w klasie BankAccount, - instancyjny, balans dla kazdego obiektu powinien byc inny
    5. calculateVat(double price) w bezstanowej klasie pomocniczej, - statyczny, ta metoda nie wymaga wartosci z obiektu
    6. carMileage w klasie Car, - instancyjny, kazdy samochod powinien miec inny przebieg
    7. MAX_LOGIN_ATTEMPTS w klasie LoginPolicy. - statystycznie, w dodatku powinno miec final bo nie powinno ulegac zmianie
     */

    //Zadanie dodatkowe
    /*
    problemem był getter, który pozwalał zmieniać dane wewnątrz klasy
    public String[] getMembers() {
        return this.members;
    }
    zamiast tego gettera powinien on przekazywać kopię defensywną
    public String[] getMembers() {
        return Arrays.copyOf(this.members, this.members.length);
    }
    zarówno oprocz gettera identyczny problem miał konstruktor, który po zmianie powinien wyglądać w następujący sposób
    public Team(String name, String[] members) {
        this.name = name;
        this.members = Arrays.copyOf(members, members.length);
    }
     */
}
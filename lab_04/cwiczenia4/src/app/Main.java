package app;
import pakiet2.*;
import classes.*;

public class Main {
    public static void main(String[] args) {
        //zadanie 1
        Employee employee = new Employee("Kuba", "Krawczyk", "employee");
        employee.displayData();

        /*
        Odp 1: poniewaz klasa employee nie ma do niego dostepu
        Odp 2: poniewaz protected umozliwia podklasom dostep do niego
        Odp 3: Nie
         */

        //zadanien 3
        Car car = new Car("Opel", "Astra", 5);
        car.showInformation();

        //zadanie 4
        C c = new C();

        //kolejnosc: a,b,c

        //zadanie 5
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        //zadanie 6
        Manager manager = new Manager("Adam", "Malysz", "manager", "food");
        manager.showInformation();
        employee.showInformation();

        //zadanie 7
        Laptop laptop = new Laptop("lENOVO", 16, 8);
        laptop.showInformation();

        //zadanie 8
        Book book = new Book("Harry Potter", "Jk rowling", 2002);
        System.out.println(book);
        System.out.println(book.getClass());

        //zadanie dodatkowe
        /*
        Car extends Engine - lepszym rozwiazaniem byloby utworzyc klase Vehicle i wtedy zrobic Engine extends Vehicle albo pole engine, jezeli juz utrzymujemy sie przy klasie Car to i tak powinno byc na odwrot Engine extends Car
        Dog extends Animal - ok
        Library extends Book - biblioteka powinna zawierac w sobie liste ksiazek a nie po nich dziedziczyc
        Manager extends Employee - ok
        House extends Address - klasa dom powinna miec w sobie pole z adresem a nie go dziedziczyc
        ElectricCar extends Car - Ok
         */
    }
}
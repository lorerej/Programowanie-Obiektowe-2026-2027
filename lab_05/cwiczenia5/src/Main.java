import classLibrary.*;

class Parent {
    String value = "Parent";

    String getValue() {
        return "Parent";
    }
}

class Child extends Parent {
    String value = "Child";

    @Override
    String getValue() {
        return "Child";
    }
}

public class Main {
    //zadanie 3
    /*
    Dlaczego nie potrzebujemy trzech różnych metod present()?
    Dzięki polimorfizmowi i temu, że obiekty Dog Cat i Cow są jednocześnie obiektami klasy Animal
     */
    public static void present(Animal animal){
        System.out.println("Obiekt: " + animal);
        animal.makeSound();
    }

    public static void specialAction(Animal animal){
        if (animal instanceof Dog dog) { dog.digHole(); }
        if (animal instanceof Cat cat) { cat.climb(); }
    }

    //przy starej wersji funkcja wymagala dodania kolejnych warunkow if/if else, ta wersja tego nie wymaga
    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        /*
        1. Jaki jest typ referencji first?
        first:Animal
        2. Jaki jest rzeczywisty typ obiektu?
        Dog
        3. Która wersja makeSound() zostanie wykonana?
        danego typu
        4. Czy przez first można wywołać metodę występującą wyłącznie w Dog?
        nie
         */

        /*
        Animal first = new Dog("A");
        Animal second = new Cat("B");
        first.makeSound();
         */
        Animal animals[] = {new Dog("C"), new Cat("D"), new Cow("E"), new Sheep("F")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

        present(new Dog("A"));
        present(new Cat("A"));
        present(new Cow("A"));

        //zadanie 4
        Employee[] employees = {
                new Developer("Adam", 500),
                new Tester("Milosz", 1500),
                new Manager("Jakub", 1000)
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }

        //zadanie 5
        /*
        Dog dog = new Dog("Albert");
        Animal animal = dog;
        //dog może wywolac makeSound() i animal() moze wywolac makeSound()
        //Czy upcasting tworzy nowy obiekt? - Nie

        dog.makeSound();
        animal.makeSound();

        dog.setName("Filip");
        System.out.println(animal.getName());
         */
        Animal first = new Dog("Pies");
        Animal second = new Cat("Kot");

        if (first instanceof Dog) {
            Dog dog = (Dog) first;
            dog.digHole();
        }

        if (second instanceof Cat) {
            Cat cat = (Cat) second;
            cat.climb();
        }

        //zostanie zwrocony wyjatek:  class classLibrary.Cat cannot be cast to class classLibrary.Dog
        /*
        Dog dog = (Dog) second;
        dog.digHole();
         */

        specialAction(first);
        specialAction(second);

        //zadanie 9
        Parent object = new Child();

        System.out.println(object.value); // parent
        System.out.println(object.getValue()); // child

        //metody są polimorficzne a zmienne/pola nie

        //zadanie 10
    }
}

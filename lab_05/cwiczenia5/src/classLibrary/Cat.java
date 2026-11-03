package classLibrary;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    public void climb(){
        System.out.println("Cat climbs!");
    }
}

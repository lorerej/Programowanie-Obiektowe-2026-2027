package classLibrary;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void digHole(){
        System.out.println("Dog digs a hole!");
    }
}

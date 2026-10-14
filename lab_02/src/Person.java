public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other){
        this.name = other.name;
    }

    public void introduceYourself(){
        System.out.println("Hi, my name is " + name);
    }
}

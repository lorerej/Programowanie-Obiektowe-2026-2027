public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println("Wow Wow");
    }

    public void showInformation(){
        System.out.printf("Imie: %s, rasa: %s, wiek: %d \n", name, breed, age);
    }
}

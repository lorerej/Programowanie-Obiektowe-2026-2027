//zadanie 2
package restOfPackages;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Nazwa nie może być pusta");
        }

        if (age < 0 || age > 150){
            throw new IllegalArgumentException("Wiek musi byc w przedziale 0 do 150");
        }

        if (!email.contains("@")){
            throw new IllegalArgumentException("Email musi zawierać znak @");
        }

        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) this.email = email;
    }
}
//Nie, pole age nie musi posiadać settera, moglibyśmy np kalkulować je po dacie urodzenia
//podobnie pole name, moglibysmy je po prostu podac w konstruktorze, gdyz prawdopodobnie nie zmienimy jego drugi raz


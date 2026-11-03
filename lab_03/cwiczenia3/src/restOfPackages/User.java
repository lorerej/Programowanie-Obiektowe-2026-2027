package restOfPackages;

public class User {

    //2. wszystkie pola byly publiczne
    private String login;
    private String password;
    private int age; //2. i 3. pole age nie powinno byc zarowno dla klasy jak i obiektu, powinnismy zrobic je instancyjne a nie statyczne

    public User(
            String login,
            String password,
            int age
    ) {
        if (age < 0){
            throw new IllegalArgumentException("Wiek musi byc w przedziale 0 do 150");
        }
        this.login = login;
        this.password = password;
        this.age = age; //2. i 3. zamiast User.age = age; powinno byc this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){ this.age = age;}
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //haslo nie powinno miec zwyklego gettera z powodu potencjalnych wyciekow danych, najpierw powinno byc szyfrowane a dopiero pozniej etn szyfr powinien byc przesylany przez getter

    public void showUser() { //metoda powinna byc instancyjna i nie powinna wypisywac hasla
        System.out.println(
                "Login: " + login //1.Non-static field 'login' cannot be referenced from a static context
                        + ", hasło: " + password //1.Non-static field 'password' cannot be referenced from a static context
                        + ", wiek: " + age
        );
    }
}
package Uzytkownicy;

public class Account {
    private String login;
    private String password;
    protected double balance;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void displayLoginCredentials(){
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("Saldo: " + balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}

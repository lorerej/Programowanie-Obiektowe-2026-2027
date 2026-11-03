package Uzytkownicy;

public class StandardAccount extends Account{
    private String bankName;

    public StandardAccount(String login, String password, String bankName) {
        super(login, password);
        this.bankName = bankName;
    }

    @Override
    public void displayLoginCredentials(){
        super.displayLoginCredentials();
        System.out.println("Bank: " + bankName);
    }
}

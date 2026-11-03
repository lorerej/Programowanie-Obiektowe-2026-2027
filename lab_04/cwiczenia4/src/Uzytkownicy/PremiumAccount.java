package Uzytkownicy;

public class PremiumAccount extends StandardAccount{
    private double cost;

    public PremiumAccount(String login, String password, String bankName, double cost) {
        super(login, password, bankName);
        this.cost = cost;
    }

    @Override
    public void displayLoginCredentials() {
        super.displayLoginCredentials();
        System.out.println("Cost of the account: " + cost);
    }
}

package Uzytkownicy;

public class AdministratorAccount extends Account{
    private int adminLvl;

    public AdministratorAccount(String login, String password, int adminLvl) {
        super(login, password);
        this.adminLvl = adminLvl;
    }

    public int getAdminLevel() {
        return adminLvl;
    }
}

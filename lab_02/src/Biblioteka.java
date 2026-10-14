import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    public List<Czytelnik> czytelnicy;
    public List<Ksiazka> ksiazki;
    public List<Wypozyczenie> wypozyczenia;

    public Biblioteka(){
        this.czytelnicy = new ArrayList<>();
        this.ksiazki = new ArrayList<>();
        this.wypozyczenia = new ArrayList<>();
    }

    public void dodajCzytelnika(Czytelnik czytelnik){
        this.czytelnicy.add(czytelnik);
    }
    public void dodajKsiazke(Ksiazka ksiazka){
        this.ksiazki.add(ksiazka);
    }
    public void dodajWypozyczenie(Wypozyczenie wypozyczenie){
        this.wypozyczenia.add(wypozyczenie);
    }

}

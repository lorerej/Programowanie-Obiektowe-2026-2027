public class Wypozyczenie {
    String data_wypozyczenia;
    String data_zwrotu;
    Ksiazka ksiazka;
    Czytelnik czytelnik;

    public Wypozyczenie(String data_wypozyczenia, String data_zwrotu, Ksiazka ksiazka, Czytelnik czytelnik) {
        this.data_wypozyczenia = data_wypozyczenia;
        this.data_zwrotu = data_zwrotu;
        this.ksiazka = ksiazka;
        this.czytelnik = czytelnik;
    }

    public void pokazSzczegoly(){
        System.out.println("Data wypozyczenia: " + data_wypozyczenia + " data zwrotu: " + data_zwrotu);
        ksiazka.pokazDaneKsiazki();
        czytelnik.pokazDaneCzytelnika();
    }
}

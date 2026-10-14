public class Czytelnik {
    String imie;
    String nazwisko;
    int nr_karty_bibliotecznej;

    public Czytelnik(){
        this("unknown", "unknown", 0);
    }

    public Czytelnik(String imie, String nazwisko, int nr_karty_bibliotecznej) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_karty_bibliotecznej = nr_karty_bibliotecznej;
    }

    public void pokazDaneCzytelnika(){
        System.out.printf("Imie: %s, nazwisko: %s, nr_karty_bibliotecznej: %d\n", imie, nazwisko, nr_karty_bibliotecznej);
    }
}

public class Ksiazka {
    String tytul;
    String autor;
    int isbn;
    int rok_wydania;

    public Ksiazka(){
        this("unknown", "unknown", 0, 0);
    }

    public Ksiazka(String tytul, String autor, int isbn, int rok_wydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.isbn = isbn;
        this.rok_wydania = rok_wydania;
    }

    public void pokazDaneKsiazki(){
        System.out.printf("Tytul: %s, autor: %s, isbn: %d, rok_wydania: %d \n", tytul, autor, isbn, rok_wydania);
    }
}

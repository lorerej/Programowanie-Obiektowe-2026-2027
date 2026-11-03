//zadanie 12
package restOfPackages;

public class Student {
    private String name;
    private int albumNumber;

    public Student(String name, int albumNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Imie i nazwisko nie moze byc puste.");
        }
        if (albumNumber <= 0) {
            throw new IllegalArgumentException("Numer albumu musi byc dodatni.");
        }
        this.name = name;
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(int albumNumber) {
        if (albumNumber > 0 ){
            this.albumNumber = albumNumber;
        }
    }
}

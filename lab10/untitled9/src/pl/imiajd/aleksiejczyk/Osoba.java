import java.lang.Comparable;
import java.lang.Cloneable;
import java.time.LocalDate;
package pl.imiajd.aleksiejczyk;

public class Osoba implements Cloneable, Comparable {
    private LocalDate rokUrodzenia;
    private String nazwisko;

    Osoba(String nazwisko, LocalDate rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    LocalDate getRokUrodzenia() {
        return rokUrodzenia;
    }

    String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba)) return false;
        Osoba osoba = (Osoba) o;
        return rokUrodzenia.equals(osoba.rokUrodzenia) && nazwisko.equals(osoba.nazwisko);
    }
    public int compareTo(Osoba other) {
        int rok = this.nazwisko.compareTo(other.nazwisko);
        if (rok != 0) return rok;
        return this.rokUrodzenia.compareTo(other.rokUrodzenia);
    }
    @Override
    public String toString() {
        return "Osoba" +
                "[rokUrodzenia=" + rokUrodzenia +
                "], [nazwisko='" + nazwisko + '\'' +
                ']';
    }
}

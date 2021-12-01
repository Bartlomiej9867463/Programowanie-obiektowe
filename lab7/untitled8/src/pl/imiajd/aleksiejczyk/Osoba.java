package pl.imiajd.aleksiejczyk;

public class Osoba {
    private  int rokUrodzenia;
    private  String nazwisko;
    Osoba(String nazwisko, int rokUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }
    int getRokUrodzenia(){return rokUrodzenia;}
    String getNazwisko(){return nazwisko;}
    public String toStirng(){
        return nazwisko + " " + rokUrodzenia;
    }
    public static class Student extends Osoba {
        private String kierunek;

        Student(int rokUrodzenia, String nazwisko, String kierunek) {
            super(nazwisko,rokUrodzenia);
            this.kierunek = kierunek;
        }
        String getKierunek(){return kierunek;}
        //String getnazwisko(){return super.nazwisko;}
        //int getRokUrodzenia(){return super.rokUrodzenia;}

        public String toStirng(){
            return super.nazwisko + " " + super.rokUrodzenia+ " " + kierunek;
        }

    }

    public static class Nauczyciel extends Osoba {
        private int pensja;

        Nauczyciel(int rokUrodzenia, String nazwisko, int pensja) {
            super(nazwisko,rokUrodzenia);
            this.pensja = pensja;
        }
        int getPensja(){return pensja;}
        public String toStirng(){
            return super.nazwisko + " " + super.rokUrodzenia+ " " + pensja;
        }

    }
    }
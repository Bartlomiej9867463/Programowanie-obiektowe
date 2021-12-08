import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        String[] imi1 = new String[] {"Jan", "Pawel", "Janusz"};
        String[] imi2 = new String[] {"Janina", "Paulina"};
        Osoba[] ludzie = new Osoba[2];
        ludzie[0] = new Pracownik("Kowalski",imi1,LocalDate.of(2020, 1, 8),true,2137,LocalDate.of(2021, 1, 8));
        ludzie[1] = new Pracownik("Nowak",imi2,LocalDate.of(2000, 1, 8),false,5674,LocalDate.of(2018, 1, 8));
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona=imiona;
        this.dataUrodzenia=dataUrodzenia;
        this.plec=plec;
    }

    public abstract String getOpis();
    public String[] Imiona()
    {
        return imiona;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public java.time.LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }
    public boolean getplec(){
        return plec;
    }
    private String nazwisko;
    private String[] imiona;
    private java.time.LocalDate dataUrodzenia;
    private boolean plec;

}

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko,String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec, double pobory, java.time.LocalDate dataZatrudnienia)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.pobory = pobory;
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }
    public java.time.LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }
    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
    private java.time.LocalDate dataZatrudnienia;
}


class Student extends Osoba
{
    public Student(String nazwisko,String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.sredniaOcen= sredniaOcen;
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getSredniaOcen()
    {
        return sredniaOcen;
    }
    public void setSredniaOcen(double Srednia)
    {
        this.sredniaOcen = Srednia;
    }

    private String kierunek;
    private double sredniaOcen;
}
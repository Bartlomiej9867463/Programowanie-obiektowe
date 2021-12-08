package pl.imiajd.Aleksiejczyk;

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
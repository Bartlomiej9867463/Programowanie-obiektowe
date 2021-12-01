package pl.imiajd.aleksiejczyk;
import java.awt.Rectangle;

public class Main {

    public static void main(String[] args){
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();
        punkt b = new punkt(3, 5);
        b.show();
        punkt c = new NazwanyPunkt(3,6,"Tawerna");
        c.show();
        a = (NazwanyPunkt) c;
        a.show();
        Adres a1 = new Adres(12655,"Olsztyb",1,"olsztnsa");
        a1.pokaz();
        Adres a2 = new Adres(12656,"poznan",2,"2","xinska");
        a2.pokaz();
        System.out.println(Adres.przed(a2.kod_pocztowy(),a1.kod_pocztowy()));
        System.out.println(Adres.przed(a1.kod_pocztowy(),a2.kod_pocztowy()));
        Osoba.Student s1 = new Osoba.Student(1992,"kowalski","filozofia");
        Osoba.Nauczyciel n1 = new Osoba.Nauczyciel(1992,"nowak",1450);
        System.out.println(s1.toStirng());
        System.out.println(n1.toStirng());
        System.out.println(n1.getNazwisko());
        System.out.println(s1.getNazwisko());
        BetterRectangle t1 = new BetterRectangle(1,4,10,53);
        System.out.println(t1.toStirng());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());





    }
}

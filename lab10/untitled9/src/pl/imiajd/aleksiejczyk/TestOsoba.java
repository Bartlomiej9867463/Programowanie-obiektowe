package pl.imiajd.aleksiejczyk;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] grupa = new Osoba[5];
        grupa[0]= new Osoba("Kowalski",LocalDate.of(2020, 1, 8));
        grupa[1]= new Osoba("Nowak",LocalDate.of(2020, 1, 8));
        grupa[2]= new Osoba("Malinowski",LocalDate.of(2022, 1, 8));
        grupa[3]= new Osoba("Malinowski",LocalDate.of(2022, 1, 8));
        grupa[4]= new Osoba("Aleksiejczyk",LocalDate.of(1998, 8, 10));
        System.out.println(grupa[0].compareTo(grupa[1]));
        ArrayList<Osoba> Osoby = new ArrayList<Osoba>();
        Osoby.add((Osoba) grupa[0]);
        Osoby.add((Osoba) grupa[3]);
        Osoby.add((Osoba) grupa[1]);
        Osoby.add((Osoba) grupa[4]);
        Osoby.add((Osoba) grupa[2]);
        for(Osoba I:Osoby){
            System.out.println(I);
        }
        System.out.println("_____________________");
        Osoby.sort(Comparator.naturalOrder());
        for(Osoba I:Osoby){
            System.out.println(I);
        }
    }
}

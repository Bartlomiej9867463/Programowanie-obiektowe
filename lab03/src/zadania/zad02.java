package zadania;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad02
{
    public static void main (String[] args) {
        int n = 5;
        int[] lista = new int[n];
        generuj(lista,n,-999,999);
        wypisz(lista);
        System.out.println(ileNieparzystych(lista));
        System.out.println(ileParzystych(lista));
        System.out.println(ileDodatnich(lista));
        System.out.println(ileUjemnych(lista));
        System.out.println(ileZerowych(lista));
        System.out.println(ileMaksymalnych(lista));
        System.out.println(dlugoscMaksymalnegoCiaguDanych(lista));
        odwroc(lista);


    }
    public static void generuj (int[] tab,int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            tab[i] = r.nextInt(maxWartosc-minWartosc) + minWartosc;
        }
    }

    public static void wypisz(int[] tab) {
        for (int el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }
    public static int ileNieparzystych(int tab[]){
        int nieparzyste=0;
        for (int liczba : tab) {
            if(liczba%2!=0)
                nieparzyste++;
        }
        return nieparzyste;
    }
    public static int ileParzystych(int tab[]){
        int parzyste=0;
        for (int liczba : tab) {
            if(liczba%2==0)
                parzyste++;
        }
        return parzyste;
    }
    public static int ileDodatnich(int tab[]){
        int dodatnie=0;
        for (int liczba : tab) {
            if(liczba>0)
                dodatnie++;
        }
        return dodatnie;
    }
    public static int ileUjemnych(int tab[]){
        int ujemne=0;
        for (int liczba : tab) {
            if(liczba<0)
                ujemne++;
        }
        return ujemne;
    }
    public static int ileZerowych(int tab[]){
        int zerowe=0;
        for (int liczba : tab) {
            if(liczba==0)
                zerowe++;
        }
        return zerowe;
    }
    public static int ileMaksymalnych(int tab[]){
        int zliczacz=0;
        int najwiekszy=tab[0];
        for (int liczba : tab) {
            if(liczba>najwiekszy) {
                najwiekszy = liczba;
                zliczacz = 0;
            }
            if(liczba==najwiekszy) {
                zliczacz++;
            }
        }
        return zliczacz;
    }
    public static int sumaDodatnich(int tab[]){
        int sumadodatnie=0;
        for (int liczba : tab) {
            if(liczba>0)
                sumadodatnie+=liczba;
        }
        return sumadodatnie;
    }
    public static int sumaUjemnych(int tab[]){
        int sumaujemne=0;
        for (int liczba : tab) {
            if(liczba<0)
                sumaujemne+=liczba;
        }
        return sumaujemne;
    }
    public static int dlugoscMaksymalnegoCiaguDanych(int tab[]){
        int sumaujemne=0;
        int ciagdodatnich=0;
        int najdluszyciagdodatnich=0;
        for (int liczba : tab) {
            if(liczba>0) {
                ciagdodatnich++;
                if(ciagdodatnich>najdluszyciagdodatnich)
                    najdluszyciagdodatnich=ciagdodatnich;
            }
            if(liczba<=0) {
                ciagdodatnich=0;
            }
        }
        return najdluszyciagdodatnich;
    }
    public static void signum(int tab[]){
        int sumaujemne=0;
        int n=0;
        for (int liczba : tab) {
            n++;
        }
        for (int j=0; j<n;j++) {
            if(tab[j]>=0)
                tab[j] =1;
            if(tab[j]<0)
                tab[j] =-1;
        }
    }
    public static void odwroc(int tab[]){
        Scanner in = new Scanner(System.in);
        int sumaujemne=0;
        int n=0;
        for (int liczba : tab) {
            n++;
        }
        int lewy = 0;
        int prawy=0;
        for (int liczba : tab) {
            System.out.println(liczba + " ");
        }


        while((lewy<1)||(lewy>=n   ))
        {
            System.out.print("Podaj wartosc lewy: ");
            lewy = in.nextInt();
        }
        while((prawy<1)||(prawy>=n )||(prawy<lewy))
        {
            System.out.print("Podaj wartosc prawy: ");
            prawy = in.nextInt();
        }
        for (int j=0; (j<((prawy-lewy))-1);j++) {
            System.out.println(tab[lewy+j-1]);
            System.out.println(tab[prawy-j-1]);
            int buforek = tab[lewy+j-1];
            tab[lewy+j-1] = tab[prawy-j-1];
            tab[prawy-j-1]=buforek;
        }
        for (int liczba : tab) {
            System.out.println(liczba + " ");
        }
    }
}

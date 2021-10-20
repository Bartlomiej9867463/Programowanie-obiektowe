package zadania;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class zad01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=101;
        while((n>100)||(n<1))
        {
            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            tab[i] = r.nextInt(1998) - 999;
        }
        int parzyste = 0;
        int nieparzyste = 0;
        int zerowe=0;
        int dodatnie=0;
        int ujemne=0;
        int najwiekszy=tab[0];
        int zliczacz=0;
        int sumaujemnych=0;
        int sumadodatnich=0;
        int ciagdodatnich=0;
        int najdluszyciagdodatnich=0;
        for (int liczba : tab) {
            System.out.println(liczba + " ");
        }
        for (int liczba : tab) {
            if(liczba%2==0)
                parzyste++;
            else
                nieparzyste++;
            if(liczba==0)
                zerowe++;
            if(liczba>0) {
                sumadodatnich+=liczba;
                ciagdodatnich++;
                dodatnie++;
                if(ciagdodatnich>najdluszyciagdodatnich)
                    najdluszyciagdodatnich=ciagdodatnich;
            }
            if(liczba<0) {
                ujemne++;
                ciagdodatnich=0;
                sumaujemnych += liczba;
            }
            if(liczba>najwiekszy) {
                najwiekszy = liczba;
                zliczacz = 1;
            }
            if(liczba==najwiekszy) {
                zliczacz++;
            }
        }
        for (int j=0; j<n;j++) {
            if(tab[j]>=0)
                tab[j] =1;
            if(tab[j]<0)
                tab[j] =-1;
        }
        System.out.println("Tablica z jedynek i minus jedynek");
        for (int liczba : tab) {
                System.out.println(liczba + " ");
            }
            System.out.println("Ilość liczb parzystych: " + parzyste);
            System.out.println("Ilość liczb nieparzystych: " + nieparzyste);
            System.out.println("Ilość liczb zerowych: " + zerowe);
            System.out.println("Ilość liczb dodatnich: " + dodatnie);
            System.out.println("Ilość liczb ujemnych: " + ujemne);
            System.out.println("Najwiekszy element: " + najwiekszy);
            System.out.println("Ilość elementow najwiekszych: " + zliczacz);
            System.out.println("Suma elementow ujemnych: " + sumaujemnych);
            System.out.println("Suma elementow dodatnich: " + sumadodatnich);
            System.out.println("najdluzszy ciag elementow dodatnich: " + najdluszyciagdodatnich);




    }
}
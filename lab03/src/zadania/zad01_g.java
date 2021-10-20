package zadania;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class zad01_g {

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
        int lewy = 0;
        int prawy=0;
        for (int liczba : tab) {
            System.out.println(liczba + " ");
        }


        while((lewy<1)&&(lewy>=n   ))
        {
            System.out.print("Podaj wartosc lewy: ");
            lewy = in.nextInt();
        }
        while((prawy<1)&&(prawy>=n   ))
        {
            System.out.print("Podaj wartosc prawy: ");
            prawy = in.nextInt();
        }
        for (int j=0; j<(prawy-lewy)&&((prawy-lewy)>0);j++) {
        }

        }
    }
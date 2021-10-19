package zadania;
import java.util.Scanner;
import java.lang.Math;
public class zad01_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe naturalna");
        int n = in.nextInt();

        System.out.println("Podaj " + n + " liczb rzeczywistych");
        //double x = in.nextDouble();

        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
            double x = in.nextDouble();
            list[i] = x;
            System.out.print(list[i] + " ");
        }
        System.out.println();
        //PODPUNKT A
        double wynik = 0;
        for (double y : list) {
            wynik = wynik + y;
        }
        System.out.println("Suma: " + wynik);
        // PODPUNKT B

        wynik = list[0];
        for (int i = 1; i < n; i++) {
            wynik = wynik * list[i];
        }
        System.out.println("Iloczyn: " + wynik);
        // PODPUNKT C
        wynik = 0;
        for (double y : list) {
            wynik = wynik + Math.abs(y);
        }
        System.out.println("Suma absolutna: " + wynik);
        // PODPUNKT D
        wynik = 0;
        for (double y : list) {
            System.out.println(Math.sqrt(Math.abs(y)));
            wynik = wynik + Math.sqrt(Math.abs(y));
        }
        System.out.println("Suma pierwiastkow absolutna: " + wynik);
        // PODPUNKT E
        wynik = list[0];
        for (int i = 1; i < n; i++) {
            wynik = wynik * Math.abs(list[i]);
        }
        System.out.println("Iloczyn absolutny: " + wynik);
        // PODPUNKT F
        wynik = 0;
        for (double y : list) {
            System.out.println(Math.sqrt(Math.abs(y)));
            wynik = wynik + Math.pow(y,2);
        }
        System.out.println("Suma poteg: " + wynik);
        // PODPUNKT G
        wynik = 0;
        for (double y : list) {
            wynik = wynik + y;
        }
        double wynik2=list[0];
        for (int i = 1; i < n; i++) {
            wynik2 = wynik2 * list[i];
        }
        System.out.println("Suma : " + wynik + " Iloczyn: " + wynik2);
        // PODPUNKT H
        wynik = 0;
        double mnoznik =1;
        for (double y : list) {
            wynik = wynik + (y*mnoznik);
            mnoznik=mnoznik*(-1);
        }
        System.out.println("Suma przemienna: " + wynik);
        // PODPUNKT I
        wynik = 0;
        mnoznik =-1;
        double sil =1;
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                sil = sil * j;
            }
            wynik = wynik + (((list[i])/sil)*mnoznik);
            sil=1;
            mnoznik=mnoznik*(-1);


        }
        System.out.println("Suma przemienna z dzieleniem silni: " + wynik);
    }


    }

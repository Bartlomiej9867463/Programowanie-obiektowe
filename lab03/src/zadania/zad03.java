package zadania;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=101;
        int m= 101;
        int k=101;
        int wynikmnozenia=0;
        while((m>10)||(m<1))
        {
            System.out.print("Podaj liczbe rzeczywista m od 1 do 10: ");
            m = in.nextInt();
        }
        while((n>10)||(n<1))
        {
            System.out.print("Podaj liczbe rzeczywista n od 1 do 10: ");
            n = in.nextInt();
        }
        while((k>10)||(k<1))
        {
            System.out.print("Podaj liczbe rzeczywista k od 1 do 10: ");
            k = in.nextInt();
        }
        int[][] mn = new int[m][n];
        int[][] nk = new int[n][k];
        int[][] mk = new int[m][k];
        Random r = new Random();
        System.out.println("macierz mn "+ m+"x"+n);
        for (int i = 0; i < m; ++i) {
            System.out.println();
            for (int j = 0; j < n; ++j){
                mn[i][j] = r.nextInt(100);
                System.out.print(mn[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("macierz nk "+ n+"x"+k);
        for (int i = 0; i < n; ++i) {
            System.out.println();
            for (int j = 0; j < k; ++j){
                nk[i][j] = r.nextInt(100);
                System.out.print(nk[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("macierz mk mn*mk=");
        System.out.println("");
        for (int i = 0; i < m; ++i) {
            System.out.println();
            for (int j = 0; j < k; ++j){
                for (int l = 0; l < n; l++) {
                    wynikmnozenia += mn[i][l] * nk[l][j];
                }
                mk[i][j] = wynikmnozenia;
                System.out.print(mk[i][j] + " ");
                wynikmnozenia=0;
            }
        }
    }
}

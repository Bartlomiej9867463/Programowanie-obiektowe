package zadania;
import java.util.Scanner;
import java.lang.Math;
public class zad01_02 {
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
            //System.out.print(list[i] + " ");
        }
        System.out.println();
        //PODPUNKT A
        double wynik = 0;
        System.out.print("Wpisany ciąg to: ");
        for (double y : list) {
            System.out.print(y+",");
        }

    }


}

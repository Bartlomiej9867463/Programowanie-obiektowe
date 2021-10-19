package zadania;
import java.util.Scanner;
import java.lang.Math;
public class zad02_03 {
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
        double dodatnie = 0;
        double ujemne = 0;
        double zera = 0;
        for (double y : list) {
            if (y > 0)
                dodatnie++;
        }
        for (double y : list) {
            if (y < 0)
                ujemne++;
        }
        for (double y : list) {
            if (y == 0)
                zera++;
        }
        System.out.println("dodatnie = " + dodatnie);
        System.out.println("ujemne = " + ujemne);
        System.out.println("zera = " + zera);


    }
}

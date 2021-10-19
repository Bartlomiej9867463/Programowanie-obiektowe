package zadania;
import java.util.Scanner;
import java.lang.Math;
public class zad02_04 {
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
        double najwieksza = list[0];
        double najmniejsza = list[0];
        for (double y : list) {
            if (y > najwieksza)
                najwieksza=y;
            if (y < najmniejsza)
                najmniejsza= y;
        }
        System.out.println("najwieksza = " + najwieksza);
        System.out.println("najmniejsza = " + najmniejsza);


    }
}

package zadania;
import java.util.Scanner;
import java.lang.Math;
    public class zad02_02 {
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
            double wynik = 0;
            for (double y : list) {
                if (y > 0)
                wynik = wynik + (2*(y));
            }
            System.out.print("podwojona suma wynosi = " + wynik);

        }
    }

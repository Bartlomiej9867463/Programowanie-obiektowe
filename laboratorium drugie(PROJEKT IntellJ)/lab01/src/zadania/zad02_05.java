package zadania;
import java.util.Scanner;
import java.lang.Math;
public class zad02_05 {
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
        int zliczacz = 0;
        for (int i = 0; i < (n-1); i++) {
            //System.out.println(i);
            if (((list[i])>0)&&((list[i+1])>0))
                zliczacz++;
        }
        System.out.println("ilosc sasiadujacych par spelniajacych okreslony w podpunkcie 5 warunek = " +  zliczacz);

    }
}

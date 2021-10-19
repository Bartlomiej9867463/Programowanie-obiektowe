package zadania;

import java.util.Scanner;
import java.lang.Math;

public class zad02_01 {
        public static int silnia(int n) {
            int silnia1 = 1;
            for(int i = 1; i <= n; i++) {
                silnia1 *= i;
            }
            return silnia1;
            }
        //  PODPUNKT A
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
            double zliczacz = 0;
            for (double y : list) {
                if ((y % 2) != 0)
                    zliczacz++;
            }
            System.out.println("Ilosc elementow nieparzystych =" + zliczacz);
            //PODPUNKT B
            zliczacz = 0;
            for (double y : list) {
                if (((y % 3) == 0)&&((y % 5) != 0))
                    zliczacz++;
            }
            System.out.println("Ilosc podzielnych przez trzy i niepodzielnych przez pięć =" + zliczacz);
            //PODPUNKT C
            zliczacz = 0;
            for (double y : list) {
                if (((Math.sqrt(y) % 2) == 0))
                    zliczacz++;
            }
            System.out.println("Ilosc kwadratow liczb parzystych =" + zliczacz);
            //PODPUNKT D
            zliczacz = 0;
            for (int i = 1; i < (n-1); i++) {
                //System.out.println(i);
                if(list[i]<((list[i-1]+list[i+1])/2))
                    zliczacz++;
                }
            System.out.println("Ilosc liczb spelniajacyhc warunek w podpunkcie d =" + zliczacz);
            //PODPUNKT E
            zliczacz = 0;
            for (int i = 1; i < (n-1); i++) {
                //System.out.println(i);
                if (list[i] < ((list[i - 1] + list[i + 1]) / 2))
                    zliczacz++;
            }
            System.out.println("Ilosc liczb spelniajacyhc warunek w podpunkcie e =" + zliczacz);
            //PODPUNKT F
            zliczacz = 0;
            for (int i = 0; i < (n); i++) {
                //System.out.println(i);
                if (((list[i]%2)==0)  && ((i%2)!=0))
                    zliczacz++;
                }
            System.out.println("Ilosc liczb majacych nieparzysty numer i  będących parzystymi liczbami =" + zliczacz);

            //PODPUNKT G
            zliczacz = 0;
            for (int i = 0; i < (n); i++) {
                //System.out.println(i);
                if (((list[i]%2)!=0)  && ((list[i])<0))
                    zliczacz++;
            }
            System.out.println("Ilosc liczb nieparzystych i ujemnych =" + zliczacz);
            //PODPUNKT H
            zliczacz = 0;
            for (int i = 0; i < (n); i++) {
                //System.out.println(i);
                if (Math.abs(list[i])<Math.pow(i,2))
                    zliczacz++;
            }
            System.out.println("Ilosc liczb spelniajacych warunek w podpunkcie h =" + zliczacz);

        }
        }


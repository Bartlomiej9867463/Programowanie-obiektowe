import java.util.LinkedList;
import java.util.Stack;

public class zad6 {
    public static void main(String[] args) {
        wypisz_cyfre(2015);
    }
    public static void wypisz_cyfre(int n) {
        Stack<Integer> stos = new Stack<Integer>();
        while (n > 0) {
            stos.push(n%10);
            n=n/10;
        }
        //System.out.println(stos);
        int j=0;
        int rozmiar = stos.size();
        while (j< rozmiar) {
            System.out.println(stos.pop());
            j++;
        }
    }
}

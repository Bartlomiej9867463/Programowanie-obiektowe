import java.util.ArrayList;
import java.util.Collections;
public class zad3 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println((mergeSorted(a, b)));
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        int najwiekszy_indeks=a.size();
        Collections.sort(a);
        Collections.sort(b);
        int dlugosc = ((b.size())+(a.size()));
        if (najwiekszy_indeks<b.size()){
            najwiekszy_indeks=b.size();
        }
        for (int i = 0; i < dlugosc; i++) {
            if ((b.size()>0)&&(a.size()>0)){
                if (a.get(0)<=b.get(0)) {
                    wynik.add(a.get(0));
                    a.remove(0);
                }
                else if (a.get(0)>=b.get(0)) {
                    wynik.add(b.get(0));
                    b.remove(0);
                }
            }
            else if (a.size()>0){
                wynik.add(a.get(0));
                a.remove(0);
            }
            else if (b.size()>0){
                wynik.add(b.get(0));
                b.remove(0);
            }

        }
        return wynik;
    }
}

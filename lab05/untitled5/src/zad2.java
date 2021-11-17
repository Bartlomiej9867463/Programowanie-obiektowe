import java.util.ArrayList;
public class zad2 {

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
            b.add(12);
            b.add(13);
            for (int i = 0; i < (merge(a, b)).size(); i++) {
                System.out.println((merge(a, b)).get(i));
            }
        }
        public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
            ArrayList<Integer> wynik = new ArrayList<Integer>();
            int najwiekszy_indeks=a.size();
            if (najwiekszy_indeks<b.size()){
                najwiekszy_indeks=b.size();
            }
            for (int i = 0; i < najwiekszy_indeks; i++) {
                if (i<a.size()) {
                    wynik.add(a.get(i));
                }
                if (i<b.size()){
                    wynik.add(b.get(i));
                }
            }
            return wynik;
        }
    }

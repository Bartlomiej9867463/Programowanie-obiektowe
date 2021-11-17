import java.util.ArrayList;

public class Main {

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
        for (int i = 0; i < (merge(a, b)).size(); i++) {
            System.out.println((merge(a, b)).get(i));
        }
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            wynik.add(a.get(i));
        }
        for (int j = 0; j < b.size(); j++) {
            wynik.add(b.get(j));
        }
        return wynik;
    }
}

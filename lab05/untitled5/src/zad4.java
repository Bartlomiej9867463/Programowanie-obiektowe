import java.util.ArrayList;
public class zad4 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        for (int i = 0; i < (reversed(a)).size(); i++) {
            System.out.println((reversed(a)).get(i));
        }
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        int najwiekszy_indeks=a.size();
        for (int i = a.size()-1; i >= 0; i--) {
            wynik.add(a.get(i));
        }
        return wynik;
    }
}

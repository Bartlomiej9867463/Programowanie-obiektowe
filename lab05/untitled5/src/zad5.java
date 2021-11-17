import java.util.ArrayList;
public class zad5 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        a.add(2);
        reversed(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void reversed(ArrayList<Integer> a) {
        int najwiekszy_indeks=a.size();
        for (int i = a.size()-1; i >= 0; i--) {
            a.add(a.get(i));
            a.remove(i);
        }
    }
}

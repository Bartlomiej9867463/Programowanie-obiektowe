import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.time.LocalDate;
public class ArrayUtil  {
    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> lista) {
        ArrayList<T> posortowana = new ArrayList<>(lista);
        Collections.sort(posortowana);
        for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));
            if (((lista.get(i)).compareTo((T) posortowana.get(i)))!=0) {
                return false;
            }
        }
        return true;
    }
    public static <T extends Comparable<T>> int binSearch(ArrayList<T> lista, T szukany) {
        int niskiindeks = 0;
        int wysokiindeks = lista.size()-1;
        int elementPos = -1;
        while (niskiindeks <= wysokiindeks) {
            int pozycja = (niskiindeks + wysokiindeks) / 2;
            if ((szukany.compareTo(lista.get(pozycja)))==0) {
                elementPos = pozycja;
                break;
            } else if ((szukany.compareTo(lista.get(pozycja)))<=-1) {
                wysokiindeks = pozycja-1;
            } else if ((szukany.compareTo(lista.get(pozycja)))>=1) {
                niskiindeks = pozycja+1;
            }
        }
        return elementPos;
    }
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> lista) {
        int rozmiar = lista.size();
        for (int i = 0; i < rozmiar-1; i++)
        {
            int najmniejsza_pozycja = i;
            for (int j = i+1; j < rozmiar; j++)
                if (lista.get(j).compareTo(lista.get(najmniejsza_pozycja)) <= -1)
                    najmniejsza_pozycja = j;
            T schowek = lista.get(najmniejsza_pozycja);
            lista.set(najmniejsza_pozycja, lista.get(i));
            lista.set(i, schowek);
        }
    }
    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> lista) {
    }

    public static void main(String[] args) {
        ArrayList var1 = new ArrayList();
        var1.add(1);
        var1.add(2);
        var1.add(3);
        var1.add(1);
        //System.out.println((var1).get(0));
        System.out.println(ArrayUtil.isSorted(var1));
        System.out.println((var1));
        Collections.sort(var1);
        System.out.println((var1));
        System.out.println(ArrayUtil.isSorted(var1));
        System.out.println(ArrayUtil.binSearch(var1,3));
        ArrayList var2 = new ArrayList();
        var2.add(LocalDate.of(2022, 1, 8));
        var2.add(LocalDate.of(2019, 1, 8));
        var2.add(LocalDate.of(1996, 1, 8));
        var2.add(LocalDate.of(2022, 2, 8));
        System.out.println((var2));
        Collections.sort(var2);
        System.out.println((var2));
        LocalDate data = LocalDate.of(2019, 1, 8);
        LocalDate data1= LocalDate.of(2021, 2, 8);
       System.out.println(ArrayUtil.binSearch(var2, data));
        ArrayList var3 = new ArrayList();
        var3.add(LocalDate.of(2022, 1, 8));
        var3.add(LocalDate.of(2019, 1, 8));
        var3.add(LocalDate.of(1996, 1, 8));
        var3.add(LocalDate.of(2022, 2, 8));
        System.out.println((var3));
        ArrayUtil.selectionSort(var3);
        System.out.println((var3));
        ArrayList var4 = new ArrayList();
        var4.add(1);
        var4.add(2);
        var4.add(3);
        var4.add(1);
        System.out.println((var4));
        ArrayUtil.selectionSort(var4);
        System.out.println((var4));
        // Iterator var2 = var1.iterator();
        //while (var2.hasNext()) {
        //     String var3 = (String) var2.next();
        //     System.out.println(var3.length() + ": " + var3);
    }


}



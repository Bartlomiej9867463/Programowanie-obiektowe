import java.util.LinkedList;

public class Main {
    // ZADANIA 1,2,3,4

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        odwroc(cars);
        System.out.println(cars);
        redukuj_generyczna(cars,2);
        System.out.println(cars);
        odwroc_generyczna(cars);
        System.out.println(cars);


    }
    public static void redukuj(LinkedList<String> pracownicy, int n){
        int i=0;
        int j=0;
        int lever=0;
        while (i < pracownicy.size()) {
            //System.out.println(pracownicy.get(i));
            //System.out.println(i);
            //System.out.println(j);
            if (j+1==n && n<=pracownicy.size()){
                pracownicy.remove(i);
                lever=1;
                i--;
            }
            i++;
            j++;
            if (lever==1){
                j=0;
                lever=0;
            }
        }
        }
    public static <T> void redukuj_generyczna(LinkedList<T> pracownicy, int n){
        int i=0;
        int j=0;
        int lever=0;
        while (i < pracownicy.size()) {
            //System.out.println(pracownicy.get(i));
            //System.out.println(i);
            //System.out.println(j);
            if (j+1==n && n<=pracownicy.size()){
                pracownicy.remove(i);
                lever=1;
                i--;
            }
            i++;
            j++;
            if (lever==1){
                j=0;
                lever=0;
            }
        }
    }
    public static void odwroc(LinkedList<String> lista){
        int i=0;
        int j=lista.size()-1;
        String temp="";
        while (i <=j) {
            temp =lista.get(i);
            lista.set(i,lista.get(j));
            lista.set(j,temp);
            i++;
            j--;
            }
        }
    public static<T> void odwroc_generyczna(LinkedList<T> lista){
        int i=0;
        int j=lista.size()-1;
        T temp= (T) "";
        while (i <=j) {
            temp =lista.get(i);
            lista.set(i,lista.get(j));
            lista.set(j,temp);
            i++;
            j--;
        }
    }
    }


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class Main {

        public static void main(String[] args){
            PriorityQueue<listaZadan> kolejka = new
                    PriorityQueue<listaZadan>(10, new listazadanporownywacz());
            Scanner in = new Scanner(System.in);
            String n = "";
            int priorytet=0;
            String opis="";
            System.out.print("Komendy: nastepne, pokaz, zakoncz, dodaj. UWAGA w przypadku komendy dodaj nalezy wpisac kolejno opis i priorytet po enterze.\n");
            while (!n.equals("zakoncz"))
            {
                System.out.print("podaj komende: ");
                n = in.nextLine();
                if(n.equals("pokaz")){
                    if(!kolejka.isEmpty()){
                        System.out.print("najpilneijsze zadanie: ");
                        System.out.print((kolejka.peek()).getOpis() +"\n");
                    }
                }
                if(n.equals("dodaj")){
                    System.out.print("wpisz opis: ");
                    opis = in.nextLine();
                    System.out.print("wpisz priorytet: ");
                    priorytet = in.nextInt();
                    listaZadan zad4 = new listaZadan(opis, priorytet);
                    kolejka.add(zad4);
                }
                if(n.equals("nastepne")){
                    System.out.print("usunieto element z listy o najwiekszym priorytecie.\n");
                    kolejka.poll();
                }
            }
        }

    }
class listazadanporownywacz implements Comparator<listaZadan>{
    public int compare(listaZadan s1, listaZadan s2) {
        if (s1.priorytet > s2.priorytet)
            return 1;
        else if (s1.priorytet < s2.priorytet)
            return -1;
        return 0;
    }
}

class listaZadan {
    public String opis;
    public int priorytet;
    public listaZadan(String opis, int priorytet) {
        this.opis = opis;
        this.priorytet = priorytet;
    }
    public String getOpis() {
        return opis;
    }
    public int getpriorytet() {
        return priorytet;
    }
}

import java.lang.Comparable;
import java.lang.Cloneable;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static class Klient<T extends Klient<T>> implements Cloneable, Comparable<T> {
        private  double rachunek;
        private  String nazwa;
        private  java.time.LocalDate dataZakupy;
        public double getRachunek() {
            return rachunek;
        }

        public String getNazwa() {
            return nazwa;
        }

        public LocalDate getDataZakupy() {
            return dataZakupy;
        }

        Klient(String nazwa, double rachunek, java.time.LocalDate dataZakupy)
        {
            this.rachunek=rachunek;
            this.nazwa=nazwa;
            this.dataZakupy=dataZakupy;
        }

        @Override
        public int compareTo(Klient o) {
            int data = this.dataZakupy.compareTo(o.dataZakupy);
            int nazwa = this.nazwa.compareTo(o.nazwa);
            int rachunek=Double.compare(this.rachunek, o.rachunek);
            if (data!=0) return data;
            else{
                if (nazwa!=0) return nazwa;
                else{
                    if (rachunek!=0) return rachunek;
                    else return 0;
                }
            }
        }

        @Override
        public String toString() {
            return "Klient{" +
                    "rachunek=" + rachunek +
                    ", nazwa='" + nazwa + '\'' +
                    ", dataZakupy=" + dataZakupy +
                    '}';
        }
    }
    public static class Obslugaklienta {
        static  double procentRabatu;
        private List<Klient> list = new ArrayList<Klient>();
        Obslugaklienta(ArrayList<Klient> list) {
            this.list=list;
        }
        public static void setProcentRabatu() {
            Obslugaklienta.procentRabatu = 0.05;
        }
    }
    public static double discountAmount(Klient k) {
        if(k.rachunek>300) {
            return Obslugaklienta.procentRabatu*k.rachunek;
        }
        else return 0;
    }
    public static Map DiscountMap(ArrayList<Klient> klist){
        Map mapa = new HashMap();
        for (Klient k : klist){
            if (discountAmount(k)!=0){
                mapa.put((int)(discountAmount(k)),k.nazwa);
            }
        }
        return mapa;
    }
    public static void main(String[] args) {

        ArrayList<Klient> grupa = new ArrayList<Klient>();
        grupa.add(new Klient("Bartek",15,LocalDate.of(2020, 6, 6)));
        grupa.add(new Klient("Janusz",301,LocalDate.of(2020, 6, 6)));
        grupa.add(new Klient("Krysytyna",34,LocalDate.of(2021, 12, 5)));
        grupa.add(new Klient("Michal",34, LocalDate.of(2005, 2, 8)));
        grupa.add(new Klient("Szczepan",95,LocalDate.of(2012, 11, 4)));
        grupa.add(new Klient("Szczepan",1000, LocalDate.of(2011, 1, 14)));
        Obslugaklienta instancja = new Obslugaklienta(grupa);
        Obslugaklienta.setProcentRabatu();
        System.out.print(grupa+"\n");
        Collections.sort(grupa);
        System.out.print(grupa);
        System.out.print("\n");
        System.out.print("znizka:");
        System.out.print(discountAmount(grupa.get(1)));
        System.out.print("\n");
        System.out.print("znizka:");
        System.out.print(discountAmount(grupa.get(2)));
        System.out.print("\n");
        System.out.print("Mapa:");
        System.out.print(DiscountMap(grupa));


    }

}

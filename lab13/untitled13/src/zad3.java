
import java.util.*;
public class zad3 {

    public static void main(String args[])
    {
        Map<Student, String> hm = new TreeMap<Student, String>();

        Scanner wejscie1 = new Scanner(System.in);
        Scanner wejscie2 = new Scanner(System.in);
        Scanner wejscie3 = new Scanner(System.in);
        Scanner wejscie4 = new Scanner(System.in);
        Scanner wejscie5 = new Scanner(System.in);

        String komenda ="";
        String imie ="";
        String nazwisko ="";
        int id =0;
        String ocena="";
        hm.put(new Student("abel", "adam", 4),  "db");
        hm.put(new Student("adam", "adam", 2),  "bdb");
        hm.put(new Student("adam", "adam", 3),  "ndst");
        hm.put(new Student("marek", "adam", 1),  "db");
        hm.put(new Student("arek", "bek", 5),  "dst");
        hm.put(new Student("adam", "ada", 6),  "dst");


        System.out.print("Komendy: zmien, pokaz, zakoncz, dodaj, usun. UWAGA w przypadku komendy dodaj nalezy wpisac kolejno nazwisko i ocene po enterze, analogicznie w przypadku komendy zmien\nWpisz komende: ");
        do{
            komenda = wejscie1.nextLine();
            if (komenda.equals("zmien")){
                System.out.print("Wpisz id ucznia: ");
                id=wejscie4.nextInt();
                for (Map.Entry<Student, String> me : hm.entrySet()) {
                    if((me.getKey()).id==id){
                        System.out.print("Wpisz nowa ocene ucznia: ");
                        ocena=wejscie3.nextLine();
                        hm.put(me.getKey(),  ocena);
                    }
                }
            }
            if (komenda.equals("usun")){
                System.out.print("Wpisz id ucznia: ");
                id=wejscie4.nextInt();
                for (Map.Entry<Student, String> me :
                        hm.entrySet()) {

                    if((me.getKey()).id==id){
                        hm.remove(me.getKey());
                    }
                }
            }
            if (komenda.equals("dodaj")){
                System.out.print("Wpisz imie ucznia: ");
                imie=wejscie2.nextLine();
                System.out.print("Wpisz nazwisko ucznia: ");
                nazwisko=wejscie5.nextLine();
                System.out.print("Wpisz id ucznia: ");
                id=wejscie4.nextInt();
                System.out.print("Wpisz ocene ucznia: ");
                ocena=wejscie3.nextLine();
                hm.put(new Student(imie, nazwisko, id),  ocena);
            }
            if (komenda.equals("pokaz")){
                for (Map.Entry<Student, String> e :
                        hm.entrySet()) {
                    System.out.println(e.getKey().id + " "
                            + e.getKey().imie + " " + e.getKey().nazwisko + " "
                            + e.getValue());
                }
            }
        }while(!komenda.equals("zakoncz"));
    }
    static class Student implements Comparable<Student>  {
        public String imie;
        public String nazwisko;
        public int id;
        public String getImie() {
            return imie;
        }
        public String getNazwisko() {
            return nazwisko;
        }
        public int getId() {
            return id;
        }
        public Student(String imie, String nazwisko, int id) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.id=id;
        }
        public int compareTo(Student e)
        {
            int l1 = (this.nazwisko).length();
            int l2 = (e.nazwisko).length();
            int lmin = Math.min(l1, l2);
            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int)(this.nazwisko).charAt(i);
                int str2_ch = (int)(e.nazwisko).charAt(i);
                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
            if (l1 != l2) {
                return l1 - l2;
            }
            else {
                int i1 = (this.imie).length();
                int i2 = (e.imie).length();
                int minimum = Math.min(l1, l2);
                for (int i = 0; i < lmin; i++) {
                    int str1_ch = (int)(this.imie).charAt(i);
                    int str2_ch = (int)(e.imie).charAt(i);

                    if (str1_ch != str2_ch) {
                        return str1_ch - str2_ch;
                    }
                }
                if (i1 != i2) {
                    return i1 - i2;
                }
                else {
                    int roznica = this.id - e.id;
                    return roznica;
                }
            }

        }
    }

}
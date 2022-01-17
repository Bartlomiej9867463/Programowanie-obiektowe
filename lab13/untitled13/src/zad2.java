import java.util.*;
public class zad2 {

    public static void main(String args[])
    {
        Map<String, String> hm = new TreeMap<String, String>();
        hm.put("Aleks", "ndst");
        hm.put("Adam",   "ndst");
        hm.put("Dominik","dst");
        hm.put("Zenon",  "bdb");

        Scanner wejscie1 = new Scanner(System.in);
        Scanner wejscie2 = new Scanner(System.in);
        Scanner wejscie3 = new Scanner(System.in);
        String komenda ="";
        String imie ="";
        String ocena="";
        System.out.print("Komendy: zmien, pokaz, zakoncz, dodaj, usun. UWAGA w przypadku komendy dodaj nalezy wpisac kolejno nazwisko i ocene po enterze, analogicznie w przypadku komendy zmien\nWpisz komende: ");
        do{
            komenda = wejscie1.nextLine();
            if (komenda.equals("zmien")){
                System.out.print("Wpisz imie ucznia: ");
                imie=wejscie2.nextLine();
                System.out.print("Wpisz nowa ocene ucznia: ");
                ocena=wejscie3.nextLine();
                hm.put(imie,  ocena);
            }
            if (komenda.equals("usun")){
                System.out.print("Wpisz imie ucznia: ");
                imie=wejscie2.nextLine();
                hm.remove(imie);
            }
            if (komenda.equals("dodaj")){
                System.out.print("Wpisz imie ucznia: ");
                imie=wejscie2.nextLine();
                System.out.print("Wpisz ocene ucznia: ");
                ocena=wejscie3.nextLine();
                hm.put(imie,  ocena);
            }
            if (komenda.equals("pokaz")){
                for (Map.Entry<String, String> me :
                        hm.entrySet()) {

                    System.out.print(me.getKey() + ": ");
                    System.out.println(me.getValue());
                }
            }
        }while(!komenda.equals("zakoncz"));
    }
}

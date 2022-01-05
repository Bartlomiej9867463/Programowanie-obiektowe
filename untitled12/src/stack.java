import java.util.*;

import static java.util.Collections.*;

public class stack {
    public static void main(String[] args) {
        String zdanie= ("Ala ma kota. Jej kot lubi myszy.");
        odwroc_slowo(zdanie);
    }
    public static void odwroc_slowo(String napis){
        String [] slowa_rozdzielone = napis. split(" ");
        boolean lever =false;
        boolean lever2 =true;
        Stack<String> stos = new Stack<String>();
        for (String slowo:slowa_rozdzielone){
            //System.out.println(slowo);
            for (int i = 0; i < slowo.length(); i++) {
                if (slowo.charAt(i)=='.'){

                    //System.out.println("kropka");
                    lever=true;
                }
            }
            if (lever==true){
                slowo=slowo.replaceFirst(".$","");
                slowo= slowo.substring(0, 1).toUpperCase() + slowo.substring(1);
                stos.push(slowo);
                int j=0;
                int rozmiar = stos.size();
                System.out.println(stos);
                while (j< rozmiar) {
                    System.out.println(stos.pop());
                    j++;
                }
                lever=false;
                lever2=true;
            }
            else if (lever2== true){
                slowo= slowo.substring(0, 1).toLowerCase() + slowo.substring(1) + ".";
                stos.push(slowo);
                lever2=false;}
            else stos.push(slowo);
        }
    }
}

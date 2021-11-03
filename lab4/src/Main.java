import java.util.Arrays;
import java.lang.StringBuffer;

public class Main {
        public static void main ( String [] args ) {
            //System.out.println(countChar("abca a,ą",'a'));
            System.out.println(countSubStr("abcab abb,ą","ab"));
            System.out.println(middle("abb"));
            System.out.println(repeat("ho",3));
            System.out.println(where("abcab abb,ą","ab"));
            System.out.println(change("Aa23sfD"));
            System.out.println(nice("10000000000000000"));
            System.out.println(niceadjustable("10000000000000000", '\'',3));




        }

        public static int countChar(String str, char c) {
            int zliczaczwystapien = 0;

            for(char litera : str.toCharArray()) {
                if (litera==c)
                    zliczaczwystapien+=1;
            }
            return zliczaczwystapien;
            }
        public static int countSubStr(String str, String SubStr) {
            int pozycja=0;
            int dlugoscnapisu=SubStr.length();
            int dlugoscstringa=str.length();
            int napispozycja=0;
            int zliczacznapisow = 0;

            while(dlugoscstringa-pozycja>=dlugoscnapisu)
            {
                while (str.charAt(pozycja+napispozycja)==str.charAt(napispozycja))
                {
                    napispozycja+=1;
                    if (napispozycja==(dlugoscnapisu-1)){
                        zliczacznapisow+=1;
                        break;
                    }
                    else if(dlugoscnapisu==1) {
                        zliczacznapisow += 1;
                        break;
                    }
                }
                //System.out.println((pozycja));
                napispozycja=0;
                pozycja+=1;
            }

            return zliczacznapisow;
    }
    public static String middle(String str) {
        int zliczaczwystapien = 0;
        String zwrot="";
        if (str.length()%2==0) {
            zwrot = String.valueOf(str.charAt((str.length() / 2)-1))+String.valueOf(str.charAt((str.length() / 2)));
        }
        else
            zwrot = String.valueOf(str.charAt((str.length() / 2)));
        return zwrot;
    }
    public static String repeat(String str, int n) {
            String repeat=str;
            for(int i=1; i<n; i++){
                repeat+=str;
        }
            return repeat;
    }
    public static int[] where(String str, String SubStr) {
        int pozycja=0;
        int dlugoscnapisu=SubStr.length();
        int dlugoscstringa=str.length();
        int napispozycja=0;
        int[] tablicanapisow = new int[] {};

        while(dlugoscstringa-pozycja>=dlugoscnapisu)
        {
            while (str.charAt(pozycja+napispozycja)==str.charAt(napispozycja))
            {
                napispozycja+=1;
                if (napispozycja==(dlugoscnapisu-1)){
                    tablicanapisow = Arrays.copyOf(tablicanapisow, tablicanapisow.length + 1);
                    tablicanapisow[tablicanapisow.length - 1] = pozycja;
                    break;
                }
            }
            //System.out.println((pozycja));
            napispozycja=0;
            pozycja+=1;
        }

        return tablicanapisow;
    }
    public static String change(String str) {
        StringBuffer sb = new StringBuffer();
        for(char litera: str.toCharArray()){
            if(Character.isUpperCase(litera)){
                sb.append(Character.toLowerCase(litera));
            }
            else if(Character.isLowerCase(litera)) {
                sb.append((Character.toUpperCase(litera)));
            }
            else
                sb.append(litera);
        }

        return sb.toString();
    }
    public static String nice(String str) {
            char separator ='\'';
            int ilosc=3;
            int dlugosc = str.length();
            int reszta= dlugosc%ilosc;
            int licznik=-reszta;
            int ilosc_separatorow= (dlugosc-(reszta))/ilosc;
            StringBuffer sb = new StringBuffer();
            for(int i = 0, n = str.length() ; i < n ; i++) {
                if (i==reszta)
                    sb.append(separator);
                else if(licznik==ilosc){
                    sb.append(separator);
                    licznik=0;
                }
                sb.append(str.charAt(i));
                licznik++;
        }
        return sb.toString();

    }
    public static String niceadjustable(String str, char separator, int ilosc) {
        int dlugosc = str.length();
        int reszta= dlugosc%ilosc;
        int licznik=-reszta;
        int ilosc_separatorow= (dlugosc-(reszta))/ilosc;
        StringBuffer sb = new StringBuffer();
        for(int i = 0, n = str.length() ; i < n ; i++) {
            if (i==reszta)
                sb.append(separator);
            else if(licznik==ilosc){
                sb.append(separator);
                licznik=0;
            }
            sb.append(str.charAt(i));
            licznik++;
        }
        return sb.toString();

    }

}



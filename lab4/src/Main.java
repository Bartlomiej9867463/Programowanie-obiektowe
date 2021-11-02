public class Main {
        public static void main ( String [] args ) {
            //System.out.println(countChar("abca a,ą",'a'));
            System.out.println(countSubStr("abcab abb,ą","ab"));
            System.out.println(middle("abb"));
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

}


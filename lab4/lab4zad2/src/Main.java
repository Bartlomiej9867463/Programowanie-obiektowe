
import java.nio.file.*;
        public class Main {
            public static void main ( String [] args ) throws Exception{
                //System.out.println(countChar("abca a,ą",'a'));
                System.out.println(zad2("ds","ab.txt"));
            }

            public static int zad2(String SubStr, String plik) throws Exception{
                String nazwa =  "C:\\";
                nazwa=nazwa+plik;
                String data = "";
                data = new String(Files.readAllBytes(Paths.get(nazwa)));
                int pozycja=0;
                int dlugoscnapisu=SubStr.length();
                int dlugoscstringa=data.length();
                int napispozycja=0;
                int zliczacznapisow = 0;
                while(dlugoscstringa-pozycja>=dlugoscnapisu)
                {
                    while (data.charAt(pozycja+napispozycja)==data.charAt(napispozycja)&&(data.charAt(pozycja+napispozycja)!=' '))
                    {
                        napispozycja+=1;
                        if (napispozycja==(dlugoscnapisu-1)) {
                            zliczacznapisow += 1;
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
        }
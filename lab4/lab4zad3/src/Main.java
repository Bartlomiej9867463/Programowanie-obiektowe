
import java.util.Arrays;
import java.io.*;
public class Main {
    public static void main ( String [] args ) throws Exception{
        //System.out.println(countChar("abca a,ą",'a'));
        System.out.println(zad2('f',"ab.txt"));
    }

    public static int zad2(char c, String plik) throws Exception{
        String nazwa =  "C:\\";
        nazwa=nazwa+plik;
        File file = new File(nazwa);
        FileReader input = new FileReader(file);
        int zliczaczwystapien1 = 0;

        try {
            int i;
            while((i = input.read()) != -1) {
                if((char)i==c){
                    zliczaczwystapien1++;
                }
            }
        } finally {
            input.close();
        }
        return zliczaczwystapien1;

    }
}
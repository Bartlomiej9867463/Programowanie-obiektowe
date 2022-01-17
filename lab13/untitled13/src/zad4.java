import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, HashSet<String>> mapa = new HashMap<>();
        Scanner zczytywacz = new Scanner(new File("E:\\ab.txt"));
        zczytywacz.useDelimiter(" +");
        while (zczytywacz.hasNext()) {
            String slowo = zczytywacz.next();
            int kodhash = slowo.hashCode();
            if (!mapa.containsKey(kodhash))
            {
                HashSet<String> newSet = new HashSet<>();
                newSet.add(slowo);
                mapa.put((kodhash), newSet);
            }
            else
            {
                mapa.get(kodhash).add(slowo);
            }
        }
        for (Map.Entry<Integer, HashSet<String>> me : mapa.entrySet()) {
            if (me.getValue().size() > 1) {
                System.out.println(me.getKey() + " : " + (me.getValue()).toString());
            }
        }
    }

}

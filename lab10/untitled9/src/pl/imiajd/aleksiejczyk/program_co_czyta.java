package pl.imiajd.aleksiejczyk;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class program_co_czyta {
    public static void zczytywacz(File plik) throws FileNotFoundException {
        Scanner sc = new Scanner(plik);
        ArrayList<String> lista = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lista.add(sc.nextLine());
        }
        lista.sort(Comparator.naturalOrder());
        for (String I : lista) {
            System.out.println(I);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        zczytywacz(new File("E:\\test.txt"));

    }
}




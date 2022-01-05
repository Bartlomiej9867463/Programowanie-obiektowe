import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class zad8{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        print(cars);
    }
    public static <O, B extends Iterable<O>> void print(B iterable) {

        ArrayList<String> stringList = new ArrayList<>();
        for(O element: iterable) {
            System.out.print(element+", ");
        }
    }
    }

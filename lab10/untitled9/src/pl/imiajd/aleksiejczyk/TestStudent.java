package pl.imiajd.aleksiejczyk;
import java.util.ArrayList;
import java.util.Comparator;

import java.time.LocalDate;

public class TestStudent {
        public static void main(String[] args) {
            Osoba[] grupa = new Osoba[5];
            grupa[0]= new Student("Kowalski",LocalDate.of(2020, 1, 8),3.5);
            grupa[1]= new Student("Nowak",LocalDate.of(2020, 1, 8),4.2);
            grupa[2]= new Student("Malinowski",LocalDate.of(2022, 1, 8),5.0);
            grupa[3]= new Student("Malinowski",LocalDate.of(2022, 1, 8),2.4);
            grupa[4]= new Student("Aleksiejczyk",LocalDate.of(1998, 8, 10),2.1);
            System.out.println(grupa[0].compareTo(grupa[1]));
            ArrayList<Student> Studenci = new ArrayList<Student>();
            Studenci.add((Student) grupa[0]);
            Studenci.add((Student) grupa[3]);
            Studenci.add((Student) grupa[1]);
            Studenci.add((Student) grupa[4]);
            Studenci.add((Student) grupa[2]);
            for(Student I:Studenci){
                System.out.println(I);
            }
            System.out.println("_____________________");
            Studenci.sort(Comparator.naturalOrder());
            for(Student I:Studenci){
                System.out.println(I);
            }
    }

}

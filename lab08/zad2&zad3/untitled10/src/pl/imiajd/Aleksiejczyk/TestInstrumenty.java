package pl.imiajd.Aleksiejczyk;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty   {
    public static void main(String[] args) {
        Flet flet1 = new Flet("singer", LocalDate.of(1999, 1, 8));
        Skrzypce skrzypce1 = new Skrzypce("singer", LocalDate.of(1992, 1, 8));
        Fortepian fortepian1 = new Fortepian("singer", LocalDate.of(1992, 1, 8));
        Flet flet2 = new Flet("Bundorf", LocalDate.of(1999, 1, 8));
        Flet flet3 = new Flet("Pawlacz", LocalDate.of(1999, 1, 8));
        Instrument[] orkiestrowe =new Instrument[5];


        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(flet1);
        orkiestra.add(flet2);
        orkiestra.add(flet3);
        orkiestra.add(skrzypce1);
        orkiestra.add(fortepian1);
        for(Instrument I:orkiestra){
            System.out.println(I.dzwiek());
        }
        System.out.println(orkiestra);

    }
}

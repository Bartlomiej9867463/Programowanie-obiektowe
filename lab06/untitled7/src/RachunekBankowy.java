import java.util.Scanner;
public class RachunekBankowy {
    private static double RocznaStopaProcentowa =0;
    private double Capital;
    private double Saldo;
    public RachunekBankowy(double Capital) {
        this.Capital = Capital;
    }
    public void calculateMonthlyInt(){
        double interest= ((this.Capital*RocznaStopaProcentowa))/12;
        this.Capital=this.Capital+interest;
    }
    public static void setRocznaStopaProcentowa(double RocznaStopaProcentowa){
        RachunekBankowy.RocznaStopaProcentowa = RocznaStopaProcentowa;
    }
    public double getCapital(){
        return this.Capital;
    }
}
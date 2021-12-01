package pl.imiajd.aleksiejczyk;

import java.security.KeyStore;

public class Adres
{
    Adres( int kod_pocztowy,String miasto,int numer_domu,String ulica){
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
        this.numer_mieszkania="";
        this.numer_domu=numer_domu;
        this.ulica=ulica;
    }
    Adres(int kod_pocztowy,String miasto,int numer_domu,String numer_mieszkania,String ulica){
        this.kod_pocztowy=kod_pocztowy;
        this.miasto=miasto;
        this.numer_mieszkania=numer_mieszkania;
        this.numer_domu=numer_domu;
        this.ulica=ulica;
    }
    public void pokaz()
    {
        System.out.println(kod_pocztowy+", "+miasto);
        System.out.println(ulica+", "+numer_domu+", "+numer_mieszkania);

    }
    public int kod_pocztowy(){
        return kod_pocztowy;
    }
    public static boolean przed(int a,int b)
    {
        if (a<b){
            return true;
        }
        else{
            return false;
        }
    }
    private String ulica;
    private int numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

}
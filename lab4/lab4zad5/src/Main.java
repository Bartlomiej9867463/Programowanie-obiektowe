import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main
{

    public static void main(String[] args) {
        System.out.println(zad4(10));

    }
    public static BigInteger zad4(int n){
        n=n*n;
        BigInteger suma= new BigInteger("0");
        BigInteger jeden=new BigInteger("1");
        BigInteger dwa= new BigInteger("2");

        for (int i=1;i<=n;i++)
        {
            if(i==1){
                suma = suma.add(jeden);
            }
            else if(i==2){
                suma = suma.add(dwa);
            }
            else{
                suma = suma.multiply(dwa);
            }
        }
        return suma;
    }
}

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main
{

    public static void main(String[] args) {
        System.out.println(zad4(10,"0.02","1000.00"));

    }
    public static BigDecimal zad4(int n, String p, String k){
        BigDecimal P = new BigDecimal(p);
        BigDecimal K = new BigDecimal(k);
        for (int i=1;i<=n;i++)
        {
            K =K.add(K.multiply(P));
        }
        K = K.setScale(2, RoundingMode.CEILING);
    return K;
    }
}

import java.util.Arrays;
import java.util.Stack;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class zad7 {
    public static void main(String[] args) {
        sitko(100);
    }
    public static void sitko(int n) {
        List<Integer> pierwsze = new ArrayList<>();
        int x =2;
        int y;
        while (x<=n) {
            pierwsze.add(x);
            x++;
        }
        x=2;
        y=x;
        //System.out.println(Math.sqrt(n));
        while (x<=Math.sqrt(n)) {
            //System.out.println(x);
            while (y<=(n)) {
                y++;
                if (((y)%x)==0){
                    System.out.println(y);
                    pierwsze.removeAll(Arrays.asList(y));
                    }
            }
            x++;
            y=x;

        }
        System.out.println(pierwsze);
    }
}

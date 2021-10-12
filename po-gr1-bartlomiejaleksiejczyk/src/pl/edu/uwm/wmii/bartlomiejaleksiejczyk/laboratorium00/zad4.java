package pl.edu.uwm.wmii.bartlomiejaleksiejczyk.laboratorium00;

public class zad4 {
    public static void main ( String [] args )
    {
        int i, num=3;
        double perc=0.06, sum=1000;
        for(i=1;i<=num;++i)
        {
            sum=sum+(sum*perc);
            System .out. print ("saldo za rok ");
            System .out. print (i);
            System .out. print (" ");
            System .out. print (sum);
            System .out. print ("\n");
        }
    }
}
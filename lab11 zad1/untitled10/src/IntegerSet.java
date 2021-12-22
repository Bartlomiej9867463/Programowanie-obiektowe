import java.util.Arrays;
public class IntegerSet {
    public boolean[] IntSet=new boolean[99];
    public IntegerSet(){
        boolean[] IntSet = this.IntSet;
        Arrays.fill(IntSet, Boolean.FALSE);
    }
    public static IntegerSet union(boolean[] IntSet1,boolean[] IntSet2){
        IntegerSet wynik = new IntegerSet();
        for (int i=0; i<=98;i++) {
            if((IntSet1[i]==true)||(IntSet2[i]==true)){
                wynik.insertElement(i+1);
            }
        }
        return wynik;
    }
    public static IntegerSet intersection(boolean[] IntSet1,boolean[] IntSet2){
        IntegerSet wynik = new IntegerSet();
        for (int i=0; i<=98;i++) {
            if((IntSet1[i]==true)&&(IntSet2[i]==true)){
                wynik.insertElement(i+1);
            }
        }
        return wynik;
    }
    public void insertElement(int element){
        element-=1;
        for (int i=0; i<=99;i++) {
            if(i==element){
                (this.IntSet[i])=true;
            }
        }
    }
    public void deleteElement(int element){
        for (int i=0; i>=99;i++) {
            if(i==element){
                (this.IntSet[i])=false;
            }
        }
    }
    @Override
    public String toString(){
        String wynik ="";
        for (int i=0; i<=98;i++) {
            if((this.IntSet[i])==true)
            {
                //System.out.println(i+1);
                wynik+=((i+1)+" ");

            }
            }
        return wynik;
    }
    public static void equals(boolean[] IntSet1,boolean[] IntSet2){
        boolean[] wynik = new boolean[98];
        for (int i=0; i<=98;i++) {
            if((IntSet1[i]==IntSet2[i])&&(i==98)){
                System.out.println("zbiory są identyczne");
                break;
            }
            if((IntSet1[i]!=IntSet2[i])){
                System.out.println("zbiory nie są identyczne");
                break;
            }
        }
    }
}

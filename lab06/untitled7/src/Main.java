public class Main {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver1.setRocznaStopaProcentowa(0.04);
        saver2.setRocznaStopaProcentowa(0.04);
        System.out.println("Saver 1 " + saver1.getCapital());
        System.out.println("Saver 2 " + saver2.getCapital());
        saver1.calculateMonthlyInt();
        saver2.calculateMonthlyInt();
        System.out.println("Saver 1 " + saver1.getCapital());
        System.out.println("Saver 2 " + saver2.getCapital());
        IntegerSet zestaw1= new IntegerSet();
        IntegerSet zestaw2= new IntegerSet();
        System.out.println(zestaw1.toString());
        IntegerSet.equals(zestaw1.IntSet,zestaw2.IntSet);
        zestaw1.insertElement(4);
        IntegerSet.equals(zestaw1.IntSet,zestaw2.IntSet);
        System.out.println(zestaw1.toString());
        System.out.println(zestaw2.toString());
        System.out.println((IntegerSet.union(zestaw1.IntSet,zestaw2.IntSet)).toString());
        System.out.println((IntegerSet.intersection(zestaw1.IntSet,zestaw2.IntSet)).toString());
        zestaw2.insertElement(4);
        System.out.println((IntegerSet.intersection(zestaw1.IntSet,zestaw2.IntSet)).toString());
    }
}
package pl.imiajd.aleksiejczyk;

class NazwanyPunkt extends punkt
{
    NazwanyPunkt(int x, int y, String name){
        super(x,y);
        this.name=name;
    }
    public void show()
    {
        System.out.println(name+":<"+x()+","+y()+">");
    }
    private String name;
}
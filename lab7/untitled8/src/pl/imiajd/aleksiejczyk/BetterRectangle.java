package pl.imiajd.aleksiejczyk;
import java.awt.Rectangle;
class BetterRectangle extends Rectangle{
    BetterRectangle(int x, int y, int dlugosc,int szerokosc) {
        super(0, 0, 0, 0);
        setLocation(x, y);
        setSize(szerokosc, dlugosc);
    }
        public String toStirng(){
            return super.x + " " + super.y+ " " + super.width +" "+super.height;
        }
        public int getPerimeter(){
        return ((2*super.width)+(2*super.height));
        }
        public int getArea(){
        return(super.width*super.height);
        }


    private int x;
    private int y;
    private int dlugosc;
    private int szerokosc;
}
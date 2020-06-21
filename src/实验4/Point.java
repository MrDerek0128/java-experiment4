package 实验4;
import 实验2.Point1;

public class Point extends Point1{
    private int x;
    private int y;
    Point(){

    }

    Point(int x,int y){
        super(x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
          Point p=(Point) obj;
          return p.getX()==this.getX() && p.getY()==this.getY();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}

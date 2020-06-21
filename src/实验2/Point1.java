package 实验2;

public class Point1 {
    private int x;
    private int y;
    public Point1(){

    }
    public Point1(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(Point1 p){
        double d;
        int a=(p.getX()-this.x)*(p.getX()-this.x);
        int b=(p.getY()-this.y)*(p.getY()-this.y);
        d=Math.sqrt(a+b);
        return d;
    }
}

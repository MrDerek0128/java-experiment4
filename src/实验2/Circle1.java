package 实验2;

public class Circle1 {
    Point1 center=new Point1();
    private int radius;
    public Circle1(){

    }
    public Circle1(int xx,int yy,int r){
        this.center.setX(xx);
        this.center.setY(yy);
        this.radius=r;
    }

    public Circle1(Point1 center,int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int perimeter(int r){
        int p;
        p=(int)Math.PI*r*2;
        return p;
    }
    public double area(int r){
        double a;
        a=Math.PI*r*2;
        return a;
    }
    public int relation(Circle1 c){
        double d;
        d=this.center.distance(c.center);
        if (c.radius==this.radius && c.center.getX()==this.center.getX() && c.center.getY()==this.center.getY()) return 0;
        else if (c.center.getX()==this.center.getX() && c.center.getY()==this.center.getY()) return 1;
        else if(d>(c.radius+this.radius)) return 3;
        else if(d<=Math.abs(c.radius-this.radius)) return 4;
        else return 2;
    }
}

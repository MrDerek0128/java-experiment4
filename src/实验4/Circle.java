package 实验4;
import 实验2.Circle1;

@SuppressWarnings("all")
public class Circle extends Circle1{
    private Point center=new Point();
    private int radius;
    Circle(){
        super();
    }
    Circle(Point center,int r){
        super(center,r);
    }

    public boolean equals(Object obj){
        if(obj instanceof Circle){
            Circle c=(Circle)obj;
            return c.getCenter().equals(this.getCenter()) && c.getRadius()==this.getRadius();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + this.getCenter() +
                ", radius=" + this.getRadius() +
                '}';
    }

    @Override
    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}

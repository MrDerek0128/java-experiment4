package 实验2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Circle1 c1=new Circle1();
        System.out.println("请输入圆C1的圆心坐标x，y及其半径");
        Scanner input=new Scanner(System.in);
        c1.center.setX(input.nextInt());
        c1.center.setY(input.nextInt());
        c1.setRadius(input.nextInt());
        Circle1 c2=new Circle1();
        System.out.println("请输入圆C2的圆心坐标x，y及其半径");
        Scanner input2=new Scanner(System.in);
        c2.center.setX(input2.nextInt());
        c2.center.setY(input2.nextInt());
        c2.setRadius(input2.nextInt());
        System.out.println("C1周长为"+c1.perimeter(c1.getRadius())+"  面积为"+c1.area(c1.getRadius()));
        System.out.println("C2周长为"+c2.perimeter(c2.getRadius())+"  面积为"+c2.area(c2.getRadius()));
        System.out.println("两圆的关系为"+c2.relation(c1));
    }
}

package 实验4;
import  实验2.Point1;

import java.util.Scanner;

@SuppressWarnings("all")
public class test {
    public static void main(String[] args) {
        System.out.println("请输入圆1的圆心及半径");
        Scanner input=new Scanner(System.in);
        Circle c1=new Circle();
        c1.getCenter().setX(input.nextInt());
        c1.getCenter().setY(input.nextInt());
        c1.setRadius(input.nextInt());
        System.out.println(c1.toString());
        System.out.println("请输入圆2的圆心及半径");
        Scanner input1=new Scanner(System.in);
        Circle c2=new Circle();
        c2.getCenter().setX(input1.nextInt());
        c2.getCenter().setY(input1.nextInt());
        c2.setRadius(input1.nextInt());
        System.out.println(c2.toString());
        if(c1.equals(c2)){
            System.out.println("同一个圆");
        }
        else{
            System.out.println("不是同一个圆");
        }
    }
}

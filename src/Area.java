import java.util.Scanner;

public class Area {

    public double circle(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        float r = sc.nextFloat();
        return (3.14*r*r);
    }

    public double triangle(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Base and Height of Triangle");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        return (0.5*b*h);
    }

    public double rectangle(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        return (l*b);
    }

    public static void main(String[] args) {
        Area obj =  new Area();
//        Scanner sc  = new Scanner(System.in);
        System.out.println("Area Of Circle is "+obj.circle());
        System.out.println("Area Of Triangle is "+obj.triangle());
        System.out.println("Area Of Rectangle is "+obj.rectangle());
    }
}

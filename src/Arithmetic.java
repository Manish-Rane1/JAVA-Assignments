import java.util.Scanner;

public class Arithmetic { // + - * / %

    public int add(int a, int b)
    {
        return(a+b);
    }

    public int multiply(int a , int b)
    {
        return (a*b);
    }

    public float divide(float a , float b)
    {
        return (a/b);
    }

    public int  sub(int a , int b)
    {
        return (a-b);
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();

        System.out.println("Enter any two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Addition = " + obj.add(num1,num2));
        System.out.println("Subtraction = " + obj.sub(num1,num2));
        System.out.println("Multiplication = " + obj.multiply(num1,num2));
        System.out.println("Division = " + obj.divide(num1,num2));
    }
}
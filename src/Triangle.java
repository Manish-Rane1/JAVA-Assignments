import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter Three angles of triangle");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        if ((num1 + num2 + num3) == 180) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle");
        }
    }
}

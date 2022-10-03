import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("Enter the number of days");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = num1/30;
        System.out.println(num2 + " months and " + (num1-(num2*30)) +" days");
    }
}

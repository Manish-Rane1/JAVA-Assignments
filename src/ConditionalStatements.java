import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num2>num1){
            System.out.println(num2 + " is the greater number");
        } else {
            System.out.println(num1 + " is the greater number");
        }
    }
}

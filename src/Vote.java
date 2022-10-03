import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1>=18){
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }
}

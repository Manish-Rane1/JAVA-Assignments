import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Enter the number of items");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the price of item");
        int price = sc.nextInt();
        int total = num*price;
        if (num>=10){
            System.out.println("Total amount to be paid is " + (total-(total*0.1)));
        } else {
            System.out.println("Total amount to be paid is " + total);
        }
    }
}

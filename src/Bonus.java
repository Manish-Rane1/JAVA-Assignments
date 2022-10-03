import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        System.out.println("Enter your basic salary");
        Scanner sc = new Scanner(System.in);
        float sal = sc.nextFloat();
        double ta = sal*0.1;
        double da = sal*0.15;
        double hra = sal*0.2;
        double pf = sal*0.12;
        double bonus;
        if (sal>=20000){
            bonus= sal*0.1;
        } else {
            bonus = sal*0.2;
        }
        double gross = (sal+ta+da+hra+bonus)-pf;
        System.out.println("Gross salary is "+gross);
    }
}

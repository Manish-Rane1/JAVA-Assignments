import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        System.out.println("Are you married ?");
        Scanner sc = new Scanner(System.in);
        String married = sc.next();
        if (married.equals("yes")) {
            System.out.println("you are insured by the company");
        } else {
            System.out.println("what is your age ?");
            int age = sc.nextInt();
            if (age>30){
                System.out.println("you are insured by the company");
            } else {
                if (age>25){
                    System.out.println("Are you a female ?");
                    String gender = sc.next();
                    if(gender.equals("yes")){
                        System.out.println("you are insured by the company");
                    } else {
                        System.out.println("you are not insured by the company");
                    }
                } else {
                    System.out.println("you are not insured by the company");
                }
            }
        }
    }
}

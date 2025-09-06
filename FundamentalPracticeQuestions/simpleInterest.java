import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest (in %):");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period (in years):");
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: Rs " + interest);
        sc.close();
    
    }
}
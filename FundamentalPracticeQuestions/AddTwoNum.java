import java.util.*;
public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers to add");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum  );
        sc.close();
    }
    
}

import java.util.*;

public class CelsiusFarenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        int cel = sc.nextInt();

        double farenheit = (cel * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + farenheit + "°F");
        sc.close();
    }
    
}

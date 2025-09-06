import java.util.*;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = sc.nextDouble();
        double vol = Math.PI * rad * rad * height;
        System.out.println("Volume of the cylinder: " + vol);
        sc.close();
    }
    
}

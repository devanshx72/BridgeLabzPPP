import java.util.*;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double length, width;
        System.out.println("Enter the length of the rectangle:");
        length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        sc.close();
    }
}

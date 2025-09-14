package Level1;

import java.util.Scanner;

class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // may throw exception
        System.out.println("Converted: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        // generateException(text);
        handleException(text);
    }
}

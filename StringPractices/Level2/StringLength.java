package Level2;

import java.util.Scanner;

class StringLength {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int userDefined = getLength(text);
        int builtIn = text.length();

        System.out.println("Length using custom method: " + userDefined);
        System.out.println("Length using built-in method: " + builtIn);
    }
}

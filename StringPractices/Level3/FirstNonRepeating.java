package Level3;

import java.util.Scanner;

class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) return str.charAt(i);
        }
        return '\0'; // no non-repeating
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char result = findFirstNonRepeating(text);
        if (result == '\0') System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + result);
    }
}

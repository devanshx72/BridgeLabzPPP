package Level3;

import java.util.Scanner;

class AnagramCheck {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freqA = new int[256];
        int[] freqB = new int[256];

        for (int i = 0; i < a.length(); i++) {
            freqA[a.charAt(i)]++;
            freqB[b.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freqA[i] != freqB[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String s2 = sc.nextLine();

        System.out.println("Anagram? " + isAnagram(s1, s2));
    }
}

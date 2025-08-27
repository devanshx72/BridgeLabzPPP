package Level3;

import java.util.Scanner;

class PalindromeCheck {
    // Logic 1: Two-pointer iterative
    public static boolean isPalindromeTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Logic 2: Recursive
    public static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRecursive(s, i + 1, j - 1);
    }

    // Helper: reverse using charAt()
    public static char[] reverseUsingCharAt(String s) {
        int n = s.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) rev[i] = s.charAt(n - 1 - i);
        return rev;
    }

    // Logic 3: Compare arrays (original vs reversed)
    public static boolean isPalindromeArrayCompare(String s) {
        char[] a = s.toCharArray();
        char[] r = reverseUsingCharAt(s);
        if (a.length != r.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != r[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean l1 = isPalindromeTwoPointer(text);
        boolean l2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean l3 = isPalindromeArrayCompare(text);

        System.out.println("Two-pointer    : " + l1);
        System.out.println("Recursive      : " + l2);
        System.out.println("Array-compare  : " + l3);
    }
}

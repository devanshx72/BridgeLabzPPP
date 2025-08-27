package Level3;

import java.util.Scanner;

class UniqueCharacters {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    public static char[] findUnique(String str) {
        int len = getLength(str);
        char[] uniques = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (uniques[j] == c) { found = true; break; }
            }
            if (!found) uniques[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = uniques[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) System.out.print(c + " ");
    }
}


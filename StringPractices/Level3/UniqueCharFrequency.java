package Level3;

import java.util.Scanner;

class UniqueCharFrequency {
    // Get unique characters usng nested loops (order of first appearance)
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] uniques = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < k; j++) {
                if (uniques[j] == c) { seen = true; break; }
            }
            if (!seen) uniques[k++] = c;
        }
        char[] trimmed = new char[k];
        for (int i = 0; i < k; i++) trimmed[i] = uniques[i];
        return trimmed;
    }

    // Build full ASCII frequency table once
    public static int[] frequencyTable(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }

    // Return 2D array: [uniqueCount][2] -> {character, frequency}
    public static String[][] uniqueFrequency(String text) {
        char[] uniques = uniqueCharacters(text);
        int[] freq = frequencyTable(text);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Char\tFreq");
        for (String[] row : data) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        display(uniqueFrequency(text));
    }
}

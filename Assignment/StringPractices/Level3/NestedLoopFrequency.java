package Level3;

import java.util.Scanner;

class NestedLoopFrequency {
    // Returns "char:count" entries for each distinct char in order of first appearance
    public static String[] frequencyWithNestedLoops(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;

        int[] freq = new int[n];
        // Copy to mutate for duplicate marking
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) arr[i] = chars[i];

        int distinct = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '\0') continue; // already counted
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    arr[j] = '\0'; // mark duplicate so it's not counted again
                }
            }
            freq[i] = count;
            distinct++;
        }

        String[] out = new String[distinct];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != '\0') {
                out[k++] = String.valueOf(arr[i]) + ":" + freq[i];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] rows = frequencyWithNestedLoops(text);
        System.out.println("Char\tFreq");
        for (String s : rows) {
            int idx = s.lastIndexOf(':');
            System.out.println(s.substring(0, idx) + "\t" + s.substring(idx + 1));
        }
    }
}

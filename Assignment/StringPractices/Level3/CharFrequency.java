package Level3;

import java.util.Scanner;

class CharFrequency {
    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        String[][] result = new String[str.length()][2];
        boolean[] visited = new boolean[256];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!visited[c]) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                visited[c] = true;
                idx++;
            }
        }

        String[][] trimmed = new String[idx][2];
        for (int i = 0; i < idx; i++) trimmed[i] = result[i];
        return trimmed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);
        System.out.println("Char\tFreq");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}

package Level2;

import java.util.Scanner;

class ShortestLongest {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        findShortestLongest(words);
    }
}

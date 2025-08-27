package Level2;

import java.util.Scanner;

class VowelConsonantType {
    public static String getCharType(char c) {
        if (!Character.isLetter(c)) return "Not a Letter";
        c = Character.toLowerCase(c);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }

    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = getCharType(c);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        display(result);
    }
}


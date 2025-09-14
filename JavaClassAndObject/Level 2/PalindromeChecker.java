public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String s = text.replaceAll("\\s", "").toLowerCase();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Palindrome: " + isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("madam");
        pc.displayResult();
    }
}

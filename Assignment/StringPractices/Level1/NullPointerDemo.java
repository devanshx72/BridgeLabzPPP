package Level1;
class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
        }
    }

    public static void main(String[] args) {
        // Uncomment to generate exception
        generateException();
        handleException();
    }
}

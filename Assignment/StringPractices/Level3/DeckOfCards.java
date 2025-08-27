package Level3;

import java.util.Scanner;

class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String rank : ranks) {
            for (String suit : suits) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed!");
            return new String[0][0];
        }
        int perPlayer = n / players;
        String[][] distributed = new String[players][perPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < perPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    public static void display(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] result = distribute(deck, n, players);
        if (result.length > 0) display(result);
    }
}

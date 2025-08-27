package Level2;

import java.util.Scanner;

class RockPaperScissors {
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0; // tie
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return 1; // user wins
        return -1; // computer wins
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("Round " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            int result = findWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            if (result == 0) System.out.println("It's a Tie!");
            else if (result == 1) { System.out.println("You Win!"); userWins++; }
            else { System.out.println("Computer Wins!"); compWins++; }
        }

        System.out.println("\nFinal Results:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        double userPct = (userWins * 100.0) / games;
        double compPct = (compWins * 100.0) / games;
        System.out.printf("User Win %%: %.2f | Computer Win %%: %.2f\n", userPct, compPct);
    }
}

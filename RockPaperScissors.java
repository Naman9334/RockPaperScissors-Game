import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME!!!");
        System.out.println("The rules are simple:");
        System.out.println("* Rock beats scissors.");
        System.out.println("* Paper beats rock.");
        System.out.println("* Scissors beats paper.");

        
        System.out.println("What is your choice? (Rock, Paper, or Scissors)");
        String playerChoice = scanner.nextLine().toLowerCase();

        
        String computerChoice = getRandomChoice();

        
        System.out.println("The Player chose " + playerChoice);
        System.out.println("The Computer chose " + computerChoice);

        
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Match DRAW!");
        } 
        else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("The Player WINS!");
        } else {
            System.out.println("The Computer WINS!");
        }

        scanner.close(); 
    }

    private static String getRandomChoice() {
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static boolean resetTheGame(int[] arr, int i, Scanner scanner) {
		System.out.println("Game is over");
		printScores(arr);
		System.out.println("Do you want to play again? Print \"yes\" or  \"y\"");
		String answer = scanner.nextLine();
		if (!answer.toLowerCase().equals("yes") || !answer.toLowerCase().equals("y")) {
			return false;
		}
		return true;
	}

	public static int updateScore() {
		int score = rollingDice();
		System.out.println("You got " + score + " points");
		if (score == 1) {
			return 0;
		}
		return score;
	}

	public static int rollingDice() {
		return (new Random().nextInt(6) + 1);
	}

	public static void checkPlayers(int numberOfPlayers) {
		if (numberOfPlayers < 2 || numberOfPlayers > 4) {
			throw new RuntimeException("You entered ivalid number of players");
		}
	}

	public static void printScores(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Player number " + (i + 1) + " got " + arr[i]);
		}

	}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number of player, it shouldn't be less than 2 and more than 4");
		int numberOfPlayers = Integer.parseInt(args[0]);		
		int turn = 0;

		checkPlayers(numberOfPlayers);
		int[] arr = new int[numberOfPlayers];
//		int[] scores = new int[numberOfPlayers];
		int currentScore = 0;
		end:while (true) {
			System.out.println("Player number: " + (turn + 1) + " Your current score is " + currentScore+ ", your total score is "+ arr[turn]
					+ " print your command: ROLL, HOLD, QUIT or PRINT");
			String command = scanner.next();
			switch (command) {
			case "HOLD":
				arr[turn] = arr[turn] + currentScore;
				currentScore = 0;
				turn++;
				break;
			case "ROLL":
				int score = updateScore();
				currentScore+=score;
				if (score == 0) {
					System.out.println("You lost current score "+currentScore+ ", your total score is "+arr[turn]);
					currentScore = 0;
					turn++;
				}
				break;
			case "QUIT":
				break end;
			case "PRINT":
				printScores(arr);
				break;
			default:
				System.out.println("You entered invalid command, please enter a valid command");
				break;
			}
			if (turn == arr.length) {
				turn = 0;
			}
			if ((arr[turn]+currentScore) >= 100) {
				if(! resetTheGame(arr, turn, scanner))
					break end;
			}

		}
		System.out.println("Exit the game");

	}

}

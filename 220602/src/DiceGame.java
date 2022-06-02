import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	int diceFace;
	int userGuess;

	private void rollDice() {
		Random random = new Random();
		// diceFace = (int) (Math.random() * 6) + 1;
		diceFace = random.nextInt(6) + 1; // diceface는 random값을 가진다.
	}

	private int getUserInput(String prompt) {// 예상값을 입력하시오 라는 것이 파라미터
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();

	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다.");
			return true;
		} else {
			System.out.println("틀렸습니다. ");
			return false;
		}
	}

	public void startPlaying() {
		while (true) {
			userGuess = getUserInput("예상값을 입력하시오: ");
			rollDice();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}

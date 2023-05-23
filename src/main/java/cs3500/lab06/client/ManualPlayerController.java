package cs3500.lab06.client;

import java.util.Scanner;

public class ManualPlayerController implements PlayerController {
  Scanner sc;

  public ManualPlayerController(Readable in) {
    this.sc = new Scanner(in);
  }

  /**
   * The player must make a guess from 0 to 100 and is provided no hints.
   *
   * @return the player's guess
   */
  @Override
  public int guess() {
    if (sc.hasNextInt()) {
      return sc.nextInt();
    }
    return -1;
  }

  /**
   * The player must make a guess from 0 to 100. The player is also given a hint as to if their
   * last guess was too high.
   *
   * @param lastGuessWasTooHigh true if the previous guess was too high
   * @return the player's guess
   */
  @Override
  public int guess(boolean lastGuessWasTooHigh) {
    if (sc.hasNextInt()) {
      String hint = lastGuessWasTooHigh ? "high" : "low";
      System.out.println("That number was a bit too " + hint + ". Guess again:");

      return sc.nextInt();
    }
    return -1;
  }

  /**
   * The player is told whether it won the game or lost the game.
   *
   * @param isWinner if the player won
   */
  @Override
  public void win(boolean isWinner) {
    if (isWinner) {
      System.out.println("Congratulations! You guessed the number!");
      return;
    }
    System.out.println("Oh no! You did not guess the right number.");
  }
}

import java.util.Scanner;

public class Player {
  private char[] guess;

  public Player() {
    guess = new char[4];
  }

  public char[] getGuess() {
    return guess;
  }

  public String toString() {
    return new String(guess);
  }

  public void makeGuess() {
    boolean validGuess = false;
    Scanner s = new Scanner(System.in);

    while (validGuess == false) {
      System.out.print("YOUR GUESS=> ");
      String promptValue = s.next();
      if (promptValue.length() < 4)
        System.out.println("Too short!");
      else if (promptValue.length() > 4)
        System.out.println("Too long!");
      else {
        guess = promptValue.toCharArray();
        validGuess = true;
        if (!(guess[0] == 'A' || guess[0] == 'B' || guess[0] == 'C' || guess[0] == 'D')) {
          System.out.println("First letter must be A, B, C, or D");
          validGuess = false;
        }
        if (!(guess[1] == 'A' || guess[1] == 'B' || guess[1] == 'C' || guess[1] == 'D')) {
          System.out.println("Second letter must be A, B, C, or D");
          validGuess = false;
        }
        if (!(guess[2] == 'A' || guess[2] == 'B' || guess[2] == 'C' || guess[2] == 'D')) {
          System.out.println("Third letter must be A, B, C, or D");
          validGuess = false;
        }
        if (!(guess[3] == 'A' || guess[3] == 'B' || guess[3] == 'C' || guess[3] == 'D')) {
          System.out.println("Fourth letter must be A, B, C, or D");
          validGuess = false;
        }
      }
      if (validGuess == false)
        System.out.println("INVALID TRY - PLEASE GUESS AGAIN!!");

    }

  }

}

import java.util.Scanner;
import java.util.Random;

public class AlphaCodeBreaker {
  public static void main(String[] args) {
    System.out.println("WELCOME TO CODEBREAKER...Let's Play!\n");
    System.out.println("Guess a 4-letter code with letters A, B, C, and D\n");

    char[] code = getCode();

    boolean solved = false;
    while (solved == false) {
      char[] guess = getGuess();
      solved = compare(code, guess);
      if (solved) {
        System.out.println("\nGOT IT!!\n");
        break;
      } else
        System.out.println("\nMISSED! PLEASE TRY AGAIN...\n");
    }

  }

  public static char[] getCode() {
    Random r = new Random();
    char[] values = new char[4];
    char[] possibles = { 'A', 'B', 'C', 'D' };

    values[0] = possibles[r.nextInt(4)];
    values[1] = possibles[r.nextInt(4)];
    values[2] = possibles[r.nextInt(4)];
    values[3] = possibles[r.nextInt(4)];
    return values;

  }

  public static void displayCode(int[] passedArray) {
    for (int x : passedArray)
      System.out.print(x + " ");

  }

  public static char[] getGuess() {
    boolean validGuess = false;
    char[] guess = new char[4];
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

    return guess;

  }

  public static boolean compare(char[] theCode, char[] theGuess) {
    int rightCount = 0;

    if (theCode[0] == theGuess[0])
      rightCount++;
    if (theCode[1] == theGuess[1])
      rightCount++;
    if (theCode[2] == theGuess[2])
      rightCount++;
    if (theCode[3] == theGuess[3])
      rightCount++;
    if (rightCount < 4) {
      System.out.println("Guessed " + rightCount + " out of 4");
      return false;
    } else
      return true;

  }

}

import java.util.Scanner;
import java.util.Random;

public class CodeBreaker {

  public static void main(String[] args) {
    System.out.println("WELCOME TO CODEBREAKER...Let's Play!\n");
    System.out.println("Guess a 4-digit code with digits 1, 2, 3, and 4\n");

    int[] code = getCode();

    boolean solved = false;
    while (solved == false) {
      int[] guess = getGuess();
      solved = compare(code, guess);
      if (solved) {
        System.out.println("\nGOT IT!!\n");
        break;
      } else
        System.out.println("\nTRY AGAIN...\n");
    }
  }

  public static int[] getCode() {
    Random r = new Random();
    int[] values = new int[4];
    values[0] = r.nextInt(4) + 1;
    values[1] = r.nextInt(4) + 1;
    values[2] = r.nextInt(4) + 1;
    values[3] = r.nextInt(4) + 1;
    return values;
  }

  public static void displayCode(int[] passedArray) {
    for (int x : passedArray)
      System.out.print(x + " ");
  }

  public static int[] getGuess() {
    Scanner s = new Scanner(System.in);
    int promptValue = 0;
    while (promptValue < 1111 || promptValue > 4444) {
      System.out.print("Guess : ");
      promptValue = s.nextInt();
      if (promptValue < 1000 || promptValue > 9999)
        System.out.println("INVALID VALUE. Please enter a four digit number.");
      else if (promptValue >= 1111 && promptValue <= 4444)
        break;
      else
        System.out.println("INVALID VALUE. Only use digits 1, 2, 3, or 4");
    }

    int a = promptValue;
    int b = promptValue % 1000;
    int c = promptValue % 100;
    int d = promptValue % 10;

    int[] temp = new int[4];

    temp[0] = (a - b) / 1000;
    temp[1] = (b - c) / 100;
    temp[2] = (c - d) / 10;
    temp[3] = d;

    return temp;
  }

  public static boolean compare(int[] theCode, int[] theGuess) {
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

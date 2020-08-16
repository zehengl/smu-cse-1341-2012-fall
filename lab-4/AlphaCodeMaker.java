import java.util.Scanner;
import java.util.Random;

public class AlphaCodeMaker {

  public static void main(String[] args) {
    char[] code = getCode();
    displayCode(code);
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

  public static void displayCode(char[] passedArray) {
    for (char x : passedArray)
      System.out.print(x + " ");

  }
}

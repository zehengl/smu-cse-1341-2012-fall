import java.util.Scanner;
import java.util.Random;

public class CodeMaker {

  public static void main(String[] args) {
    int[] code = getCode();
    displayCode(code);
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
}

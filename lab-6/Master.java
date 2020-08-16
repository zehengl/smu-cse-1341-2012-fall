import java.util.Random;

public class Master {
  private char[] code;

  public Master() {
    code = new char[4];
  }

  public String toString() {
    return "CODE: " + new String(code);
  }

  public void createCode() {
    Random r = new Random();
    char[] possibles = { 'A', 'B', 'C', 'D' };

    code[0] = possibles[r.nextInt(4)];
    code[1] = possibles[r.nextInt(4)];
    code[2] = possibles[r.nextInt(4)];
    code[3] = possibles[r.nextInt(4)];
  }

  public int totalCorrect(char[] theGuess) {
    int rightCount = 0;
    if (code[0] == theGuess[0])
      rightCount++;
    if (code[1] == theGuess[1])
      rightCount++;
    if (code[2] == theGuess[2])
      rightCount++;
    if (code[3] == theGuess[3])
      rightCount++;
    return rightCount;

  }

}

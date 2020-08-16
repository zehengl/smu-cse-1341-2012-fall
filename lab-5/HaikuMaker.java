import java.util.Random;
import java.util.Scanner;

public class HaikuMaker {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int y;
    String[] adj1 = { "strange", "hot", "old", "young", "wet" };
    String[] noun1 = { "dog", "cat", "boy", "girl", "mouse" };
    String[] verb1 = { "crawling", "driving", "walking", "running", "sleeping" };

    String[] adj2 = { "dangerous", "amorous", "delicious", "colorful", "wonderful" };
    String[] adj3 = { "slimy", "oozing", "artful", "snarky", "moldy" };
    String[] noun2 = { "friend", "food", "pet", "thing", "skunk" };

    String[] exclamation = { "Yes!", "No!", "Darn!", "Drat!", "Yikes!" };

    while (true) {
      System.out.print("\nWANT A HAIKU? (Y/N) : ");
      if (s.next().equals("N"))
        break;

      System.out.print("\nThe ");
      y = r.nextInt(5);
      System.out.print(adj1[y] + " ");
      y = r.nextInt(5);
      System.out.print(noun1[y] + " ");
      y = r.nextInt(5);
      System.out.print(verb1[y] + "\n");

      y = r.nextInt(5);
      System.out.print(adj2[y] + " ");
      y = r.nextInt(5);
      System.out.print(adj3[y] + " ");
      y = r.nextInt(5);
      System.out.print(noun2[y] + "\n");

      y = r.nextInt(5);
      System.out.print(exclamation[y] + " ");
      y = r.nextInt(5);
      System.out.print(adj1[y] + " ");
      y = r.nextInt(5);
      System.out.print(noun1[y] + " ");
      y = r.nextInt(5);
      System.out.print(verb1[y] + "\n");
    }
    System.out.println("\nI hope you enjoyed the Haiku!");

  }
}

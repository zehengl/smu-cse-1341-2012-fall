import java.util.Scanner;

public class MyFirstProgram {
  public static void main(String[] args) {
    System.out.println("Hello again");
    System.out.print("How old are you? ");

    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    System.out.println();
    System.out.printf("I am %d years old\n", x);

    if (x % 2 == 0)
      System.out.println("Even!");
    else
      System.out.println("Odd!");

    System.out.println("Next year you will be " + ++x);
  }
}

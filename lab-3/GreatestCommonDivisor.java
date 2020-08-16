import java.util.Scanner;

public class GreatestCommonDivisor {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);

      int num1;
      int num2;

      System.out.print("Enter first number (-1 to exit): ");
      num1 = input.nextInt();

      while (num1 != -1) {
         System.out.print("Enter second number: ");
         num2 = input.nextInt();

         System.out.printf("GCD is: %d\n\n", gcd(num1, num2));

         System.out.print("Enter first number (-1 to exit): ");
         num1 = input.nextInt();
      }
   }

   public static int gcd(int x, int y) {
      int mod;

      while (y != 0) {
         mod = x % y;
         x = y;
         y = mod;
      }

      return x;
   }
}

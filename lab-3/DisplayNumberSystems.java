import java.util.Scanner;

public class DisplayNumberSystems {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter decimal value to display to: ");
    int valueToDisplayTo = input.nextInt();

    System.out.printf("%-8s%-12s%-8s%-8s\n", "Decimal", "Binary", "Octal", "Hexadecimal");

    for (int i = 1; i <= valueToDisplayTo; i++) {
      String binary = convertToBinary(i);
      String octal = convertToOctal(i);
      String hexadecimal = convertToHex(i);

      System.out.printf("%-8d%-12s%-8s%-8s\n", i, binary, octal, hexadecimal);
    }
  }

  public static String convertToBinary(int decimal) {
    String binary = "";

    while (decimal >= 1) {
      int value = decimal % 2;
      binary = value + binary;
      decimal /= 2;
    }
    return binary;
  }

  public static String convertToOctal(int decimal) {
    String octal = "";

    while (decimal >= 1) {
      int value = decimal % 8;
      octal = value + octal;
      decimal /= 8;
    }
    return octal;
  }

  public static String convertToHex(int decimal) {
    String hexadecimal = "";

    while (decimal >= 1) {
      int value = decimal % 16;

      switch (value) {
        case 10:
          hexadecimal = "A" + hexadecimal;
          break;
        case 11:
          hexadecimal = "B" + hexadecimal;
          break;
        case 12:
          hexadecimal = "C" + hexadecimal;
          break;
        case 13:
          hexadecimal = "D" + hexadecimal;
          break;
        case 14:
          hexadecimal = "E" + hexadecimal;
          break;
        case 15:
          hexadecimal = "F" + hexadecimal;
          break;
        default:
          hexadecimal = value + hexadecimal;
          break;
      }

      decimal /= 16;
    }
    return hexadecimal;
  }
}

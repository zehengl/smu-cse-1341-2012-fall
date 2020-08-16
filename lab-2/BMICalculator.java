import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int weight;
    int height;
    int bmi;

    System.out.println("Welcome to the body mass index (BMI) calculator");
    System.out.print("Enter your weight in pounds: ");
    weight = input.nextInt();
    System.out.print("Enter your height in inches: ");
    height = input.nextInt();

    bmi = (weight * 703) / (height * height);

    System.out.printf("Your BMI is: %d\n\n", bmi);
    System.out.println("BMI VALUES");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal:      between 18.5 and 24.9");
    System.out.println("Overweight:  between 25 and 29.9");
    System.out.println("Obese:       30 or greater");
  }
}

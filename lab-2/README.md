# lab-2

## BMI Calculator

Write a program called `BMICalculator` (BMICalculator.java) that will calculate the body mass index (BMI) based on the weight in pounds and height for an individual.
The program will prompt the user for the weight and height in inches.
Use integer arithmetic to truncate to the whole number.
One formula for calculating the BMI is:

BMI = (weightInPounds \* 703) / (heightInInches \* heightInInches)

Sample Run:

```
Welcome to the body mass index (BMI) calculator
Enter your weight in pounds: 150
Enter your height in inches: 65
Your BMI is: 24

BMI VALUES
Underweight: less than 18.5
Normal:      between 18.5 and 24.9
Overweight:  between 25 and 29.9
Obese:       30 or greater
```

## Simple Palindrome

Write a program called `SimplePalindrome` (SimplePalindrome.java) that will enter a sequence of 5 numbers and tell if it is a Palindrome (reference
https://en.wikipedia.org/wiki/Palindrome).
A Palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either direction, with general allowances for adjustments to punctuation and word dividers.

Sample Run:

```
Enter a 5-digit number: 10010
10010 is not a palindrome.
```

```
Enter a 5-digit number: 12321
12321 is a palindrome!!!
```

## Display a Diamond

Write a program called `PrintDiamond` (PrintDiamond.java) that will prints/displays a diamond shape using asterisks (\*).
The program will read in an odd number in the range 1 to 25 to specify the number of rows in the diamond.
The program will then display a diamond of the appropriate size.

Sample Run:

```
Enter number of rows (odd number 1 to 25): 21
          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
*********************
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
```

---

## Compile and Run

### BMICalculator

    javac BMICalculator.java
    java BMICalculator

### PrintDiamond

    javac PrintDiamond.java
    java PrintDiamond

### SimplePalindrome

    javac SimplePalindrome.java
    java SimplePalindrome
